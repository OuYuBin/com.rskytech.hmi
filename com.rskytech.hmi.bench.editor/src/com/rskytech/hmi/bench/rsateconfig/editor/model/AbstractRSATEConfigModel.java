package com.rskytech.hmi.bench.rsateconfig.editor.model;

import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author robin
 *
 */
public abstract class AbstractRSATEConfigModel implements IRSATEConfigModel {

	EObject eObject;
	
	public AbstractRSATEConfigModel(EObject eObject){
		this.eObject=eObject;
	}
	
	@Override
	public EObject getEObject() {
		return eObject;
	}

}
