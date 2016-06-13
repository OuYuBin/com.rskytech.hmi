package com.rskytech.hmi.icd.model.editor.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.rskytech.hmi.icd.common.model.IRSICDConfigContainerModel;

/**
 * 
 * @author robin
 *
 */
public class ICDAddCommand extends AddCommand {

	private Object parent;

	private Object child;

	public ICDAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, Object parent,
			Object child) {
		super(domain, owner, feature, value);
		this.parent = parent;
		this.child = child;
	}

	@Override
	public void doExecute() {
		super.doExecute();
		this.doRedo();

	}

	@Override
	public void doUndo() {
		super.doUndo();
		((IRSICDConfigContainerModel) parent).getRSICDConfigModels().remove(child);
	}

	@Override
	public void doRedo() {
		super.doRedo();
		if (parent instanceof IRSICDConfigContainerModel) {
			(((IRSICDConfigContainerModel) parent).getRSICDConfigModels()).add(child);
		}
	}

}
