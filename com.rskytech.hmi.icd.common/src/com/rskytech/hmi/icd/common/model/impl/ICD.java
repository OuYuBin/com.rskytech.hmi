package com.rskytech.hmi.icd.common.model.impl;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.rskytech.hmi.icd.common.model.IRSICDConfigContainerModel;
import com.rskytech.hmi.icd.common.model.IRSICDConfigModel;

/**
 * 
 * @author robin
 *
 */
public class ICD extends RSICDConfigModelImpl implements IRSICDConfigContainerModel {
	
	

	public ICD(EObject eObject) {
		super(eObject);
	}

	@Override
	public List<? extends IRSICDConfigModel> getRSICDConfigModels() {
		return null;
	}

}
