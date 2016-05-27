/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.rskytech.hmi.icd.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.icd.model.ICD#getDevice <em>Device</em>}</li>
 *   <li>{@link com.rskytech.hmi.icd.model.ICD#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.icd.model.RSICDConfigPackage#getICD()
 * @model extendedMetaData="name='ICD' kind='elementOnly'"
 * @generated
 */
public interface ICD extends EObject {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link com.rskytech.hmi.icd.model.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see com.rskytech.hmi.icd.model.RSICDConfigPackage#getICD_Device()
	 * @model type="com.rskytech.hmi.icd.model.Device" containment="true"
	 *        extendedMetaData="kind='element' name='Device' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getDevice();

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' containment reference.
	 * @see #setBus(Bus)
	 * @see com.rskytech.hmi.icd.model.RSICDConfigPackage#getICD_Bus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bus' namespace='##targetNamespace'"
	 * @generated
	 */
	Bus getBus();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.icd.model.ICD#getBus <em>Bus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus</em>' containment reference.
	 * @see #getBus()
	 * @generated
	 */
	void setBus(Bus value);

} // ICD
