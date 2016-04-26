package com.rskytech.hmi.users.ui.commands;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.FileStoreEditorInput;

import com.rskytech.hmi.users.core.service.UserService;

public class UserConfigManagerHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			UserService userService = UserService.getInstance();
			File file = userService.getUserConfigurationFile();
			if (file != null && file.exists()) {
				IFileStore fileStore = EFS.getLocalFileSystem().getStore(file.toURI());
				IEditorInput editorInput = new FileStoreEditorInput(fileStore);
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(editorInput,
						"com.rskytech.hmi.users.editor.UsersEditor");
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return null;
	}

}
