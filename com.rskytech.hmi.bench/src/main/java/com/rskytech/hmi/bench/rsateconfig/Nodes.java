/**
 */
package com.rskytech.hmi.bench.rsateconfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.Nodes#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getNodes()
 * @model extendedMetaData="name='Nodes' kind='elementOnly'"
 * @generated
 */
public interface Nodes extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link com.rskytech.hmi.bench.rsateconfig.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#getNodes_Node()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Node' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Node> getNode();

} // Nodes
