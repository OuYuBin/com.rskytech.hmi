/**
 */
package com.rskytech.hmi.bench.rsateconfig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.VirtualResource#getResource <em>Resource</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.VirtualResource#getConf <em>Conf</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.VirtualResource#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getVirtualResource()
 * @model extendedMetaData="name='VirtualResource' kind='elementOnly'"
 * @generated
 */
public interface VirtualResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(String)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getVirtualResource_Resource()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Resource' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResource();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.VirtualResource#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(String value);

	/**
	 * Returns the value of the '<em><b>Conf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf</em>' containment reference.
	 * @see #setConf(Conf)
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getVirtualResource_Conf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Conf' namespace='##targetNamespace'"
	 * @generated
	 */
	Conf getConf();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.VirtualResource#getConf <em>Conf</em>}' containment reference.
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
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getVirtualResource_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.bench.rsateconfig.VirtualResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // VirtualResource
