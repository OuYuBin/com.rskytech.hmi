package com.rskytech.hmi.users.editor.page.block.provider;

import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.activities.IActivity;
import org.eclipse.ui.activities.NotDefinedException;

import com.rskytech.hmi.users.Profile;
import com.rskytech.hmi.users.User;
import com.rskytech.hmi.users.editor.UsersEditorPlugin;

/**
 * 
 * @author robin
 * 
 */
public class UserRoleCheckBoxColumnLabelProvider extends ColumnLabelProvider {

	private EList<Profile> profiles;

	public UserRoleCheckBoxColumnLabelProvider(Object input) {
		super();
		if (input != null & input instanceof User) {
			this.profiles = ((User) input).getProfiles();
		}
	}

	@Override
	public String getText(Object element) {
		return "";
	}

	@Override
	public Image getImage(Object element) {
		// if (profiles.contains(element)) {
		// return
		// UsersEditorPlugin.getPlugin().getImageRegistry().get("CheckBoxOn");
		// }
		return UsersEditorPlugin.getPlugin().getImageRegistry().get("CheckBoxOff");
	}
}
