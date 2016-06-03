/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.rskytech.hmi.icd.model;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.icd.model.Channel#getConfig <em>Config</em>}</li>
 *   <li>{@link com.rskytech.hmi.icd.model.Channel#getDatas <em>Datas</em>}</li>
 *   <li>{@link com.rskytech.hmi.icd.model.Channel#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.icd.model.RSICDConfigPackage#getChannel()
 * @model extendedMetaData="name='Channel' kind='elementOnly'"
 * @generated
 */
public interface Channel extends ICDElement {

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference list.
	 * The list contents are of type {@link com.rskytech.hmi.icd.model.Config}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference list.
	 * @see com.rskytech.hmi.icd.model.RSICDConfigPackage#getChannel_Config()
	 * @model type="com.rskytech.hmi.icd.model.Config" containment="true"
	 *        extendedMetaData="kind='element' name='config' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getConfig();

	/**
	 * Returns the value of the '<em><b>Datas</b></em>' reference list.
	 * The list contents are of type {@link com.rskytech.hmi.icd.model.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datas</em>' reference list.
	 * @see com.rskytech.hmi.icd.model.RSICDConfigPackage#getChannel_Datas()
	 * @model type="com.rskytech.hmi.icd.model.Data" resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='datas' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getDatas();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.rskytech.hmi.icd.model.RSICDConfigPackage#getChannel_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.icd.model.Channel#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);
} // Channel
