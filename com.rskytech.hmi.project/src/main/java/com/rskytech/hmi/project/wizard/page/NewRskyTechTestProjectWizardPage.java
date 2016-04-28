package com.rskytech.hmi.project.wizard.page;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.rskytech.hmi.project.Activator;

/**
 * 
 * @author robin
 *
 */
public class NewRskyTechTestProjectWizardPage extends WizardPage {

	Text projectNameText;

	protected NewRskyTechTestProjectWizardPage(String pageName, String title, ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
	}

	public NewRskyTechTestProjectWizardPage() {
		super("createProject");
		setTitle("项目");
		setMessage("创建测试项目.");
		setImageDescriptor(Activator.getDefault().getImageRegistry().getDescriptor("NewProject"));
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gridLayout = new GridLayout(2, false);
		composite.setLayout(gridLayout);
		Label name = new Label(composite, SWT.NONE);
		name.setText("项目名称:");
		name.setLayoutData(new GridData(GridData.BEGINNING, GridData.FILL, false, false));
		projectNameText = new Text(composite, SWT.NONE);
		projectNameText.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));
		setControl(composite);
	}

	public Text getProjectNameText() {
		return projectNameText;
	}

}
