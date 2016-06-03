/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.rskytech.hmi.icd.model.editor;

import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.osgi.framework.Bundle;

/**
 * This is the central singleton for the RSICD editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class RSICDEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RSICDEditorPlugin INSTANCE = new RSICDEditorPlugin();
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSICDEditorPlugin() {
		super
			(new ResourceLocator [] {
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
		@SuppressWarnings("unchecked")
		@Override
		protected void initializeImageRegistry(ImageRegistry registry) {
			Bundle bundle = this.getBundle();
			@SuppressWarnings("rawtypes")
			Map map = new HashMap();
			map.put("ICD", "icons/icd.gif");
			map.put("Device", "icons/device.gif");
			map.put("Type","icons/type.gif");
			map.put("Channel","icons/channel.gif");

			for (@SuppressWarnings("rawtypes")
			Iterator iter = map.entrySet().iterator(); iter.hasNext();) {
				@SuppressWarnings("rawtypes")
				Map.Entry entry = (Entry) iter.next();
				IPath path = new Path((String) entry.getValue());
				URL url = FileLocator.find(bundle, path, null);
				ImageDescriptor desc = ImageDescriptor.createFromURL(url);
				registry.put((String) entry.getKey(), desc);
			}
		}
	}

}
