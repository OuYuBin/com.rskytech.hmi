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
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
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
import com.rskytech.hmi.bench.rsateconfig.editor.page.block.provider.RSATEConfigStyledLabelProvider;
import com.rskytech.hmi.bench.rsateconfig.editor.page.block.provider.RSATEConfigStyledCellLabelProvider;
import com.rskytech.hmi.bench.rsateconfig.editor.page.decorator.RSATEConfigModelLabelDecorator;
import com.rskytech.hmi.bench.rsateconfig.editor.page.provider.RSATEConfigDetailPageProvider;
import com.rskytech.hmi.common.editor.page.IRskyCommonFormPage;
import com.rskytech.hmi.common.editor.page.block.AbstractRskyCommonMasterDetailsBlock;

/**
 * 硬件资源节点概览
 * 
 * @author robin
 *
 */
public class RSATEConfigBenchMasterDetailsBlock extends AbstractRskyCommonMasterDetailsBlock {

	RSATEConfigDetailPageProvider rsATEConfigDetailPageProvider;

	public RSATEConfigBenchMasterDetailsBlock(IRskyCommonFormPage rskyCommonFormPage) {
		super(rskyCommonFormPage);
		this.rsATEConfigDetailPageProvider = new RSATEConfigDetailPageProvider();
	}

	@Override
	protected void createMasterPart(final IManagedForm managedForm, Composite parent) {
		FormToolkit formToolkit = managedForm.getToolkit();
		Section section = formToolkit.createSection(parent, Section.EXPANDED | Section.TITLE_BAR);
		section.setText("硬件资源列表");
		section.clientVerticalSpacing = 0;
		section.marginWidth = 5;
		section.marginHeight = 5;

		Composite composite = formToolkit.createComposite(section, SWT.BORDER);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		// gridLayout.verticalSpacing = 0;
		// gridLayout.horizontalSpacing = 0;
		composite.setLayout(gridLayout);

		// --搜索
		final Text searchText = formToolkit.createText(composite, "",
				SWT.BORDER | SWT.SEARCH | SWT.ICON_SEARCH | SWT.CANCEL);
		searchText.setMessage("搜索: 资源");
		searchText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		searchText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent keyEvent) {
				if (keyEvent.keyCode == SWT.ESC) {
					// hostConfigFilter.setFilterText("");
				} else {
					// hostConfigFilter.setFilterText(searchText.getText());
				}
				// treeViewer.refresh();
				// treeViewer.expandToLevel(2);
			}
		});

		Tree tree = new Tree(composite, SWT.FULL_SELECTION);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.widthHint = SWT.DEFAULT;
		gridData.heightHint = SWT.DEFAULT;
		tree.setLayoutData(gridData);

		TreeViewer treeViewer = new TreeViewer(tree);
		treeViewer.setContentProvider(new RSATEConfigContentProvider());
		RSATEConfigStyledLabelProvider rsATEConfigLabelProvider = new RSATEConfigStyledLabelProvider();
		RSATEConfigModelLabelDecorator rsATEConfigModelLabelDecorator = new RSATEConfigModelLabelDecorator();
		treeViewer.setLabelProvider(
				new RSATEConfigStyledCellLabelProvider(rsATEConfigLabelProvider, rsATEConfigModelLabelDecorator, null));
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
				managedForm.fireSelectionChanged(sectionPart, event.getSelection());

			}
		});

		section.setClient(composite);
		managedForm.addPart(sectionPart);
	}

	@Override
	public void createContent(IManagedForm managedForm, Composite parent) {
		super.createContent(managedForm, parent);
		this.sashForm.setWeights(new int[] { 35, 65 });
	}

	@Override
	protected void registerPages(DetailsPart detailsPart) {
		detailsPart.setPageProvider(rsATEConfigDetailPageProvider);
	}

	@Override
	protected void createToolBarActions(IManagedForm managedForm) {

	}

}
