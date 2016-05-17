/**
 */
package com.rskytech.hmi.bench.rsateconfig.impl;

import com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage;
import com.rskytech.hmi.bench.rsateconfig.VirtualResource;
import com.rskytech.hmi.bench.rsateconfig.VirtualResources;

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
 * An implementation of the model object '<em><b>Virtual Resources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.VirtualResourcesImpl#getVirtualResource <em>Virtual Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualResourcesImpl extends MinimalEObjectImpl.Container implements VirtualResources {
	/**
	 * The cached value of the '{@link #getVirtualResource() <em>Virtual Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualResource()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualResource> virtualResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualResourcesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RSATEConfigPackage.Literals.VIRTUAL_RESOURCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualResource> getVirtualResource() {
		if (virtualResource == null) {
			virtualResource = new EObjectContainmentEList<VirtualResource>(VirtualResource.class, this, RSATEConfigPackage.VIRTUAL_RESOURCES__VIRTUAL_RESOURCE);
		}
		return virtualResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RSATEConfigPackage.VIRTUAL_RESOURCES__VIRTUAL_RESOURCE:
				return ((InternalEList<?>)getVirtualResource()).basicRemove(otherEnd, msgs);
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
			case RSATEConfigPackage.VIRTUAL_RESOURCES__VIRTUAL_RESOURCE:
				return getVirtualResource();
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
			case RSATEConfigPackage.VIRTUAL_RESOURCES__VIRTUAL_RESOURCE:
				getVirtualResource().clear();
				getVirtualResource().addAll((Collection<? extends VirtualResource>)newValue);
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
			case RSATEConfigPackage.VIRTUAL_RESOURCES__VIRTUAL_RESOURCE:
				getVirtualResource().clear();
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
			case RSATEConfigPackage.VIRTUAL_RESOURCES__VIRTUAL_RESOURCE:
				return virtualResource != null && !virtualResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VirtualResourcesImpl
