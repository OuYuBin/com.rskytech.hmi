/**
 */
package com.rskytech.hmi.bench.rsateconfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.VirtualResources#getVirtualResource <em>Virtual Resource</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getVirtualResources()
 * @model extendedMetaData="name='VirtualResources' kind='elementOnly'"
 * @generated
 */
public interface VirtualResources extends EObject {
	/**
	 * Returns the value of the '<em><b>Virtual Resource</b></em>' containment reference list.
	 * The list contents are of type {@link com.rskytech.hmi.bench.rsateconfig.VirtualResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 虚拟资源信息.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Resource</em>' containment reference list.
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getVirtualResources_VirtualResource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VirtualResource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VirtualResource> getVirtualResource();

} // VirtualResources
