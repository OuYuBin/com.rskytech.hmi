/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.rskytech.hmi.icd.model.impl;

import com.rskytech.hmi.icd.model.*;

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
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RSICDConfigPackage.BUS: return createBus();
			case RSICDConfigPackage.CHANNEL: return createChannel();
			case RSICDConfigPackage.CONFIG: return createConfig();
			case RSICDConfigPackage.DATA: return createData();
			case RSICDConfigPackage.DEVICE: return createDevice();
			case RSICDConfigPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case RSICDConfigPackage.ICD: return createICD();
			case RSICDConfigPackage.ICD_ELEMENT: return createICDElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus createBus() {
		BusImpl bus = new BusImpl();
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config createConfig() {
		ConfigImpl config = new ConfigImpl();
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
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
	public ICDElement createICDElement() {
		ICDElementImpl icdElement = new ICDElementImpl();
		return icdElement;
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
	public static RSICDConfigPackage getPackage() {
		return RSICDConfigPackage.eINSTANCE;
	}

} //RSICDConfigFactoryImpl
