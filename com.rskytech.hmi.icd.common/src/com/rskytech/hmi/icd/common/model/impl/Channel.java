package com.rskytech.hmi.icd.common.model.impl;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.rskytech.hmi.icd.common.model.IRSICDConfigContainerModel;
import com.rskytech.hmi.icd.common.model.IRSICDConfigModel;

/**
 * 通道
 * @author robin
 *
 */
public class Channel extends RSICDConfigModelImpl implements IRSICDConfigContainerModel {

	public Channel(EObject object){
		super(object);
	}
	
	@Override
	public List<? extends IRSICDConfigModel> getRSICDConfigModels() {
		return null;
	}

}
