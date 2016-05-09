package com.rskytech.hmi.bench.ui.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import com.rskytech.hmi.bench.ui.Activator;

/**
 * 
 * @author robin
 *
 */
public class ImportBenchFileAction extends Action {

	IAdaptable adaptable;

	public ImportBenchFileAction(IAdaptable adaptable) {
		this.adaptable = adaptable;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return Activator.getDefault().getImageRegistry().getDescriptor("Import");
	}

	@Override
	public String getText() {
		return super.getText();
	}

	@Override
	public void run() {
		super.run();
		try {
			Shell shell = new Shell(Display.getCurrent(), SWT.NO_TRIM | SWT.ON_TOP);
			FileDialog dialog = new FileDialog(shell);
			String path = dialog.open();
			File file = new File(path);

			if (file.exists() && file.isFile()) {
				IPath iPath = ResourcesPlugin.getWorkspace().getRoot().getLocation();

				File benchFolder = iPath.append("Benches").toFile();
				if (!benchFolder.exists()) {
					benchFolder.mkdir();

				}
				File benchFile = iPath.append("Benches").append(file.getName()).toFile();
				if (!benchFile.exists()) {
					benchFile.createNewFile();
				}
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);

				FileWriter fileWriter = new FileWriter(benchFile);
				char[] buf = new char[1024];
				int len = 0;
				while ((len = fileReader.read(buf)) != -1) {
					fileWriter.write(buf, 0, len);
				}

				fileWriter.flush();
				TreeViewer treeViewer = adaptable.getAdapter(TreeViewer.class);
				treeViewer.refresh();
				treeViewer.expandAll();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
