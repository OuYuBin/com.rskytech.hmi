/**
 */
package com.rskytech.hmi.bench.rsateconfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resouces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Resouces#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getResouces()
 * @model extendedMetaData="name='Resouces' kind='elementOnly'"
 * @generated
 */
public interface Resouces extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link com.rskytech.hmi.bench.rsateconfig.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 资源信息.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getResouces_Resource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Resource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Resource> getResource();

} // Resouces
