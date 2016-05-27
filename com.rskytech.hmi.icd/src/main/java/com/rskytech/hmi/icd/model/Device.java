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
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.icd.model.Device#getChannels <em>Channels</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.icd.model.RSICDConfigPackage#getDevice()
 * @model extendedMetaData="name='Device' kind='empty'"
 * @generated
 */
public interface Device extends ICDElement {

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' reference list.
	 * The list contents are of type {@link com.rskytech.hmi.icd.model.Channel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' reference list.
	 * @see com.rskytech.hmi.icd.model.RSICDConfigPackage#getDevice_Channels()
	 * @model type="com.rskytech.hmi.icd.model.Channel" resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='channels' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getChannels();
} // Device
