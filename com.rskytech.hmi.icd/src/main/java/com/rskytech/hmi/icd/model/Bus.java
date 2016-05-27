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
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.icd.model.Bus#getChannel <em>Channel</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.icd.model.RSICDConfigPackage#getBus()
 * @model extendedMetaData="name='Bus' kind='elementOnly'"
 * @generated
 */
public interface Bus extends EObject {
	/**
	 * Returns the value of the '<em><b>Channel</b></em>' containment reference list.
	 * The list contents are of type {@link com.rskytech.hmi.icd.model.Channel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' containment reference list.
	 * @see com.rskytech.hmi.icd.model.RSICDConfigPackage#getBus_Channel()
	 * @model type="com.rskytech.hmi.icd.model.Channel" containment="true"
	 *        extendedMetaData="kind='element' name='Channel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getChannel();

} // Bus
