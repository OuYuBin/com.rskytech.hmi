package com.rskytech.hmi.bench.rsateconfig.editor.page;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Image;
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

import com.rskytech.hmi.bench.rsateconfig.DriverNameAndVersion;
import com.rskytech.hmi.bench.rsateconfig.editor.model.Bench;
import com.rskytech.hmi.bench.rsateconfig.editor.model.IRSATEConfigModel;
import com.rskytech.hmi.bench.rsateconfig.editor.model.Resources;
import com.rskytech.hmi.bench.rsateconfig.editor.model.VirtualResources;
import com.rskytech.hmi.bench.rsateconfig.editor.page.editSupport.AvaliableCheckedEditingSupport;
import com.rskytech.hmi.bench.rsateconfig.editor.page.provider.RSATEConfigResouceContentProvider;
import com.rskytech.hmi.bench.rsateconfig.editor.page.provider.RSATEConfigResourceAvaiableCheckBoxColumnLabelProvider;
import com.rskytech.hmi.bench.rsateconfig.editor.page.provider.RSATEResourceTableNameColumnLabelProvider;
import com.rskytech.hmi.core.utils.RSkyEcoreUtil;

/**
 * 
 * @author robin
 *
 */
public class RSATEConfigDetailPage extends AbstractFormPart implements IDetailsPage {

	FormToolkit toolKit;

	Object input;

	public RSATEConfigDetailPage(Object input) {
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
		EList<EAttribute> attributes = null;
		if (input instanceof EObject) {
			attributes = ((EObject) input).eClass().getEAllAttributes();
		} else {
			attributes = ((IRSATEConfigModel) input).getEObject().eClass().getEAllAttributes();

		}
		if (!attributes.isEmpty()) {
			Section section = toolKit.createSection(parent, Section.EXPANDED | Section.TITLE_BAR);
			section.setText("属性");
			TableWrapData twd = new TableWrapData(TableWrapData.FILL_GRAB);
			twd.grabHorizontal = true;
			twd.grabVertical = true;
			section.setLayoutData(twd);
			section.clientVerticalSpacing = 0;

			Composite client = toolKit.createComposite(section);
			GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
			gd.widthHint = SWT.DEFAULT;
			gd.heightHint = SWT.DEFAULT;
			client.setLayoutData(gd);

			GridLayout gridLayout = new GridLayout();
			gridLayout.numColumns = 3;
			gridLayout.horizontalSpacing = 8;
			client.setLayout(gridLayout);

			createAttributesSection(input, client);
			section.setClient(client);
			SectionPart objectInfoSectionPart = new SectionPart(section);
			getManagedForm().addPart(objectInfoSectionPart);
		}

		if (input instanceof Resources || input instanceof VirtualResources) {
			Section resourceSection = toolKit.createSection(parent, Section.EXPANDED | Section.TITLE_BAR);
			resourceSection.setText("资源");
			TableWrapData twd = new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB);
			twd.grabHorizontal = true;
			twd.grabVertical = true;
			resourceSection.setLayoutData(twd);
			resourceSection.clientVerticalSpacing=0;

			Composite client = toolKit.createComposite(resourceSection, SWT.WRAP);
			GridLayout gridLayout = new GridLayout();
			client.setLayout(gridLayout);

			createReferenceSection(input, client);
			resourceSection.setClient(client);
			SectionPart objectInfoSectionPart = new SectionPart(resourceSection);
			getManagedForm().addPart(objectInfoSectionPart);

		} else if (input instanceof Bench) {
			Section resourceSection = toolKit.createSection(parent, Section.EXPANDED | Section.TITLE_BAR);
			resourceSection.setText("节点");
			TableWrapData twd = new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB);
			twd.grabHorizontal = true;
			twd.grabVertical = true;
			resourceSection.setLayoutData(twd);
			resourceSection.clientVerticalSpacing = 0;

			Composite client = toolKit.createComposite(resourceSection, SWT.WRAP);
			GridLayout gridLayout = new GridLayout();
			client.setLayout(gridLayout);

