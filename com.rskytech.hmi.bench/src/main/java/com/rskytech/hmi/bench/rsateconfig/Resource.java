/**
 */
package com.rskytech.hmi.bench.rsateconfig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Resource#getAvailable <em>Available</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Resource#getDriver <em>Driver</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Resource#getConf <em>Conf</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Resource#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getResource()
 * @model extendedMetaData="name='Resource' kind='elementOnly'"
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 资源是否可用
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available</em>' attribute.
	 * @see #setAvailable(String)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getResource_Available()
	 * @model dataType="com.rskytech.hmi.bench.rsateconfig.Integer"
	 *        extendedMetaData="kind='element' name='Available' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAvailable();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Resource#getAvailable <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available</em>' attribute.
	 * @see #getAvailable()
	 * @generated
	 */
	void setAvailable(String value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 资源包含设备的名称及版本
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Driver</em>' containment reference.
	 * @see #setDriver(DriverNameAndVersion)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getResource_Driver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Driver' namespace='##targetNamespace'"
	 * @generated
	 */
	DriverNameAndVersion getDriver();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Resource#getDriver <em>Driver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' containment reference.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(DriverNameAndVersion value);

	/**
	 * Returns the value of the '<em><b>Conf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conf</em>' containment reference.
	 * @see #setConf(Conf)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getResource_Conf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Conf' namespace='##targetNamespace'"
	 * @generated
	 */
	Conf getConf();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Resource#getConf <em>Conf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf</em>' containment reference.
	 * @see #getConf()
	 * @generated
	 */
	void setConf(Conf value);

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
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getResource_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Resource
