package com.rskytech.hmi.users.editor.page;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import com.rskytech.hmi.common.editor.page.RskyCommonFormPage;
import com.rskytech.hmi.users.editor.page.block.UserConfigMasterDetailBlock;

public class UserConfigurateFormPage extends RskyCommonFormPage {

	private UserConfigMasterDetailBlock userConfigMasterDetailBlock;

	public UserConfigurateFormPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
	}

	@Override
	protected void createFormContent(IManagedForm managedForm) {
		ScrolledForm scrolledForm = managedForm.getForm();
		scrolledForm.setText("用户配置管理");
		FormToolkit formToolkit = managedForm.getToolkit();
		Form form = scrolledForm.getForm();
		formToolkit.decorateFormHeading(form);
		userConfigMasterDetailBlock = new UserConfigMasterDetailBlock(this);
		userConfigMasterDetailBlock.createContent(managedForm);
	}

}
