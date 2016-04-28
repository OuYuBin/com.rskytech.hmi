package com.rskytech.hmi.project.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.rskytech.hmi.project.wizard.NewRskyTechTestProjectWizard;

/**
 * 
 * @author robin
 *
 */
public class NewRskyTechTestProjectHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		NewRskyTechTestProjectWizard newRSkyTechTestProjectWizard = new NewRskyTechTestProjectWizard();
		newRSkyTechTestProjectWizard.init(window.getWorkbench(), null);
		WizardDialog wizardDialog = new WizardDialog(window.getShell(), newRSkyTechTestProjectWizard);
		wizardDialog.setMinimumPageSize(500, 300);
		wizardDialog.setPageSize(500, 300);
		wizardDialog.create();
		wizardDialog.open();
		return null;
	}

}
