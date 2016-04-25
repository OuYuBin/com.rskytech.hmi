/**
 */
package com.rskytech.hmi.users;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.rskytech.hmi.users.UsersConfiguration#getUser <em>User</em>}</li>
 *   <li>{@link com.rskytech.hmi.users.UsersConfiguration#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.rskytech.hmi.users.UsersPackage#getUsersConfiguration()
 * @model
 * @generated
 */
public interface UsersConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link com.rskytech.hmi.users.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see com.rskytech.hmi.users.UsersPackage#getUsersConfiguration_User()
	 * @model type="com.rskytech.hmi.users.User" containment="true"
	 * @generated
	 */
	EList getUser();

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link com.rskytech.hmi.users.Profile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see com.rskytech.hmi.users.UsersPackage#getUsersConfiguration_Profile()
	 * @model type="com.rskytech.hmi.users.Profile" containment="true"
	 * @generated
	 */
	EList getProfile();

} // UsersConfiguration
