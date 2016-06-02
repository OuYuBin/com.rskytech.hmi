package com.rskytech.hmi.icd.common.model.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.rskytech.hmi.icd.common.model.IRSICDConfigContainerModel;
import com.rskytech.hmi.icd.common.model.IRSICDConfigModel;

/**
 * 
 * @author robin
 *
 */
public class Device  extends RSICDConfigModelImpl implements IRSICDConfigContainerModel {

	private List<Type> types=new ArrayList<Type>();
	
	public Device(EObject eObject) {
		super(eObject);
	}

	@Override
	public List<? extends IRSICDConfigModel> getRSICDConfigModels() {
		return types;
	}
	
	public void addType(Type type){
		types.add(type);
	}
	

}
