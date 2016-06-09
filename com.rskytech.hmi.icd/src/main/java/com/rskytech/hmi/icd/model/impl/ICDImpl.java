/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.rskytech.hmi.icd.model.impl;

import com.rskytech.hmi.icd.model.Bus;
import com.rskytech.hmi.icd.model.Data;
import com.rskytech.hmi.icd.model.Device;
import com.rskytech.hmi.icd.model.ICD;
import com.rskytech.hmi.icd.model.RSICDConfigPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ICD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.icd.model.impl.ICDImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link com.rskytech.hmi.icd.model.impl.ICDImpl#getBus <em>Bus</em>}</li>
 *   <li>{@link com.rskytech.hmi.icd.model.impl.ICDImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ICDImpl extends MinimalEObjectImpl.Container implements ICD {
	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList device;

	/**
	 * The cached value of the '{@link #getBus() <em>Bus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus()
	 * @generated
	 * @ordered
	 */
	protected Bus bus;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ICDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RSICDConfigPackage.Literals.ICD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList(Device.class, this, RSICDConfigPackage.ICD__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus getBus() {
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBus(Bus newBus, NotificationChain msgs) {
		Bus oldBus = bus;
		bus = newBus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSICDConfigPackage.ICD__BUS, oldBus, newBus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBus(Bus newBus) {
		if (newBus != bus) {
			NotificationChain msgs = null;
			if (bus != null)
				msgs = ((InternalEObject)bus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSICDConfigPackage.ICD__BUS, null, msgs);
			if (newBus != null)
				msgs = ((InternalEObject)newBus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSICDConfigPackage.ICD__BUS, null, msgs);
			msgs = basicSetBus(newBus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSICDConfigPackage.ICD__BUS, newBus, newBus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getData() {
		if (data == null) {
			data = new EObjectContainmentEList(Data.class, this, RSICDConfigPackage.ICD__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RSICDConfigPackage.ICD__DEVICE:
				return ((InternalEList)getDevice()).basicRemove(otherEnd, msgs);
			case RSICDConfigPackage.ICD__BUS:
				return basicSetBus(null, msgs);
			case RSICDConfigPackage.ICD__DATA:
				return ((InternalEList)getData()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RSICDConfigPackage.ICD__DEVICE:
				return getDevice();
			case RSICDConfigPackage.ICD__BUS:
				return getBus();
			case RSICDConfigPackage.ICD__DATA:
				return getData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RSICDConfigPackage.ICD__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection)newValue);
				return;
			case RSICDConfigPackage.ICD__BUS:
				setBus((Bus)newValue);
				return;
			case RSICDConfigPackage.ICD__DATA:
				getData().clear();
				getData().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case RSICDConfigPackage.ICD__DEVICE:
				getDevice().clear();
				return;
			case RSICDConfigPackage.ICD__BUS:
				setBus((Bus)null);
				return;
			case RSICDConfigPackage.ICD__DATA:
				getData().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RSICDConfigPackage.ICD__DEVICE:
				return device != null && !device.isEmpty();
			case RSICDConfigPackage.ICD__BUS:
				return bus != null;
			case RSICDConfigPackage.ICD__DATA:
				return data != null && !data.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ICDImpl
