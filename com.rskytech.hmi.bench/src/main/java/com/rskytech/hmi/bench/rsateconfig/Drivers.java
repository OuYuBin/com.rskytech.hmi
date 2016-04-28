/**
 */
package com.rskytech.hmi.bench.rsateconfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drivers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Drivers#getDriver <em>Driver</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getDrivers()
 * @model extendedMetaData="name='Drivers' kind='elementOnly'"
 * @generated
 */
public interface Drivers extends EObject {
	/**
	 * Returns the value of the '<em><b>Driver</b></em>' containment reference list.
	 * The list contents are of type {@link com.rskytech.hmi.bench.rsateconfig.Driver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' containment reference list.
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getDrivers_Driver()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Driver' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Driver> getDriver();

} // Drivers
