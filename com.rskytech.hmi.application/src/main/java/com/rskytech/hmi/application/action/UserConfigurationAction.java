package com.rskytech.hmi.application.action;

import java.io.File;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.FileStoreEditorInput;

import com.rskytech.hmi.users.core.service.UserService;

/**
 * 
 * @author robin
 *
 */
public class UserConfigurationAction extends Action {
	IWorkbenchWindow window;

	public UserConfigurationAction(IWorkbenchWindow window) {
		this.window = window;
		setText("用户管理");
		setId("com.rskytech.hmi.application.action.UserConfigurationAction");
		
	}

	@Override
	public void run() {
		super.run();
		try {
			UserService userService = UserService.getInstance();
			File file = userService.getUserConfigurationFile();
			if (file != null && file.exists()) {
				IFileStore fileStore = EFS.getLocalFileSystem().getStore(file.toURI());
				IEditorInput editorInput = new FileStoreEditorInput(fileStore);
				window.getActivePage().openEditor(editorInput, "com.rskytech.hmi.users.editor.UsersEditorID");
			}
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
