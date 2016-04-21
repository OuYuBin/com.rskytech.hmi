package com.rskytech.hmi.users.editor.page.block.provider;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.rskytech.hmi.users.Profile;
import com.rskytech.hmi.users.editor.UsersEditorPlugin;

/**
 * 
 * @author robin
 *
 */
public class UserRoleLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object element) {
		return UsersEditorPlugin.getPlugin().getImageRegistry().get("Role");
	}

	@Override
	public String getText(Object element) {
		return ((Profile) element).getName();
	}

}
