package com.rskytech.hmi.users.editor.page.block.provider;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;

import com.rskytech.hmi.users.Profile;

/**
 * 
 * @author robin
 * 
 */
public class UserProfileTableColumnLabelProvider extends ColumnLabelProvider {

	TableViewer tableViewer;

	public UserProfileTableColumnLabelProvider(TableViewer tableViewer) {
		this.tableViewer = tableViewer;
	}

	@Override
	public String getText(Object element) {
		String text = "";
		if (element instanceof Profile) {
			text = (String) ((Profile) element).getName();
		}
		return text;
	}
}
