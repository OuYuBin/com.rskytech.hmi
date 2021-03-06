package com.rskytech.hmi.bench.rsateconfig.editor.page;


import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import com.rskytech.hmi.bench.rsateconfig.editor.page.block.RSATEConfigBenchMasterDetailsBlock;
import com.rskytech.hmi.common.editor.page.IRskyCommonFormPage;
import com.rskytech.hmi.common.editor.page.RskyCommonFormPage;

/**
 * 
 * @author robin
 *
 */
public class RSATEConfigGeneralFormPage extends RskyCommonFormPage implements IRskyCommonFormPage{
	
	private RSATEConfigBenchMasterDetailsBlock rsateConfigMasterDetailsBlock;

	public RSATEConfigGeneralFormPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}

	@Override
	protected void createFormContent(IManagedForm managedForm) {
		ScrolledForm scrolledForm=managedForm.getForm();
		scrolledForm.setText("硬件资源配置管理");
		FormToolkit formToolkit=managedForm.getToolkit();
		Form form=scrolledForm.getForm();
		formToolkit.decorateFormHeading(form);
		this.rsateConfigMasterDetailsBlock=new RSATEConfigBenchMasterDetailsBlock(this);
		rsateConfigMasterDetailsBlock.createContent(managedForm);
	}
	
	

}
