package com.rskytech.hmi.users.core.service;

import org.eclipse.ui.services.AbstractServiceFactory;
import org.eclipse.ui.services.IServiceLocator;

/**
 * 
 * @author robin
 *
 */
public class UserServiceFactory extends AbstractServiceFactory {


	@Override
	public Object create(Class serviceInterface, IServiceLocator parentLocator, IServiceLocator locator) {
		return UserService.getInstance();
	}

}
