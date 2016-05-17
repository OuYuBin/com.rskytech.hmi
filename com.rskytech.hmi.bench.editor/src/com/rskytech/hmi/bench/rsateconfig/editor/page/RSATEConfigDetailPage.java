package com.rskytech.hmi.bench.rsateconfig.editor.page;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
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
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

import com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage;
import com.rskytech.hmi.bench.rsateconfig.editor.model.IRSATEConfigModel;
import com.rskytech.hmi.bench.rsateconfig.editor.model.Resource;
import com.rskytech.hmi.bench.rsateconfig.editor.model.Resources;

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

		Section section = toolKit.createSection(parent, Section.EXPANDED | Section.TITLE_BAR);
		section.setText("属性");
		TableWrapData twd = new TableWrapData(TableWrapData.FILL_GRAB);
		twd.grabHorizontal = true;
		twd.grabVertical = true;
		section.setLayoutData(twd);

		Composite client = toolKit.createComposite(section);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		gridLayout.horizontalSpacing = 8;
		client.setLayout(gridLayout);

		createAttributesSection(input, client);
		section.setClient(client);
		SectionPart objectInfoSectionPart = new SectionPart(section);

		getManagedForm().addPart(objectInfoSectionPart);

			
		Section refSection=toolKit.createSection(parent, Section.EXPANDED|Section.TITLE_BAR);
		
		
		client=toolKit.createComposite(refSection);
		
		
		createReferenceSection(input,client);
		//}
		
		
	}

	private void createReferenceSection(Object input, Composite client) {
		
		
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
				// EAnnotation annotation =
				// RSATEConfigPackage.eINSTANCE.getBench_Name().
				// .getEAnnotation("http://www.eclipse.org/emf/2002/GenModel");
				Text valueText = getManagedForm().getToolkit().createText(parent, "", SWT.BORDER);
				String documention = EcoreUtil.getDocumentation(attribute);
				// if (name.equals("password")) {
				// valueText = getManagedForm().getToolkit().createText(parent,
				// value, SWT.BORDER | SWT.PASSWORD);
				// } else {
				// valueText = getManagedForm().getToolkit().createText(parent,
				// value, SWT.BORDER);
				// }
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
