package com.rskytech.hmi.users.editor.page.block.editSupport;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;

import com.rskytech.hmi.users.Profile;
import com.rskytech.hmi.users.User;

/**
 * 
 * @author robin
 * 
 */
public class UserProfileCheckedEditingSupport extends EditingSupport {

	private EList<Profile> profiles;

	public UserProfileCheckedEditingSupport(Object input, ColumnViewer viewer) {
		super(viewer);
		if (input != null & input instanceof User) {
			this.profiles = ((User) input).getProfiles();
		}
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		CheckboxCellEditor checkboxCellEditor = new CheckboxCellEditor(((TableViewer) getViewer()).getTable(),
				SWT.CENTER);
		return checkboxCellEditor;
	}

	@Override
	protected boolean canEdit(Object element) {
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		if (profiles.contains(element)) {
			return true;
		}
		return false;
	}

	@Override
	protected void setValue(Object element, Object value) {

	}

}
