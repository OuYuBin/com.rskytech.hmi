package com.rskytech.hmi.protocol.provider;

import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;

import com.rskytech.hmi.protocol.model.Attr;

/**
 * 
 * @author robin
 *
 */
public class RSProtocolContentProvider implements IRSProtocolContentProvider{
	
	IConfigurationElement configurationElement;
	
	public RSProtocolContentProvider(IConfigurationElement configurationElement){
		this.configurationElement=configurationElement;
	}
	

	@Override
	public String getProtocolName() {
		return configurationElement.getAttribute("name");
	}

	@Override
	public List<Attr> getAttributes() {
		return null;
	}


	@Override
	public String getGroupName() {
		return configurationElement.getAttribute("groupName");
	}

	
}
