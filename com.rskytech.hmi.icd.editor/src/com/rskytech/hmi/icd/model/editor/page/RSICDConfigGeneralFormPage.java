package com.rskytech.hmi.icd.model.editor.page;

import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import com.rskytech.hmi.common.editor.page.IRskyCommonFormPage;
import com.rskytech.hmi.common.editor.page.RskyCommonFormPage;
import com.rskytech.hmi.icd.model.editor.page.block.RSICDConfigMasterDetailsBlock;

/**
 * 
 * @author robin
 *
 */
public class RSICDConfigGeneralFormPage extends RskyCommonFormPage implements IRskyCommonFormPage {


	public RSICDConfigGeneralFormPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}

	@Override
	protected void createFormContent(IManagedForm managedForm) {
		ScrolledForm scrolledForm = managedForm.getForm();
		scrolledForm.setText("ICD资源管理");
		FormToolkit formToolkit = managedForm.getToolkit();
		formToolkit.decorateFormHeading(scrolledForm.getForm());
		rskyCommonMasterDetailsBlock = new RSICDConfigMasterDetailsBlock(this);
		((MasterDetailsBlock) rskyCommonMasterDetailsBlock).createContent(managedForm);

	}

}
