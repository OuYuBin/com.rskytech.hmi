/**
 */
package com.rskytech.hmi.icd.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.icd.model.Data#getDatas <em>Datas</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.icd.model.RSICDConfigPackage#getData()
 * @model extendedMetaData="name='Data' kind='empty'"
 * @generated
 */
public interface Data extends ICDElement {
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
	 * @see com.rskytech.hmi.icd.model.RSICDConfigPackage#getData_Datas()
	 * @model type="com.rskytech.hmi.icd.model.Data" resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='datas' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getDatas();

} // Data
