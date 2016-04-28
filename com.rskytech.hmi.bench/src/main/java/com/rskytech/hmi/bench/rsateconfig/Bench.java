/**
 */
package com.rskytech.hmi.bench.rsateconfig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bench</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Bench#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Bench#getDrivers <em>Drivers</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getBench()
 * @model extendedMetaData="name='Bench' kind='elementOnly'"
 * @generated
 */
public interface Bench extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference.
	 * @see #setNodes(Nodes)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getBench_Nodes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Nodes' namespace='##targetNamespace'"
	 * @generated
	 */
	Nodes getNodes();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getNodes <em>Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes</em>' containment reference.
	 * @see #getNodes()
	 * @generated
	 */
	void setNodes(Nodes value);

	/**
	 * Returns the value of the '<em><b>Drivers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drivers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drivers</em>' containment reference.
	 * @see #setDrivers(Drivers)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getBench_Drivers()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Drivers' namespace='##targetNamespace'"
	 * @generated
	 */
	Drivers getDrivers();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getDrivers <em>Drivers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drivers</em>' containment reference.
	 * @see #getDrivers()
	 * @generated
	 */
	void setDrivers(Drivers value);

} // Bench
