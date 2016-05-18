package com.rskytech.hmi.bench.rsateconfig.editor.page.editSupport;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;

import com.rskytech.hmi.bench.rsateconfig.Resource;

/**
 * 
 * @author robin
 * 
 */
public class AvaliableCheckedEditingSupport extends EditingSupport {

	public AvaliableCheckedEditingSupport(ColumnViewer viewer) {
		super(viewer);
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
		Resource resource = (Resource) ((com.rskytech.hmi.bench.rsateconfig.editor.model.Resource) element).getEObject();
		if (resource.getAvailable() != null && resource.getAvailable().equals("1")) {
			return true;
		}
		return false;
	}

	@Override
	protected void setValue(Object element, Object value) {

	}

}
