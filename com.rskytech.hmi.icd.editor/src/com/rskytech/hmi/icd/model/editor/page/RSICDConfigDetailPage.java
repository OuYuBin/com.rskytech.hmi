package com.rskytech.hmi.icd.model.editor.page;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.AbstractFormPart;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

import com.rskytech.hmi.icd.common.model.IRSICDConfigModel;

/**
 * 
 * @author robin
 *
 */
public class RSICDConfigDetailPage extends AbstractFormPart implements IDetailsPage {

	Object input;

	public RSICDConfigDetailPage(Object input) {
		this.input = input;
	}

	@Override
	public void selectionChanged(IFormPart part, ISelection selection) {
		part.refresh();
	}

	@Override
	public void createContents(Composite parent) {
		FormToolkit toolkit = getManagedForm().getToolkit();
		TableWrapLayout tableWrapLayout = new TableWrapLayout();
		parent.setLayout(tableWrapLayout);

		EList<EAttribute> attributes = null;
		if (input instanceof EObject) {
			attributes = ((EObject) input).eClass().getEAllAttributes();
		} else {
			EObject eObject = ((IRSICDConfigModel) input).getEObject();
			if (eObject != null) {
				attributes = eObject.eClass().getEAllAttributes();
			}
		}
		if (attributes != null) {

			Section section = toolkit.createSection(parent, Section.EXPANDED | Section.TITLE_BAR);
			TableWrapData tableWrapData = new TableWrapData(TableWrapData.FILL_GRAB);
			//tableWrapData.align=TableWrapData.FILL_GRAB;
			tableWrapData.grabHorizontal = true;
			tableWrapData.grabVertical = true;
			section.setLayoutData(tableWrapData);
			section.clientVerticalSpacing = 0;
			section.setText("属性");

			Composite client = toolkit.createComposite(section);
			GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
			gd.widthHint = 100;
			gd.heightHint = 100;
			client.setLayoutData(gd);
			
			GridLayout gridLayout = new GridLayout();
			gridLayout.numColumns = 3;
			gridLayout.horizontalSpacing = 8;
			client.setLayout(gridLayout);
			

			createAttributesSection(input, client);
			section.setClient(client);
			SectionPart sectionPart = new SectionPart(section);
			getManagedForm().addPart(sectionPart);

		}

	}

	private void createAttributesSection(Object input, Composite parent) {
		if (input instanceof IRSICDConfigModel) {
			EObject eObject = ((IRSICDConfigModel) input).getEObject();

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
