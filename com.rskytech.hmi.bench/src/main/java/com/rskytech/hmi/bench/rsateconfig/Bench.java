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
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Bench#getResouces <em>Resouces</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Bench#getIP <em>IP</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Bench#getName <em>Name</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Bench#getPort <em>Port</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Resouces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resouces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resouces</em>' containment reference.
	 * @see #setResouces(Resouces)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getBench_Resouces()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Resouces' namespace='##targetNamespace'"
	 * @generated
	 */
	Resouces getResouces();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getResouces <em>Resouces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resouces</em>' containment reference.
	 * @see #getResouces()
	 * @generated
	 */
	void setResouces(Resouces value);

	/**
	 * Returns the value of the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP</em>' attribute.
	 * @see #setIP(String)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getBench_IP()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IP' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIP();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getIP <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP</em>' attribute.
	 * @see #getIP()
	 * @generated
	 */
	void setIP(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RTC主结点名称
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getBench_Name()
	 * @model dataType="com.rskytech.hmi.bench.rsateconfig.Token"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #isSetPort()
	 * @see #unsetPort()
	 * @see #setPort(int)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getBench_Port()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='port' namespace='##targetNamespace'"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #isSetPort()
	 * @see #unsetPort()
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Unsets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPort()
	 * @see #getPort()
	 * @see #setPort(int)
	 * @generated
	 */
	void unsetPort();

	/**
	 * Returns whether the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getPort <em>Port</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Port</em>' attribute is set.
	 * @see #unsetPort()
	 * @see #getPort()
	 * @see #setPort(int)
	 * @generated
	 */
	boolean isSetPort();

} // Bench
