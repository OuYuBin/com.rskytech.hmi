package com.rskytech.hmi.icd.model.editor.page.block;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import com.rskytech.hmi.common.editor.page.IRskyCommonFormPage;
import com.rskytech.hmi.common.editor.page.block.AbstractRskyCommonMasterDetailsBlock;
import com.rskytech.hmi.icd.common.model.impl.ICD;
import com.rskytech.hmi.icd.common.model.manager.RSICDConfigModelManager;
import com.rskytech.hmi.icd.model.editor.page.block.provider.RSICDConfigContentProvider;
import com.rskytech.hmi.icd.model.editor.page.block.provider.RSICDConfigLabelProvider;
import com.rskytech.hmi.icd.model.editor.page.provider.RSICDConfigDetailPageProvider;

/**
 * 
 * @author robin
 * 
 */
public class RSICDConfigMasterDetailsBlock extends
		AbstractRskyCommonMasterDetailsBlock {

	RSICDConfigDetailPageProvider rsicdConfigDetailPageProvider;
	
	TreeViewer treeViewer;

	public RSICDConfigMasterDetailsBlock(IRskyCommonFormPage rskyCommonFormPage) {
		super(rskyCommonFormPage);
		this.rsicdConfigDetailPageProvider = new RSICDConfigDetailPageProvider();
	}

	@Override
	protected void createMasterPart(final IManagedForm managedForm, Composite parent) {
		FormToolkit formTookit = managedForm.getToolkit();
		final Section section = formTookit.createSection(parent, Section.EXPANDED
				| Section.TITLE_BAR);
		section.setText("ICD资源配置");
		section.marginHeight = 5;
		section.marginWidth = 5;

		Composite client = formTookit.createComposite(section, SWT.WRAP);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginWidth = 5;
		gridLayout.marginHeight = 5;
		gridLayout.verticalSpacing = 0;
		gridLayout.horizontalSpacing = 0;
		client.setLayout(gridLayout);
		formTookit.paintBordersFor(client);

		Tree tree = new Tree(client, SWT.FULL_SELECTION | SWT.BORDER);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.widthHint = 20;
		gridData.heightHint = 20;
		tree.setLayoutData(gridData);

		treeViewer = new TreeViewer(tree);
		treeViewer.setContentProvider(new RSICDConfigContentProvider());
		// RSATEConfigStyledLabelProvider rsATEConfigLabelProvider = new
		// RSATEConfigStyledLabelProvider();
		// RSATEConfigModelLabelDecorator rsATEConfigModelLabelDecorator = new
		// RSATEConfigModelLabelDecorator();
		// treeViewer.setLabelProvider(
		// new RSATEConfigStyledCellLabelProvider(rsATEConfigLabelProvider,
		// rsATEConfigModelLabelDecorator, null));
		treeViewer.setLabelProvider(new RSICDConfigLabelProvider());

		Resource resource = this.getRskyCommonFormPage().getResource();
		EObject eObject = resource.getContents().get(0);
		ICD icd = RSICDConfigModelManager.createICD(eObject);
		// Bench bench = RSATEConfigModelManager.createBench((EObject) object);
		List list = new ArrayList();
		list.add(icd);
		treeViewer.setInput(list);
		treeViewer.expandToLevel(3);
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			final SectionPart sectionPart = new SectionPart(section);
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				managedForm.fireSelectionChanged(sectionPart, event.getSelection());
				
			}
		});
		
		createContextMenuFor(treeViewer);
		section.setClient(client);
		SectionPart sectionPart = new SectionPart(section);
		managedForm.addPart(sectionPart);

	}

	/**
	 * 注册上下文菜单到树型视图上
	 * @param treeViewer
	 */
	private void createContextMenuFor(TreeViewer treeViewer) {
		MenuManager contextMenu=new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener((IMenuListener) getRskyCommonFormPage().getEditor());
		Menu menu=contextMenu.createContextMenu(treeViewer.getControl());
		treeViewer.getControl().setMenu(menu);
		getRskyCommonFormPage().getEditor().getSite().registerContextMenu(contextMenu, treeViewer);
	}

	@Override
	protected void registerPages(DetailsPart detailsPart) {
		detailsPart.setPageProvider(rsicdConfigDetailPageProvider);

	}

	@Override
	protected void createToolBarActions(IManagedForm managedForm) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createContent(IManagedForm managedForm, Composite parent) {
		// TODO Auto-generated method stub
		super.createContent(managedForm, parent);
		this.sashForm.setWeights(new int[] { 35, 65 });
	}

	@Override
	public Object getAdapter(Class adapter) {
		if(adapter==ISelectionProvider.class){
			return treeViewer;
		}
		return null;
	}

	

}
