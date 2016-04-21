package com.rskytech.hmi.users.core.service;

import org.eclipse.ui.services.IDisposable;

import com.rskytech.hmi.users.User;

/**
 * 
 * @author robin
 *
 */
public interface IUserService extends IDisposable{

	public User loadCurrentUser(String name,String password);
}
