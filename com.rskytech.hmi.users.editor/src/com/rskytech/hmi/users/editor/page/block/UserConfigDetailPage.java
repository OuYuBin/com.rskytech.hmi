package com.rskytech.hmi.users.editor.page.block;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.AbstractFormPart;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

import com.rskytech.hmi.users.Profile;
import com.rskytech.hmi.users.User;
import com.rskytech.hmi.users.UsersConfiguration;
import com.rskytech.hmi.users.editor.page.block.editSupport.UserProfileCheckedEditingSupport;
import com.rskytech.hmi.users.editor.page.block.provider.UserRoleCheckBoxColumnLabelProvider;
import com.rskytech.hmi.users.editor.page.block.provider.UserRoleStructuredContentProvider;
import com.rskytech.hmi.users.editor.page.block.provider.UserRoleTableColumnLabelProvider;

public class UserConfigDetailPage extends AbstractFormPart implements IDetailsPage {

	FormToolkit toolKit;

	Section editionSection;

	Section attrsSection;

	Object input;

	public UserConfigDetailPage(Object input) {
		this.input = input;
	}

	@Override
	public void selectionChanged(IFormPart part, ISelection selection) {
		part.refresh();
	}

	@Override
	public void createContents(Composite parent) {
		toolKit = getManagedForm().getToolkit();
		TableWrapLayout tableWrapLayout = new TableWrapLayout();
		parent.setLayout(tableWrapLayout);

		editionSection = toolKit.createSection(parent, Section.EXPANDED | Section.TITLE_BAR);
		editionSection.setText("编辑");
		editionSection.clientVerticalSpacing = 0;

		TableWrapData twd = new TableWrapData(TableWrapData.FILL_GRAB);
		twd.grabHorizontal = true;
		twd.grabVertical = true;
		editionSection.setLayoutData(twd);

		Composite client = toolKit.createComposite(editionSection);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		gridLayout.horizontalSpacing = 8;
		client.setLayout(gridLayout);

		createAttributesSection(input, client);
		editionSection.setClient(client);
		SectionPart objectInfoSectionPart = new SectionPart(editionSection);
		getManagedForm().addPart(objectInfoSectionPart);

		// --获取角色信息
		Resource resource = ((EObject) input).eResource();
		UsersConfiguration usersConfiguration = (UsersConfiguration) resource.getContents().get(0);
		EList<Profile> profiles = usersConfiguration.getProfile();

		if (!profiles.isEmpty()) {
			attrsSection = toolKit.createSection(parent, Section.EXPANDED|Section.TITLE_BAR);
			attrsSection.setText("角色");
			attrsSection.clientVerticalSpacing = 0;

			twd = new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB);
			twd.grabHorizontal = true;
			twd.grabVertical = true;
			attrsSection.setLayoutData(twd);

			client = toolKit.createComposite(attrsSection, SWT.WRAP);
			gridLayout = new GridLayout();
			client.setLayout(gridLayout);

			createProfilesSection(profiles, client);
			attrsSection.setClient(client);
			SectionPart attrsSectionPart = new SectionPart(attrsSection);

			getManagedForm().addPart(attrsSectionPart);

		}
	}

	/**
	 * 
	 * @param profiles
	 * @param client
	 */
	private void createProfilesSection(EList<Profile> profiles, Composite composite) {
		final Text searchText = toolKit.createText(composite, "",
				SWT.BORDER | SWT.SEARCH | SWT.ICON_SEARCH | SWT.CANCEL);
		searchText.setMessage("搜索: 角色");
		searchText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		searchText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent keyEvent) {
				// attrFilter.setFilterText(searchText.getText());
				// attrTableViewer.refresh();
			}
		});

		Composite tableParentComposite = toolKit.createComposite(composite, SWT.NULL);
		GridData gd = new GridData(GridData.FILL, GridData.FILL, true, true);
		gd.widthHint = 1;
		// adgd.minimumHeight=50;
		tableParentComposite.setLayoutData(gd);
		TableColumnLayout tableColumnLayout = new TableColumnLayout();
		tableParentComposite.setLayout(tableColumnLayout);

		TableViewer attrTableViewer = new TableViewer(tableParentComposite,
				SWT.MULTI | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION);
		Table table = attrTableViewer.getTable();
		gd = new GridData(GridData.FILL, GridData.FILL, true, true);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setLayoutData(gd);
		createAttrTableViewerColumns(attrTableViewer);

		// attrFilter = new AttrFilter();
		// attrTableViewer.addFilter(attrFilter);

		attrTableViewer.setContentProvider(new UserRoleStructuredContentProvider());
		attrTableViewer.setInput(profiles);

	}

	private void createAttrTableViewerColumns(TableViewer tableViewer) {

		Composite composite = tableViewer.getTable().getParent();
		TableColumnLayout tableColumnLayout = (TableColumnLayout) composite.getLayout();

		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer,
				SWT.CENTER | SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		tableViewerColumn.setLabelProvider(new UserRoleCheckBoxColumnLabelProvider(input));
		tableViewerColumn.getColumn().setText("!");
		tableViewerColumn.getColumn().setResizable(false);
		tableViewerColumn.setEditingSupport(new UserProfileCheckedEditingSupport(input, tableViewer));
		tableColumnLayout.setColumnData(tableViewerColumn.getColumn(), new ColumnPixelData(21, false));

		tableViewerColumn = new TableViewerColumn(tableViewer, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI );
		tableViewerColumn.getColumn().setText("角色");

		tableViewerColumn.setLabelProvider(new UserRoleTableColumnLabelProvider(tableViewer));
		composite = tableViewer.getTable().getParent();
		tableColumnLayout = (TableColumnLayout) composite.getLayout();
		ColumnWeightData columnWeightData = new ColumnWeightData(1, 100, true);
		tableColumnLayout.setColumnData(tableViewerColumn.getColumn(), columnWeightData);
	}

	/**
	 * 
	 * @param input
	 * @param parent
	 */
	private void createAttributesSection(Object input, Composite parent) {
		User user = (User) input;
		EList<EAttribute> attributes = user.eClass().getEAllAttributes();
		for (EAttribute attribute : attributes) {
			String name = attribute.getName();
			String value = (String) user.eGet(attribute);
			Label nameLable = getManagedForm().getToolkit().createLabel(parent, name + ":", SWT.LEFT);
			GridData gd = new GridData(SWT.FILL, SWT.FILL, false, true);
			gd.horizontalSpan = 1;
			gd.horizontalAlignment = SWT.LEFT;
			nameLable.setLayoutData(gd);

			gd = new GridData(SWT.FILL, SWT.FILL, true, true);
			gd.widthHint = 100;
			Text valueText = null;
			if (name.equals("password")) {
				valueText = getManagedForm().getToolkit().createText(parent, value, SWT.BORDER | SWT.PASSWORD);
			} else {
				valueText = getManagedForm().getToolkit().createText(parent, value, SWT.BORDER);
			}
			valueText.setData(attribute);
			gd.horizontalSpan = 2;
			valueText.setLayoutData(gd);
		}

	}

}
