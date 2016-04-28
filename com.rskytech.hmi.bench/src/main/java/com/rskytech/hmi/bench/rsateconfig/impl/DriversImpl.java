/**
 */
package com.rskytech.hmi.bench.rsateconfig.impl;

import com.rskytech.hmi.bench.rsateconfig.Driver;
import com.rskytech.hmi.bench.rsateconfig.Drivers;
import com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drivers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.DriversImpl#getDriver <em>Driver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriversImpl extends MinimalEObjectImpl.Container implements Drivers {
	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected EList<Driver> driver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriversImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RSATEConfigPackage.Literals.DRIVERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Driver> getDriver() {
		if (driver == null) {
			driver = new EObjectContainmentEList<Driver>(Driver.class, this, RSATEConfigPackage.DRIVERS__DRIVER);
		}
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RSATEConfigPackage.DRIVERS__DRIVER:
				return ((InternalEList<?>)getDriver()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RSATEConfigPackage.DRIVERS__DRIVER:
				return getDriver();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RSATEConfigPackage.DRIVERS__DRIVER:
				getDriver().clear();
				getDriver().addAll((Collection<? extends Driver>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RSATEConfigPackage.DRIVERS__DRIVER:
				getDriver().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RSATEConfigPackage.DRIVERS__DRIVER:
				return driver != null && !driver.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DriversImpl
