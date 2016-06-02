package com.rskytech.hmi.icd.model.editor.page.block.provider;

import java.util.Collections;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.rskytech.hmi.icd.common.model.IRSICDConfigContainerModel;

/**
 * 
 * @author robin
 *
 */
public class RSICDConfigContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof List) {
			return ((List) inputElement).toArray();
		}
		return Collections.EMPTY_LIST.toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IRSICDConfigContainerModel) {
			return ((IRSICDConfigContainerModel) parentElement).getRSICDConfigModels().toArray();
		}
		return Collections.EMPTY_LIST.toArray();
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

}
