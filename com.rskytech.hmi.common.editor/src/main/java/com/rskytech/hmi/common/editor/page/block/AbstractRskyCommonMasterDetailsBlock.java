package com.rskytech.hmi.common.editor.page.block;

import org.eclipse.ui.forms.MasterDetailsBlock;

import com.rskytech.hmi.common.editor.page.IRskyCommonFormPage;

/**
 * 
 * @author robin
 *
 */
public abstract class AbstractRskyCommonMasterDetailsBlock extends MasterDetailsBlock
		implements IRskyCommonMasterDetailsBlock {

	public IRskyCommonFormPage rskyCommonFormPage;

	public AbstractRskyCommonMasterDetailsBlock(IRskyCommonFormPage rskyCommonFormPage) {
		this.rskyCommonFormPage = rskyCommonFormPage;
		this.rskyCommonFormPage.setRskyCommonMasterDetailsBlock(this);
	}

	public IRskyCommonFormPage getRskyCommonFormPage() {
		return rskyCommonFormPage;
	}

	public void setRskyCommonFormPage(IRskyCommonFormPage rskyCommonFormPage) {
		this.rskyCommonFormPage = rskyCommonFormPage;
	}

}
