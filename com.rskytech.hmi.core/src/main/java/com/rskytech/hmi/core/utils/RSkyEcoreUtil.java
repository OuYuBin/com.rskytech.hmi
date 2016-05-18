package com.rskytech.hmi.core.utils;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * 
 * @author robin
 *
 */
public class RSkyEcoreUtil {

	public static EList<EReference> getReferences(EObject eObject){
		return eObject.eClass().getEAllReferences();
	}
	
//	public static EList<EReference> getReferences(EClassifier eClassifier){
//		return eClassifier.
//	}
	
}
