/**
 */
package com.rskytech.hmi.icd.rsicdconfig.impl;

import com.rskytech.hmi.icd.rsicdconfig.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RSICDConfigFactoryImpl extends EFactoryImpl implements RSICDConfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RSICDConfigFactory init() {
		try {
			RSICDConfigFactory theRSICDConfigFactory = (RSICDConfigFactory)EPackage.Registry.INSTANCE.getEFactory(RSICDConfigPackage.eNS_URI);
			if (theRSICDConfigFactory != null) {
				return theRSICDConfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RSICDConfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSICDConfigFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RSICDConfigPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case RSICDConfigPackage.ICD: return createICD();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICD createICD() {
		ICDImpl icd = new ICDImpl();
		return icd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSICDConfigPackage getRSICDConfigPackage() {
		return (RSICDConfigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RSICDConfigPackage getPackage() {
		return RSICDConfigPackage.eINSTANCE;
	}

} //RSICDConfigFactoryImpl