			createReferenceSection(input, client);
			resourceSection.setClient(client);
			SectionPart objectInfoSectionPart = new SectionPart(resourceSection);
			getManagedForm().addPart(objectInfoSectionPart);
		}

	}

	private void createReferenceSection(Object input, Composite client) {
		final Text searchText = toolKit.createText(client, "", SWT.BORDER | SWT.SEARCH | SWT.ICON_SEARCH | SWT.CANCEL);
		searchText.setMessage("搜索: 资源");
		searchText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		searchText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent keyEvent) {
				// attrFilter.setFilterText(searchText.getText());
				// attrTableViewer.refresh();
			}
		});

		EObject eObject = null;
		List<? extends IRSATEConfigModel> contents = Collections.emptyList();
		if (input instanceof Resources) {
			eObject = ((Resources) input).getEObject();
			contents = ((Resources) input).getRSATEConfigModels();
		} else if (input instanceof VirtualResources) {
			eObject = ((VirtualResources) input).getEObject();
			contents = ((VirtualResources) input).getRSATEConfigModels();
		} else if (input instanceof Bench) {
			com.rskytech.hmi.bench.rsateconfig.Bench bench = (com.rskytech.hmi.bench.rsateconfig.Bench) ((Bench) input)
					.getEObject();
			eObject = bench.getNodes();
			contents = ((Bench) input).getRSATEConfigModels();
		}

		EClass eClass = null;
		EList<EReference> references = RSkyEcoreUtil.getReferences(eObject);
		for (EReference reference : references) {
			String name = reference.getName();
			if (name.equals("resource") || name.equals("virtualResource") || name.equals("node")) {
				eClass = (EClass) reference.getEType();
				break;
			}
		}

		Composite tableParentComposite = toolKit.createComposite(client, SWT.NULL);
		GridData gd = new GridData(GridData.FILL, GridData.FILL, true, true);
		gd.widthHint = 50;
		gd.minimumHeight = 50;
		tableParentComposite.setLayoutData(gd);
		TableColumnLayout tableColumnLayout = new TableColumnLayout();
		tableParentComposite.setLayout(tableColumnLayout);

		TableViewer attrTableViewer = new TableViewer(tableParentComposite,
				SWT.MULTI | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION);
		Table table = attrTableViewer.getTable();
		gd = new GridData(GridData.FILL, GridData.FILL, true, true);
		table.setLayoutData(gd);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		TableViewer tableViewer = new TableViewer(table);

		createTableViewerColumns(tableViewer, eClass);
		tableViewer.setContentProvider(new RSATEConfigResouceContentProvider());

		tableViewer.setInput(contents);
	}

	private void createTableViewerColumns(TableViewer tableViewer, EClass eClass) {
		Composite composite = tableViewer.getTable().getParent();
		TableColumnLayout tableColumnLayout = (TableColumnLayout) composite.getLayout();
		EList<EAttribute> attributes = eClass.getEAllAttributes();
		for (EAttribute eAttribute : attributes) {
			String name = eAttribute.getName();
			TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer,
					SWT.CENTER | SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
			if (name.equals("available")) {
				tableViewerColumn.getColumn().setText("!");
				tableViewerColumn.getColumn().setResizable(false);
				tableColumnLayout.setColumnData(tableViewerColumn.getColumn(), new ColumnPixelData(21, false));
				tableViewerColumn
						.setLabelProvider(new RSATEConfigResourceAvaiableCheckBoxColumnLabelProvider(eAttribute));
				tableViewerColumn.setEditingSupport(new AvaliableCheckedEditingSupport(tableViewer));
			} else {
				tableViewerColumn.getColumn().setText(name);
				tableViewerColumn.setLabelProvider(new RSATEResourceTableNameColumnLabelProvider(eAttribute));
				int weight = 1;
				if (name.equals("name")) {
					weight = 2;
				}
				ColumnWeightData columnWeightData = new ColumnWeightData(weight, 10, true);
				tableColumnLayout.setColumnData(tableViewerColumn.getColumn(), columnWeightData);
			}
		}

		if (eClass.getName().equals("Resource")) {
			// --针对resource信息,分解子节点信息,已增加可视及易用性处理
			EList<EReference> references = eClass.getEAllReferences();
			for (EReference reference : references) {
				String name = reference.getName();

				// --分解驱动版本及位置信息
				if (name.equals("driver")) {
					attributes = ((EClass) reference.getEType()).getEAllAttributes();
					for (EAttribute eAttribute : attributes) {
						name = eAttribute.getName();
						TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer,
								SWT.CENTER | SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
						if (name.equals("name")) {
							tableViewerColumn.getColumn().setText("driver");
						} else {
							tableViewerColumn.getColumn().setText(name);
						}
						tableViewerColumn
								.setLabelProvider(new RSATEResourceTableNameColumnLabelProvider(reference, eAttribute));
						ColumnWeightData columnWeightData = null;
						if (name.equals("name")) {
							columnWeightData = new ColumnWeightData(2, 10, true);
						} else {
							columnWeightData = new ColumnWeightData(1, 10, true);
						}
						tableColumnLayout.setColumnData(tableViewerColumn.getColumn(), columnWeightData);
					}
				} else if (name.equals("conf")) {
					EList<EReference> confReferences = ((EClass) reference.getEType()).getEReferences();
					for (EReference confReference : confReferences) {
						if (confReference.getName().equals("param")) {
							TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer,
									SWT.CENTER | SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
							tableViewerColumn.getColumn().setText("location");
							tableViewerColumn.setLabelProvider(
									new RSATEResourceTableNameColumnLabelProvider(confReference, "location"));
							ColumnWeightData columnWeightData = new ColumnWeightData(1, 100, true);
							tableColumnLayout.setColumnData(tableViewerColumn.getColumn(), columnWeightData);
							// --驱动所在
							tableViewerColumn = new TableViewerColumn(tableViewer,
									SWT.CENTER | SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
							tableViewerColumn.getColumn().setText("driverPath");
							tableViewerColumn.setLabelProvider(
									new RSATEResourceTableNameColumnLabelProvider(confReference, "driver"));
							columnWeightData = new ColumnWeightData(4, 100, true);
							tableColumnLayout.setColumnData(tableViewerColumn.getColumn(), columnWeightData);
							break;
						}
					}
				}
			}
		}

	}

	private void createAttributesSection(Object input, Composite parent) {
		if (input instanceof IRSATEConfigModel) {
			EObject eObject = ((IRSATEConfigModel) input).getEObject();

			EList<EAttribute> attributes = eObject.eClass().getEAllAttributes();
			for (EAttribute attribute : attributes) {
				String name = attribute.getName();
				Object value = eObject.eGet(attribute);
				Label nameLable = getManagedForm().getToolkit().createLabel(parent, name + ":", SWT.LEFT);
				GridData gd = new GridData(SWT.FILL, SWT.FILL, false, true);
				gd.horizontalSpan = 1;
				gd.horizontalAlignment = SWT.LEFT;
				nameLable.setLayoutData(gd);

				gd = new GridData(SWT.FILL, SWT.FILL, true, true);
				gd.widthHint = 100;
				Text valueText = null;
				String documention = EcoreUtil.getDocumentation(attribute);
				if (name.equals("password")) {
					valueText = getManagedForm().getToolkit().createText(parent, value + "", SWT.BORDER | SWT.PASSWORD);
				} else {
					valueText = getManagedForm().getToolkit().createText(parent, value + "", SWT.BORDER);
				}
				// valueText.setMessage(documention==null?"":documention);
				valueText.setData(attribute);
				gd.horizontalSpan = 2;
				valueText.setLayoutData(gd);
				if (documention != null) {
					final ControlDecoration informationDeco = new ControlDecoration(valueText, SWT.TOP | SWT.LEFT);
					Image image = FieldDecorationRegistry.getDefault()
							.getFieldDecoration(FieldDecorationRegistry.DEC_CONTENT_PROPOSAL).getImage();

					informationDeco.setDescriptionText(documention);
					informationDeco.setShowOnlyOnFocus(true);
					informationDeco.setImage(image);
				}
			}
		}
	}

}
