package com.rskytech.hmi.bench.rsateconfig.editor.model.query.condition;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;

import com.rskytech.hmi.bench.rsateconfig.Resources;

/**
 * 
 * @author robin
 *
 */
public class RSATEModelResourcesCondition extends EObjectCondition{

	@Override
	public boolean isSatisfied(EObject eObject) {
		if(eObject instanceof Resources){
			return true;
		}
		return false;
	}

}
