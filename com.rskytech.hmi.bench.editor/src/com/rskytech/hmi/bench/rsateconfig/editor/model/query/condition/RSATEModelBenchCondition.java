package com.rskytech.hmi.bench.rsateconfig.editor.model.query.condition;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;

import com.rskytech.hmi.bench.rsateconfig.Bench;

/**
 * 
 * @author robin
 *
 */
public class RSATEModelBenchCondition extends EObjectCondition{

	@Override
	public boolean isSatisfied(EObject eObject) {
		if(eObject instanceof Bench){
			return true;
		}
		return false;
	}

}
