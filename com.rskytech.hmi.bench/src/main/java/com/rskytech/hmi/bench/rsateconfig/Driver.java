/**
 */
package com.rskytech.hmi.bench.rsateconfig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Driver#getVersion <em>Version</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Driver#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getDriver()
 * @model extendedMetaData="name='Driver' kind='elementOnly'"
 * @generated
 */
public interface Driver extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 设备驱动版本信息
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getDriver_Version()
	 * @model dataType="com.rskytech.hmi.bench.rsateconfig.Token" required="true"
	 *        extendedMetaData="kind='element' name='Version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Driver#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 设备名称
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getDriver_Name()
	 * @model dataType="com.rskytech.hmi.bench.rsateconfig.DriverName"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Driver#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Driver
