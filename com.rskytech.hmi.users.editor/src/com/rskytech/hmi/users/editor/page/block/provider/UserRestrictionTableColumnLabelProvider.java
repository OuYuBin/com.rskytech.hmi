package com.rskytech.hmi.users.editor.page.block.provider;

import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.ui.activities.IActivity;
import org.eclipse.ui.activities.NotDefinedException;

import com.rskytech.hmi.users.Profile;

/**
 * 
 * @author robin
 * 
 */
public class UserRestrictionTableColumnLabelProvider extends ColumnLabelProvider {

	TableViewer tableViewer;

	public UserRestrictionTableColumnLabelProvider(TableViewer tableViewer) {
		this.tableViewer = tableViewer;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof Map.Entry<?, ?>) {
			@SuppressWarnings("unchecked")
			Map.Entry<String, IActivity> entry = (Entry<String, IActivity>) element;
			try {
				return entry.getValue().getName();
			} catch (NotDefinedException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
