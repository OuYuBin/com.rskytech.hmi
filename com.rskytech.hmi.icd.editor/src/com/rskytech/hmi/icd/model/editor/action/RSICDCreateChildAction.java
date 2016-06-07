package com.rskytech.hmi.icd.model.editor.action;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.StaticSelectionCommandAction;

/**
 * 
 * @author robin
 *
 */
public class RSICDCreateChildAction extends StaticSelectionCommandAction {
	
	public String groupName;

	public RSICDCreateChildAction() {
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
