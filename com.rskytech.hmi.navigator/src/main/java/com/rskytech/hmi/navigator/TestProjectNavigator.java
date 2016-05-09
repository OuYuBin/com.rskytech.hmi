package com.rskytech.hmi.navigator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.navigator.CommonNavigator;

/**
 * 
 * @author robin
 *
 */
public class TestProjectNavigator extends CommonNavigator {
	public static final String VIEW_ID = "com.rskytech.hmi.navigator.TestProjectNavigator";

	@Override
	public void createPartControl(Composite parent) {

		GridLayout layout = new GridLayout(1, false);
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 1;
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		parent.setLayout(layout);

		FormToolkit formToolkit = new FormToolkit(Display.getCurrent());
		Form form = formToolkit.createForm(parent);
		form.setText("自动化测试项目列表");
		formToolkit.decorateFormHeading(form);
		form.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Composite body = form.getBody();
//		layout = new GridLayout(1, false);
//		layout.horizontalSpacing = 0;
//		layout.marginWidth = 0;
		body.setLayout(new FillLayout());

		super.createPartControl(body);
	}

}
