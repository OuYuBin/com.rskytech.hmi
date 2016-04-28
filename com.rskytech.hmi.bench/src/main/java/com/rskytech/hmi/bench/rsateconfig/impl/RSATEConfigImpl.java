/**
 */
package com.rskytech.hmi.bench.rsateconfig.impl;

import com.rskytech.hmi.bench.rsateconfig.Bench;
import com.rskytech.hmi.bench.rsateconfig.RSATEConfig;
import com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RSATE Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigImpl#getBench <em>Bench</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RSATEConfigImpl extends MinimalEObjectImpl.Container implements RSATEConfig {
	/**
	 * The cached value of the '{@link #getBench() <em>Bench</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBench()
	 * @generated
	 * @ordered
	 */
	protected Bench bench;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RSATEConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RSATEConfigPackage.Literals.RSATE_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bench getBench() {
		return bench;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBench(Bench newBench, NotificationChain msgs) {
		Bench oldBench = bench;
		bench = newBench;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.RSATE_CONFIG__BENCH, oldBench, newBench);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBench(Bench newBench) {
		if (newBench != bench) {
			NotificationChain msgs = null;
			if (bench != null)
				msgs = ((InternalEObject)bench).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.RSATE_CONFIG__BENCH, null, msgs);
			if (newBench != null)
				msgs = ((InternalEObject)newBench).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.RSATE_CONFIG__BENCH, null, msgs);
			msgs = basicSetBench(newBench, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.RSATE_CONFIG__BENCH, newBench, newBench));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RSATEConfigPackage.RSATE_CONFIG__BENCH:
				return basicSetBench(null, msgs);
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
			case RSATEConfigPackage.RSATE_CONFIG__BENCH:
				return getBench();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RSATEConfigPackage.RSATE_CONFIG__BENCH:
				setBench((Bench)newValue);
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
			case RSATEConfigPackage.RSATE_CONFIG__BENCH:
				setBench((Bench)null);
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
			case RSATEConfigPackage.RSATE_CONFIG__BENCH:
				return bench != null;
		}
		return super.eIsSet(featureID);
	}

} //RSATEConfigImpl
