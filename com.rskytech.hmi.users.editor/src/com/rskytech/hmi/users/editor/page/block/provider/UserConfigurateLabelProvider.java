package com.rskytech.hmi.users.editor.page.block.provider;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.rskytech.hmi.users.User;
import com.rskytech.hmi.users.editor.UsersEditorPlugin;

/**
 * 
 * @author robin
 *
 */
public class UserConfigurateLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object element) {
		return UsersEditorPlugin.getPlugin().getImageRegistry().get("User");
	}

	@Override
	public String getText(Object element) {
		return ((User) element).getName();
	}

}
