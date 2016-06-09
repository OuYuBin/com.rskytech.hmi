package com.rskytech.hmi.icd.common.model.query;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;

import com.rskytech.hmi.icd.common.model.query.condition.RSICDModelDeviceCondition;
import com.rskytech.hmi.icd.common.model.query.condition.RSICDModelICDCondition;

/**
 * 
 * @author robin
 *
 */
public class ModelQuery {

	public static Collection<?> queryICD(EObject root) {
		SELECT select = new SELECT(new FROM(root), new WHERE(new RSICDModelICDCondition()));
		return select.execute();
	}
	
	public static Collection<?> queryDeivces(EObject root){
		SELECT select=new SELECT(new FROM(root), new WHERE(new RSICDModelDeviceCondition()));
		return select.execute();
	}
	

}
