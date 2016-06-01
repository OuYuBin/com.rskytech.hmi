package com.rskytech.hmi.icd.model.editor.page;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.AbstractFormPart;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

/**
 * 
 * @author robin
 *
 */
public class RSICDConfigDetailPage extends AbstractFormPart implements
		IDetailsPage {

	@Override
	public void selectionChanged(IFormPart part, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createContents(Composite parent) {
		FormToolkit toolkit=getManagedForm().getToolkit();
		TableWrapLayout tableWrapLayout=new TableWrapLayout();
		parent.setLayout(tableWrapLayout);
		
		Section section=toolkit.createSection(parent, Section.EXPANDED|Section.TITLE_BAR);
		TableWrapData tableWrapData=new TableWrapData();
		tableWrapData.grabHorizontal=true;
		tableWrapData.grabVertical=true;
		section.setLayoutData(tableWrapData);
		section.clientVerticalSpacing=0;
		section.setText("属性");
		
		Composite client=toolkit.createComposite(section);
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd.widthHint = SWT.DEFAULT;
		gd.heightHint = SWT.DEFAULT;
		client.setLayoutData(gd);
		section.setClient(client);
		SectionPart sectionPart=new SectionPart(section);
		getManagedForm().addPart(sectionPart);

	}

}
