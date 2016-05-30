package com.rskytech.hmi.icd.common.model.query.condition;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;

import com.rskytech.hmi.icd.model.Device;

/**
 * 
 * @author robin
 *
 */
public class RSICDModelDeviceCondition extends EObjectCondition {

	@Override
	public boolean isSatisfied(EObject eObject) {
		if(eObject instanceof Device){
			return true;
		}
		return false;
	}

}
