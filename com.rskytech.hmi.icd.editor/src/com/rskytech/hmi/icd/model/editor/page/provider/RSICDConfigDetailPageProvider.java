package com.rskytech.hmi.icd.model.editor.page.provider;

import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IDetailsPageProvider;

import com.rskytech.hmi.icd.model.editor.page.RSICDConfigDetailPage;

/**
 * 
 * @author robin
 * 
 */
public class RSICDConfigDetailPageProvider implements IDetailsPageProvider {

	@Override
	public Object getPageKey(Object object) {
		return object;
	}

	@Override
	public IDetailsPage getPage(Object key) {
		return new RSICDConfigDetailPage(key);
	}

}
