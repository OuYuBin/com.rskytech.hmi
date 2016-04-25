package com.rskytech.hmi.users.editor.page.block.provider;

import java.util.Collections;
import java.util.Map;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * 
 * @author robin
 * 
 */
public class UserRestrictionStructuredContentProvider implements
		IStructuredContentProvider {

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Map) {
			return ((Map) inputElement).entrySet().toArray(new Object[0]);
		}
		return Collections.EMPTY_LIST.toArray();
	}

	@Override
	public void dispose() {

	}
}
