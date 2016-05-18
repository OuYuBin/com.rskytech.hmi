package com.rskytech.hmi.bench.rsateconfig.editor.page.provider;

import java.util.Collections;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * 
 * @author robin
 *
 */
public class RSATEConfigResouceContentProvider implements IStructuredContentProvider {

	@Override
	public void dispose() {

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof List) {
			return ((List) inputElement).toArray(new Object[0]);
		}

		return Collections.EMPTY_LIST.toArray();
	}

}
