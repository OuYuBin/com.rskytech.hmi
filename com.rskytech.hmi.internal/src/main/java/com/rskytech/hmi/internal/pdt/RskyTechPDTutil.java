package com.rskytech.hmi.internal.pdt;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

/**
 * 
 * @author robin
 *
 */
public class RskyTechPDTutil {
	public static Bundle getBundle(String pluginId){
		return Platform.getBundle(pluginId);
	}
}
