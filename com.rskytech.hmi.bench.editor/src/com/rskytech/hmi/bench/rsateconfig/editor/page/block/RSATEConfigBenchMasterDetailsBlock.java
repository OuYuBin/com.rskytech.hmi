package com.rskytech.hmi.bench.rsateconfig.editor.page.block;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import com.rskytech.hmi.bench.rsateconfig.editor.model.Bench;
import com.rskytech.hmi.bench.rsateconfig.editor.model.manager.RSATEConfigModelManager;
import com.rskytech.hmi.bench.rsateconfig.editor.page.block.provider.RSATEConfigContentProvider;
import com.rskytech.hmi.bench.rsateconfig.editor.page.block.provider.RSATEConfigLabelProvider;
import com.rskytech.hmi.bench.rsateconfig.editor.page.provider.RSATEConfigDetailPageProvider;
import com.rskytech.hmi.common.editor.page.IRskyCommonFormPage;
import com.rskytech.hmi.common.editor.page.block.AbstractRskyCommonMasterDetailsBlock;

/**
 * 硬件资源节点概览
 * 
 * @author robin
 * 
 */
public class RSATEConfigBenchMasterDetailsBlock extends
		AbstractRskyCommonMasterDetailsBlock {

	RSATEConfigDetailPageProvider rsATEConfigDetailPageProvider;

	public RSATEConfigBenchMasterDetailsBlock(
			IRskyCommonFormPage rskyCommonFormPage) {
		super(rskyCommonFormPage);
		this.rsATEConfigDetailPageProvider = new RSATEConfigDetailPageProvider();
	}

	@Override
	protected void createMasterPart(final IManagedForm managedForm,
			Composite parent) {
		FormToolkit formToolkit = managedForm.getToolkit();
		Section section = formToolkit.createSection(parent, Section.EXPANDED
				| Section.TITLE_BAR);
		section.setText("硬件资源列表");
		section.clientVerticalSpacing = 0;
		section.marginWidth = 5;
		section.marginHeight = 5;

		Composite composite = formToolkit.createComposite(section, SWT.WRAP);
		GridLayout gridLayout = new GridLayout();
		//gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 2;
		// gridLayout.verticalSpacing = 0;
		// gridLayout.horizontalSpacing = 0;
		composite.setLayout(gridLayout);
		formToolkit.paintBordersFor(composite);
		// --搜索
		final Text searchText = formToolkit.createText(composite, "",
				SWT.BORDER | SWT.SEARCH | SWT.ICON_SEARCH | SWT.CANCEL);
		searchText.setMessage("搜索: 资源");
		searchText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

		Tree tree = formToolkit.createTree(composite, SWT.FULL_SELECTION);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.widthHint = 20;
		gridData.heightHint = 20;
		tree.setLayoutData(gridData);

		TreeViewer treeViewer = new TreeViewer(tree);
		treeViewer.setContentProvider(new RSATEConfigContentProvider());
		treeViewer.setLabelProvider(new RSATEConfigLabelProvider());
		// --构建用户易于理解和正确描述的结构
		Resource resource = this.getRskyCommonFormPage().getResource();
		Object object = resource.getContents().get(0);
		Bench bench = RSATEConfigModelManager.createBench((EObject) object);
		List list = new ArrayList();
		list.add(bench);
		treeViewer.setInput(list);
		treeViewer.expandToLevel(3);

		final SectionPart sectionPart = new SectionPart(section);
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				managedForm.fireSelectionChanged(sectionPart,
						event.getSelection());

			}
		});

		section.setClient(composite);
		managedForm.addPart(sectionPart);
	}

	@Override
	public void createContent(IManagedForm managedForm, Composite parent) {
		super.createContent(managedForm, parent);
		this.sashForm.setWeights(new int[] { 40, 60 });
	}

	@Override
	protected void registerPages(DetailsPart detailsPart) {
		detailsPart.setPageProvider(rsATEConfigDetailPageProvider);
	}

	@Override
	protected void createToolBarActions(IManagedForm managedForm) {

	}

}
