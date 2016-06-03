/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.rskytech.hmi.icd.model.util;

import com.rskytech.hmi.icd.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.rskytech.hmi.icd.model.RSICDConfigPackage
 * @generated
 */
public class RSICDConfigAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RSICDConfigPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSICDConfigAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RSICDConfigPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RSICDConfigSwitch modelSwitch =
		new RSICDConfigSwitch() {
			public Object caseBus(Bus object) {
				return createBusAdapter();
			}
			public Object caseChannel(Channel object) {
				return createChannelAdapter();
			}
			public Object caseConfig(Config object) {
				return createConfigAdapter();
			}
			public Object caseData(Data object) {
				return createDataAdapter();
			}
			public Object caseDevice(Device object) {
				return createDeviceAdapter();
			}
			public Object caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			public Object caseICD(ICD object) {
				return createICDAdapter();
			}
			public Object caseICDElement(ICDElement object) {
				return createICDElementAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.icd.model.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.icd.model.Bus
	 * @generated
	 */
	public Adapter createBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.icd.model.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.icd.model.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.icd.model.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.icd.model.Config
	 * @generated
	 */
	public Adapter createConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.icd.model.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.icd.model.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.icd.model.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.icd.model.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.icd.model.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.icd.model.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.icd.model.ICD <em>ICD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.icd.model.ICD
	 * @generated
	 */
	public Adapter createICDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.icd.model.ICDElement <em>ICD Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.icd.model.ICDElement
	 * @generated
	 */
	public Adapter createICDElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RSICDConfigAdapterFactory
