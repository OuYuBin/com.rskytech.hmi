/**
 */
package com.rskytech.hmi.bench.rsateconfig.impl;

import com.rskytech.hmi.bench.rsateconfig.Bench;
import com.rskytech.hmi.bench.rsateconfig.Drivers;
import com.rskytech.hmi.bench.rsateconfig.Nodes;
import com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage;

import com.rskytech.hmi.bench.rsateconfig.Resouces;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bench</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.BenchImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.BenchImpl#getDrivers <em>Drivers</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.BenchImpl#getResouces <em>Resouces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BenchImpl extends MinimalEObjectImpl.Container implements Bench {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected Nodes nodes;

	/**
	 * The cached value of the '{@link #getDrivers() <em>Drivers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivers()
	 * @generated
	 * @ordered
	 */
	protected Drivers drivers;

	/**
	 * The cached value of the '{@link #getResouces() <em>Resouces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResouces()
	 * @generated
	 * @ordered
	 */
	protected Resouces resouces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BenchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RSATEConfigPackage.Literals.BENCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodes getNodes() {
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodes(Nodes newNodes, NotificationChain msgs) {
		Nodes oldNodes = nodes;
		nodes = newNodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__NODES, oldNodes, newNodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodes(Nodes newNodes) {
		if (newNodes != nodes) {
			NotificationChain msgs = null;
			if (nodes != null)
				msgs = ((InternalEObject)nodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.BENCH__NODES, null, msgs);
			if (newNodes != null)
				msgs = ((InternalEObject)newNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.BENCH__NODES, null, msgs);
			msgs = basicSetNodes(newNodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__NODES, newNodes, newNodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drivers getDrivers() {
		return drivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDrivers(Drivers newDrivers, NotificationChain msgs) {
		Drivers oldDrivers = drivers;
		drivers = newDrivers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__DRIVERS, oldDrivers, newDrivers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrivers(Drivers newDrivers) {
		if (newDrivers != drivers) {
			NotificationChain msgs = null;
			if (drivers != null)
				msgs = ((InternalEObject)drivers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.BENCH__DRIVERS, null, msgs);
			if (newDrivers != null)
				msgs = ((InternalEObject)newDrivers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.BENCH__DRIVERS, null, msgs);
			msgs = basicSetDrivers(newDrivers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__DRIVERS, newDrivers, newDrivers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resouces getResouces() {
		return resouces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResouces(Resouces newResouces, NotificationChain msgs) {
		Resouces oldResouces = resouces;
		resouces = newResouces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__RESOUCES, oldResouces, newResouces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResouces(Resouces newResouces) {
		if (newResouces != resouces) {
			NotificationChain msgs = null;
			if (resouces != null)
				msgs = ((InternalEObject)resouces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.BENCH__RESOUCES, null, msgs);
			if (newResouces != null)
				msgs = ((InternalEObject)newResouces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.BENCH__RESOUCES, null, msgs);
			msgs = basicSetResouces(newResouces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__RESOUCES, newResouces, newResouces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RSATEConfigPackage.BENCH__NODES:
				return basicSetNodes(null, msgs);
			case RSATEConfigPackage.BENCH__DRIVERS:
				return basicSetDrivers(null, msgs);
			case RSATEConfigPackage.BENCH__RESOUCES:
				return basicSetResouces(null, msgs);
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
			case RSATEConfigPackage.BENCH__NODES:
				return getNodes();
			case RSATEConfigPackage.BENCH__DRIVERS:
				return getDrivers();
			case RSATEConfigPackage.BENCH__RESOUCES:
				return getResouces();
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
			case RSATEConfigPackage.BENCH__NODES:
				setNodes((Nodes)newValue);
				return;
			case RSATEConfigPackage.BENCH__DRIVERS:
				setDrivers((Drivers)newValue);
				return;
			case RSATEConfigPackage.BENCH__RESOUCES:
				setResouces((Resouces)newValue);
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
			case RSATEConfigPackage.BENCH__NODES:
				setNodes((Nodes)null);
				return;
			case RSATEConfigPackage.BENCH__DRIVERS:
				setDrivers((Drivers)null);
				return;
			case RSATEConfigPackage.BENCH__RESOUCES:
				setResouces((Resouces)null);
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
			case RSATEConfigPackage.BENCH__NODES:
				return nodes != null;
			case RSATEConfigPackage.BENCH__DRIVERS:
				return drivers != null;
			case RSATEConfigPackage.BENCH__RESOUCES:
				return resouces != null;
		}
		return super.eIsSet(featureID);
	}

} //BenchImpl
