package com.rskytech.hmi.icd.common.model.manager;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import com.rskytech.hmi.icd.common.model.impl.ICD;
import com.rskytech.hmi.icd.common.model.query.ModelQuery;

/**
 * 
 * @author robin
 *
 */
public class RSICDConfigModelManager {

	public static ICD createICD(EObject eObject){
		Collection<?> collections=ModelQuery.queryICD(eObject);
		com.rskytech.hmi.icd.model.ICD eIcd=(com.rskytech.hmi.icd.model.ICD) collections.toArray()[0];
		ICD icd=new ICD(eIcd);
		
		//--获取device设备信息
		
		return icd;
	}
}
