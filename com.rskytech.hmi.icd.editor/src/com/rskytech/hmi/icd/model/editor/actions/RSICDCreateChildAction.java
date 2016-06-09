package com.rskytech.hmi.icd.model.editor.actions;

import java.util.Collection;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.StaticSelectionCommandAction;
import org.eclipse.ui.IEditorPart;

import com.rskytech.hmi.icd.model.editor.commands.ICDAddCommand;

/**
 * 
 * @author robin
 *
 */
public class RSICDCreateChildAction extends StaticSelectionCommandAction {

	public String groupName;

	public EObject eObject;

	public CommandParameter descriptor;

	public Object parent;

	public Object child;

	public RSICDCreateChildAction(IEditorPart editorPart) {
		super(editorPart);

	}

	public RSICDCreateChildAction(IEditorPart editorPart, EObject eObject, Object descriptor, Object parent,
			Object child) {
		this(editorPart);
		this.eObject = eObject;
		this.descriptor = (CommandParameter) descriptor;
		this.parent = parent;
		this.child = child;
	}

	@Override
	public void run() {
		EObject eChild = descriptor.getEValue();
		EStructuralFeature feature = eObject.eClass()
				.getEStructuralFeature(StringUtils.uncapitalize(eChild.eClass().getName()));
		ICDAddCommand addCommand = new ICDAddCommand(editingDomain, eObject, feature, eChild, parent, child);
		this.editingDomain.getCommandStack().execute(addCommand);
	}

	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection<?> collection) {
		return null;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
