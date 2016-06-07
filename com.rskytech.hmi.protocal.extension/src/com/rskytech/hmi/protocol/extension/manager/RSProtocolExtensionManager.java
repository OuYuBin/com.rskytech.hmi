package com.rskytech.hmi.protocol.extension.manager;

import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

/**
 * 
 * @author robin
 *
 */
public class RSProtocolExtensionManager {

	public static String RS_PROTOCOL_EXTENSION_POINT_ID="com.rskytech.hmi.protocol.extension.protocol";
	
	
	/**
	 * 获取总线协议定义信息
	 * @return
	 */
	public static IExtension[] generateRSProtocoExtensions(){
		IExtensionRegistry extensionRegistry=Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint=extensionRegistry.getExtensionPoint(RS_PROTOCOL_EXTENSION_POINT_ID);
		IExtension[] extensions=extensionPoint.getExtensions();
		return extensions;
		
	}
}
