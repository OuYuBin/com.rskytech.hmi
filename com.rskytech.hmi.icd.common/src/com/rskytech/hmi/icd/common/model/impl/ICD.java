package com.rskytech.hmi.icd.common.model.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.rskytech.hmi.icd.common.model.IRSICDConfigContainerModel;
import com.rskytech.hmi.icd.common.model.IRSICDConfigModel;
import com.rskytech.hmi.icd.common.model.annotation.ICDModelAnnotation;

/**
 * 
 * @author robin
 *
 */
@ICDModelAnnotation(childWrappingWithEmfClass = { "com.rskytech.hmi.icd.model.Device",
		"com.rskytech.hmi.icd.common.model.impl.Device" })
public class ICD extends RSICDConfigModelImpl implements IRSICDConfigContainerModel {

	List<Device> devices = new ArrayList<Device>();

	public ICD(EObject eObject) {
		super(eObject);
	}

	@Override
	public List<? extends IRSICDConfigModel> getRSICDConfigModels() {
		return devices;
	}

	public void addDevice(Device device) {
		devices.add(device);
	}

}
