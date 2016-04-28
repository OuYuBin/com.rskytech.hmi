package com.rskytech.hmi.internal.resource;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;

/**
 * 
 * @author robin
 *
 */
public class ResourceUtil {

	public static IProject getProject(String name){
		return ResourcesPlugin.getWorkspace().getRoot().getProject(name);
	}
	
}
