package com.rskytech.hmi.bench.rsateconfig.editor.model.query.condition;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;

import com.rskytech.hmi.bench.rsateconfig.Node;

/**
 * 
 * @author robin
 *
 */
public class RSATEModelNodeCondition extends EObjectCondition{

	@Override
	public boolean isSatisfied(EObject eObject) {
		if(eObject instanceof Node){
			return true;
		}
		return false;
	}

}
