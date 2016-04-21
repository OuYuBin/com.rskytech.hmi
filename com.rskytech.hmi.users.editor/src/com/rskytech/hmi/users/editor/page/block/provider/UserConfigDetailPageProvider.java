package com.rskytech.hmi.users.editor.page.block.provider;

import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IDetailsPageProvider;

import com.rskytech.hmi.users.editor.page.block.UserConfigDetailPage;

/**
 * 
 * @author robin
 *
 */
public class UserConfigDetailPageProvider implements IDetailsPageProvider {

	@Override
	public Object getPageKey(Object object) {
		return object;
	}

	@Override
	public IDetailsPage getPage(Object key) {
		return new UserConfigDetailPage(key);
	}

}
