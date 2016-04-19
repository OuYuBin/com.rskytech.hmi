/**
 */
package com.rskytech.hmi.users;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.users.UsersConfiguration#getUser <em>User</em>}</li>
 *   <li>{@link com.rskytech.hmi.users.UsersConfiguration#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see com.rskytech.hmi.users.UsersPackage#getUsersConfiguration()
 * @model
 * @generated
 */
public interface UsersConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(User)
	 * @see com.rskytech.hmi.users.UsersPackage#getUsersConfiguration_User()
	 * @model containment="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.users.UsersConfiguration#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Profile)
	 * @see com.rskytech.hmi.users.UsersPackage#getUsersConfiguration_Profile()
	 * @model containment="true"
	 * @generated
	 */
	Profile getProfile();

	/**
	 * Sets the value of the '{@link com.rskytech.hmi.users.UsersConfiguration#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Profile value);

} // UsersConfiguration
