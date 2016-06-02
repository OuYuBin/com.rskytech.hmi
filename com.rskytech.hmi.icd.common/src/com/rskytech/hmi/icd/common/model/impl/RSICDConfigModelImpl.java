package com.rskytech.hmi.icd.common.model.impl;

import org.eclipse.emf.ecore.EObject;

import com.rskytech.hmi.icd.common.model.IRSICDConfigModel;

/**
 * 
 * @author robin
 *
 */
public class RSICDConfigModelImpl implements IRSICDConfigModel {

	// --封装的EMF对象信息
	private EObject eObject;

	private String name;

	public RSICDConfigModelImpl() {

	}

	public RSICDConfigModelImpl(EObject eObject) {
		this.eObject = eObject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EObject geteObject() {
		return eObject;
	}

	public void seteObject(EObject eObject) {
		this.eObject = eObject;
	}

}
