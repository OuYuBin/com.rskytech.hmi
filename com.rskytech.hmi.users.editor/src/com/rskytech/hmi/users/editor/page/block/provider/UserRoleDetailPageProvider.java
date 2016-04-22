package com.rskytech.hmi.users.editor.page.block.provider;

import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IDetailsPageProvider;

import com.rskytech.hmi.users.editor.page.UserRoleDetailPage;

/**
 * 
 * @author robin
 *
 */
public class UserRoleDetailPageProvider implements IDetailsPageProvider {

	@Override
	public Object getPageKey(Object object) {
		return object;
	}

	@Override
	public IDetailsPage getPage(Object key) {
		return new UserRoleDetailPage(key);
	}

}
