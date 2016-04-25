package com.rskytech.hmi.users.editor.page.block;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IDetailsPageProvider;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import com.rskytech.hmi.common.editor.page.IRskyCommonFormPage;
import com.rskytech.hmi.users.Profile;
import com.rskytech.hmi.users.UsersConfiguration;
import com.rskytech.hmi.users.UsersFactory;
import com.rskytech.hmi.users.UsersPackage;
import com.rskytech.hmi.users.edit.UsersEditPlugin;
import com.rskytech.hmi.users.editor.UsersEditorPlugin;
import com.rskytech.hmi.users.editor.page.block.provider.UserConfigDetailPageProvider;
import com.rskytech.hmi.users.editor.page.block.provider.UserRoleContentProvider;
import com.rskytech.hmi.users.editor.page.block.provider.UserRoleDetailPageProvider;
import com.rskytech.hmi.users.editor.page.block.provider.UserRoleLabelProvider;

/**
 * 
 * @author robin
 *
 */
public class UserProfileMasterDetailBlock extends MasterDetailsBlock implements ISelectionChangedListener {

	private TreeViewer treeViewer;

	private IRskyCommonFormPage rskyCommonFormPage;

	private IDetailsPageProvider detailsPageProvider;

	private UserRoleDetailPageProvider userRoleDetailPageProvider;

	private Object selectionObject;

	public UserProfileMasterDetailBlock(IRskyCommonFormPage rskyCommonFormPage) {
		this.rskyCommonFormPage = rskyCommonFormPage;
		this.userRoleDetailPageProvider = new UserRoleDetailPageProvider();
	}

	@Override
	protected void createMasterPart(final IManagedForm managedForm, Composite parent) {
		FormToolkit formToolkit = managedForm.getToolkit();
		Section section = formToolkit.createSection(parent, Section.EXPANDED | Section.TITLE_BAR);
		section.setText("角色列表");
		section.clientVerticalSpacing = 0;
		section.marginWidth = 5;
		section.marginHeight = 5;

		ToolBarManager toolBarManager = new ToolBarManager(SWT.FLAT);
		ToolBar toolbar = toolBarManager.createControl(section);
		toolbar.setCursor(Display.getDefault().getSystemCursor(SWT.CURSOR_HAND));

		toolBarManager.add(new Action("新增角色", SWT.CHECK) {

			@Override
			public ImageDescriptor getImageDescriptor() {
				return UsersEditorPlugin.getPlugin().getImageRegistry().getDescriptor("AddProfile");
			}

			@Override
			public void run() {
				super.run();
				Resource resource = rskyCommonFormPage.getResource();
				UsersConfiguration usersConfiguration = (UsersConfiguration) resource.getContents().get(0);
				EditingDomain editingDomain = rskyCommonFormPage.getEditingDomain();
				Profile profile = UsersFactory.eINSTANCE.createProfile();
				profile.setName("新角色");

				AddCommand addCommand = new AddCommand(editingDomain, usersConfiguration,
						UsersPackage.eINSTANCE.getUsersConfiguration_Profile(), profile);
				editingDomain.getCommandStack().execute(addCommand);
				treeViewer.refresh();
			}

		});

		toolBarManager.add(new Action("删除角色", SWT.CHECK) {

			@Override
			public ImageDescriptor getImageDescriptor() {
				return UsersEditorPlugin.getPlugin().getImageRegistry().getDescriptor("DelProfile");
			}

			@Override
			public void run() {
				super.run();
				Resource resource = rskyCommonFormPage.getResource();
				UsersConfiguration usersConfiguration = (UsersConfiguration) resource.getContents().get(0);
				EditingDomain editingDomain = rskyCommonFormPage.getEditingDomain();
				RemoveCommand removeCommand = new RemoveCommand(editingDomain, usersConfiguration,
						UsersPackage.eINSTANCE.getUsersConfiguration_Profile(),
						UserProfileMasterDetailBlock.this.selectionObject);
				editingDomain.getCommandStack().execute(removeCommand);
				treeViewer.refresh();
			}

		});
		toolBarManager.update(true);
		section.setTextClient(toolbar);

		Composite client = formToolkit.createComposite(section, SWT.WRAP);
		GridLayout layout = new GridLayout();
		layout.marginHeight = 2;
		client.setLayout(layout);

		// --搜索
		final Text searchText = formToolkit.createText(client, "",
				SWT.BORDER | SWT.SEARCH | SWT.ICON_SEARCH | SWT.CANCEL);
		searchText.setMessage("搜索: 角色");
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

		// --用户列表树
		Tree tree = formToolkit.createTree(client, SWT.FULL_SELECTION);
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd.widthHint = 20;
		gd.heightHint = 20;
		tree.setLayoutData(gd);
		treeViewer = new TreeViewer(tree);
		// hostConfigFilter = new HostConfigFilter();
		// treeViewer.addFilter(hostConfigFilter);
		treeViewer.setContentProvider(new UserRoleContentProvider());
		treeViewer.setLabelProvider(new UserRoleLabelProvider());
		treeViewer.addSelectionChangedListener(this);
		// SysConfigLabelDecorator sysConfigLabelDecorator = new
		// SysConfigLabelDecorator();
		// ModelLabelProvider modelLabelProvider = new ModelLabelProvider();
		// treeViewer
		// .setLabelProvider(new SysConfigDecorationgStyledCellLabelProvider(
		// modelLabelProvider, sysConfigLabelDecorator, null));
		Resource resource = rskyCommonFormPage.getResource();
		UsersConfiguration usersConfiguration = (UsersConfiguration) resource.getContents().get(0);
		EList<Profile> profiles = usersConfiguration.getProfile();
		// RootModel rootModel = SysConfigModelManager
		// .createHostConfigRootModel(resource);
		treeViewer.setInput(profiles);
		formToolkit.paintBordersFor(client);

		section.setClient(client);

		final SectionPart sectionPart = new SectionPart(section);

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				managedForm.fireSelectionChanged(sectionPart, event.getSelection());

			}
		});

		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				Object object = ((StructuredSelection) event.getSelection()).getFirstElement();
				// if (object instanceof IModel) {
				// if (treeViewer.getExpandedState(object)) {
				// treeViewer.collapseToLevel(object, 1);
				// } else {
				// treeViewer.expandToLevel(object, 1);
				// }
				// }
			}

		});
		treeViewer.setSelection(new StructuredSelection(new Object[] { treeViewer.getTree().getItem(0).getData() }));
		treeViewer.getTree().forceFocus();
		treeViewer.expandToLevel(2);
		// createContextMenu(treeViewer);
		managedForm.addPart(sectionPart);

	}

	@Override
	public void createContent(IManagedForm managedForm, Composite parent) {
		super.createContent(managedForm, parent);
		this.sashForm.setWeights(new int[] { 30, 70 });
	}

	@Override
	protected void registerPages(DetailsPart detailsPart) {
		detailsPart.setPageProvider(userRoleDetailPageProvider);
	}

	@Override
	protected void createToolBarActions(IManagedForm managedForm) {

	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		IStructuredSelection selection = (IStructuredSelection) event.getSelection();
		this.selectionObject = selection.getFirstElement();
	}

}
