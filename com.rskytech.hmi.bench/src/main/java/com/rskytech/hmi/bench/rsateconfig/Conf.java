/**
 */
package com.rskytech.hmi.bench.rsateconfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Conf#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getConf()
 * @model extendedMetaData="name='Conf' kind='elementOnly'"
 * @generated
 */
public interface Conf extends EObject {
	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link com.rskytech.hmi.bench.rsateconfig.Param}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getConf_Param()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Param> getParam();

} // Conf
