/**
 */
package com.rskytech.hmi.bench.rsateconfig.editor;

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
 * This is the central singleton for the RSATEConfig editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class RSATEConfigEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RSATEConfigEditorPlugin INSTANCE = new RSATEConfigEditorPlugin();
	
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
	public RSATEConfigEditorPlugin() {
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
	@Override
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
			map.put("Bench", "icons/bench.gif");
			map.put("Node","icons/node.gif");
			map.put("Resources","icons/resources.gif");
			map.put("Resource", "icons/resource.gif");
			map.put("VirtualResources","icons/virtual_resources.gif");
			map.put("VirtualResource", "icons/virtual_resource.gif");
			map.put("CheckBoxOn", "icons/Check_box_on.gif");
			map.put("CheckBoxOff", "icons/check_box_off.gif");

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
