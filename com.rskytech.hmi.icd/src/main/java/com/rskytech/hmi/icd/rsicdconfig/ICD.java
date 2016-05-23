/**
 */
package com.rskytech.hmi.icd.rsicdconfig;

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
 *   <li>{@link com.rskytech.hmi.icd.rsicdconfig.ICD#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.icd.rsicdconfig.RSICDConfigPackage#getICD()
 * @model extendedMetaData="name='ICD' kind='empty'"
 * @generated
 */
public interface ICD extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rskytech.hmi.icd.rsicdconfig.RSICDConfigPackage#getICD_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.icd.rsicdconfig.ICD#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ICD
