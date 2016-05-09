package com.rskytech.hmi.bench.ui;

import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.rskytech.hmi.bench.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
	 * BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void initializeImageRegistry(ImageRegistry registry) {
		Bundle bundle = this.getBundle();
		@SuppressWarnings("rawtypes")
		Map map = new HashMap();
		map.put("Import", "icons/import.gif");
		map.put("Benches","icons/benches.gif");
		map.put("Bench", "icons/bench.gif");

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
