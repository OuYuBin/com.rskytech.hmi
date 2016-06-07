package com.rskytech.hmi.protocol.provider;

import java.util.List;

import com.rskytech.hmi.protocol.model.Attr;

/**
 * 
 * @author robin
 *
 */
public interface IRSProtocolContentProvider {
	
	public String getGroupName();

	public String getProtocolName();
	
	public List<Attr> getAttributes();
	
}
