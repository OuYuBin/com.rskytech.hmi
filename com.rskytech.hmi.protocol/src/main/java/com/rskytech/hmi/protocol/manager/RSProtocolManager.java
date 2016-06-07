package com.rskytech.hmi.protocol.manager;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;

import com.rskytech.hmi.protocol.extension.manager.RSProtocolExtensionManager;
import com.rskytech.hmi.protocol.provider.IRSProtocolContentProvider;
import com.rskytech.hmi.protocol.provider.RSProtocolContentProvider;

/**
 * 
 * @author robin
 *
 */
public class RSProtocolManager {

	/**
	 * 构建总线提供器
	 */
	public static List<IRSProtocolContentProvider> createProtocolProvider(){
		List<IRSProtocolContentProvider> providers=new ArrayList<IRSProtocolContentProvider>();
		IExtension[] extensions=RSProtocolExtensionManager.generateRSProtocoExtensions();
		for(IExtension extension:extensions){
			IConfigurationElement[] elements=extension.getConfigurationElements();
			for(IConfigurationElement element:elements){
				IRSProtocolContentProvider rsProtocolContentProvder=new RSProtocolContentProvider(element);
				providers.add(rsProtocolContentProvder);
			}
		}
		return providers;
	}
	
}
