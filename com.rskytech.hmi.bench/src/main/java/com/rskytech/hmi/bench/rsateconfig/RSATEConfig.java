/**
 */
package com.rskytech.hmi.bench.rsateconfig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RSATE Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.RSATEConfig#getBench <em>Bench</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getRSATEConfig()
 * @model extendedMetaData="name='RSATEConfig' kind='elementOnly'"
 * @generated
 */
public interface RSATEConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Bench</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bench</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bench</em>' containment reference.
	 * @see #setBench(Bench)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getRSATEConfig_Bench()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bench' namespace='##targetNamespace'"
	 * @generated
	 */
	Bench getBench();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.RSATEConfig#getBench <em>Bench</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bench</em>' containment reference.
	 * @see #getBench()
	 * @generated
	 */
	void setBench(Bench value);

} // RSATEConfig
