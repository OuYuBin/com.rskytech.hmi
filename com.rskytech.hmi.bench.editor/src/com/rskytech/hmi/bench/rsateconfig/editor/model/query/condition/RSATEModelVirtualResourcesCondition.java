package com.rskytech.hmi.bench.rsateconfig.editor.model.query.condition;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;

import com.rskytech.hmi.bench.rsateconfig.VirtualResources;

/**
 * 
 * @author robin
 *
 */
public class RSATEModelVirtualResourcesCondition extends EObjectCondition{

	@Override
	public boolean isSatisfied(EObject eObject) {
		if(eObject instanceof VirtualResources){
			return true;
		}
		return false;
	}

}
