package com.rskytech.hmi.common.editor.page;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.forms.editor.IFormPage;

import com.rskytech.hmi.common.editor.page.block.IRskyCommonMasterDetailsBlock;

/**
 * 
 * @author robin
 *
 */
public interface IRskyCommonFormPage extends IFormPage {

	public Resource getResource();
	
	public EditingDomain getEditingDomain();
	
	public AdapterFactory getAdapterFactory();
	
	public void setRskyCommonMasterDetailsBlock(IRskyCommonMasterDetailsBlock rskyCommonMasterDetailsBlock);
	
	public IRskyCommonMasterDetailsBlock getRskyCommonMasterDetailsBlock();
	
}
