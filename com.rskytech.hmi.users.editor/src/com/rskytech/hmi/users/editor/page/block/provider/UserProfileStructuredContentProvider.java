package com.rskytech.hmi.users.editor.page.block.provider;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * 
 * @author robin
 * 
 */
public class UserProfileStructuredContentProvider implements
		IStructuredContentProvider {

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof List) {
			return ((List) inputElement).toArray(new Object[0]);
		}
		return new Object[0];
	}

	@Override
	public void dispose() {

	}
}
