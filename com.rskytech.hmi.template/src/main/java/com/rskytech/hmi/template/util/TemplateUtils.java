package com.rskytech.hmi.template.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.osgi.framework.Bundle;

import com.rskytech.hmi.template.Activator;

/**
 * 
 * @author robin
 *
 */
public class TemplateUtils {

	public static void copyFolderFromTemplate(IProject project, String srcPath, IFolder destFolder) {
		Bundle bundle = Activator.getDefault().getBundle();
		URL url = bundle.getEntry("template" + File.separator + srcPath);

		InputStream in = null;
		try {
			File file = new File(FileLocator.toFileURL(url).getFile());
			File[] srcFiles = file.listFiles();

			for (int i = 0; i < srcFiles.length; ++i) {
				String srcFileName = srcFiles[i].getName();
				if (StringUtils.equals(".svn", srcFileName))
					continue;
				if (srcFiles[i].isDirectory()) {
					IFolder folder;
					if (destFolder != null) {
						folder = destFolder.getFolder(srcFileName);
					} else {
						folder = project.getFolder(srcFileName);
					}
					if (!folder.exists()) {
						folder.create(true, true, null);
					}
					copyFolderFromTemplate(project, srcPath +File.separator+ srcFileName, folder);
				} else if (srcFiles[i].isFile()) {
					in = FileLocator.openStream(bundle, new Path(srcPath + srcFileName), false);
					IFile destFile = null;
					if (destFolder != null) {
						destFile = destFolder.getFile(srcFileName);
					} else {
						destFile = project.getFile(srcFileName);
					}
					if (destFile.exists()) {
						destFile.delete(true, null);
					}
					destFolder.getFile(srcFileName).create(in, true, null);
					destFile.setCharset("UTF-8");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			try {
				if (in != null)
					in.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (CoreException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
