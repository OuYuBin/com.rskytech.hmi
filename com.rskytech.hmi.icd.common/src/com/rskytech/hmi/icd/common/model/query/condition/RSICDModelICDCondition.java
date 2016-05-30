package com.rskytech.hmi.icd.common.model.query.condition;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;

import com.rskytech.hmi.icd.model.ICD;

public class RSICDModelICDCondition extends EObjectCondition {

	@Override
	public boolean isSatisfied(EObject eObject) {
		if (eObject instanceof ICD)
			return true;
		return false;
	}

}
