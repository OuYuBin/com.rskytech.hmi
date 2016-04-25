/**
 */
package com.rskytech.hmi.users.impl;

import com.rskytech.hmi.users.Profile;
import com.rskytech.hmi.users.User;
import com.rskytech.hmi.users.UsersConfiguration;
import com.rskytech.hmi.users.UsersPackage;

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
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.rskytech.hmi.users.impl.UsersConfigurationImpl#getUser <em>User</em>}</li>
 *   <li>{@link com.rskytech.hmi.users.impl.UsersConfigurationImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsersConfigurationImpl extends MinimalEObjectImpl.Container implements UsersConfiguration {
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList user;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected EList profile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsersConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsersPackage.Literals.USERS_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUser() {
		if (user == null) {
			user = new EObjectContainmentEList(User.class, this, UsersPackage.USERS_CONFIGURATION__USER);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProfile() {
		if (profile == null) {
			profile = new EObjectContainmentEList(Profile.class, this, UsersPackage.USERS_CONFIGURATION__PROFILE);
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsersPackage.USERS_CONFIGURATION__USER:
				return ((InternalEList)getUser()).basicRemove(otherEnd, msgs);
			case UsersPackage.USERS_CONFIGURATION__PROFILE:
				return ((InternalEList)getProfile()).basicRemove(otherEnd, msgs);
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
			case UsersPackage.USERS_CONFIGURATION__USER:
				return getUser();
			case UsersPackage.USERS_CONFIGURATION__PROFILE:
				return getProfile();
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
			case UsersPackage.USERS_CONFIGURATION__USER:
				getUser().clear();
				getUser().addAll((Collection)newValue);
				return;
			case UsersPackage.USERS_CONFIGURATION__PROFILE:
				getProfile().clear();
				getProfile().addAll((Collection)newValue);
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
			case UsersPackage.USERS_CONFIGURATION__USER:
				getUser().clear();
				return;
			case UsersPackage.USERS_CONFIGURATION__PROFILE:
				getProfile().clear();
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
			case UsersPackage.USERS_CONFIGURATION__USER:
				return user != null && !user.isEmpty();
			case UsersPackage.USERS_CONFIGURATION__PROFILE:
				return profile != null && !profile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UsersConfigurationImpl
