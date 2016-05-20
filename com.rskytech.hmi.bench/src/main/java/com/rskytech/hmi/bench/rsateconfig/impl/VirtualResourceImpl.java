/**
 */
package com.rskytech.hmi.bench.rsateconfig.impl;

import com.rskytech.hmi.bench.rsateconfig.Conf;
import com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage;
import com.rskytech.hmi.bench.rsateconfig.VirtualResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.VirtualResourceImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.VirtualResourceImpl#getConf <em>Conf</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.VirtualResourceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualResourceImpl extends MinimalEObjectImpl.Container implements VirtualResource {
	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected String resource = RESOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConf() <em>Conf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConf()
	 * @generated
	 * @ordered
	 */
	protected Conf conf;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RSATEConfigPackage.Literals.VIRTUAL_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(String newResource) {
		String oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.VIRTUAL_RESOURCE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conf getConf() {
		return conf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConf(Conf newConf, NotificationChain msgs) {
		Conf oldConf = conf;
		conf = newConf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.VIRTUAL_RESOURCE__CONF, oldConf, newConf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConf(Conf newConf) {
		if (newConf != conf) {
			NotificationChain msgs = null;
			if (conf != null)
				msgs = ((InternalEObject)conf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.VIRTUAL_RESOURCE__CONF, null, msgs);
			if (newConf != null)
				msgs = ((InternalEObject)newConf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.VIRTUAL_RESOURCE__CONF, null, msgs);
			msgs = basicSetConf(newConf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.VIRTUAL_RESOURCE__CONF, newConf, newConf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.VIRTUAL_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RSATEConfigPackage.VIRTUAL_RESOURCE__CONF:
				return basicSetConf(null, msgs);
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
			case RSATEConfigPackage.VIRTUAL_RESOURCE__RESOURCE:
				return getResource();
			case RSATEConfigPackage.VIRTUAL_RESOURCE__CONF:
				return getConf();
			case RSATEConfigPackage.VIRTUAL_RESOURCE__NAME:
				return getName();
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
			case RSATEConfigPackage.VIRTUAL_RESOURCE__RESOURCE:
				setResource((String)newValue);
				return;
			case RSATEConfigPackage.VIRTUAL_RESOURCE__CONF:
				setConf((Conf)newValue);
				return;
			case RSATEConfigPackage.VIRTUAL_RESOURCE__NAME:
				setName((String)newValue);
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
			case RSATEConfigPackage.VIRTUAL_RESOURCE__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case RSATEConfigPackage.VIRTUAL_RESOURCE__CONF:
				setConf((Conf)null);
				return;
			case RSATEConfigPackage.VIRTUAL_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
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
			case RSATEConfigPackage.VIRTUAL_RESOURCE__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
			case RSATEConfigPackage.VIRTUAL_RESOURCE__CONF:
				return conf != null;
			case RSATEConfigPackage.VIRTUAL_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resource: ");
		result.append(resource);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VirtualResourceImpl
