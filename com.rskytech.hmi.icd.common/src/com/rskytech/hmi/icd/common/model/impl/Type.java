package com.rskytech.hmi.icd.common.model.impl;

import java.util.ArrayList;
import java.util.List;

import com.rskytech.hmi.icd.common.model.IRSICDConfigContainerModel;
import com.rskytech.hmi.icd.common.model.IRSICDConfigModel;

/**
 * 
 * @author robin
 *
 */
public class Type extends RSICDConfigModelImpl implements IRSICDConfigContainerModel{
	
	private List<Channel> channels=new ArrayList<Channel>();

	public Type() {
		super();
	}

	@Override
	public List<? extends IRSICDConfigModel> getRSICDConfigModels() {
		return channels;
	}
	
	public void addChannel(Channel channel){
		channels.add(channel);
	}
	
}
