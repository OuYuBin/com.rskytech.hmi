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
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Bench#getResources <em>Resources</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Bench#getVirtualResources <em>Virtual Resources</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Bench#getIp <em>Ip</em>}</li>
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
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference.
	 * @see #setResources(Resources)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getBench_Resources()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Resources' namespace='##targetNamespace'"
	 * @generated
	 */
	Resources getResources();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getResources <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' containment reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(Resources value);

	/**
	 * Returns the value of the '<em><b>Virtual Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Resources</em>' containment reference.
	 * @see #setVirtualResources(VirtualResources)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getBench_VirtualResources()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VirtualResources' namespace='##targetNamespace'"
	 * @generated
	 */
	VirtualResources getVirtualResources();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getVirtualResources <em>Virtual Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Resources</em>' containment reference.
	 * @see #getVirtualResources()
	 * @generated
	 */
	void setVirtualResources(VirtualResources value);

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IP地址.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getBench_Ip()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ip' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RTC主结点名称.
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
	 * <!-- begin-model-doc -->
	 * 端口.
	 * <!-- end-model-doc -->
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
