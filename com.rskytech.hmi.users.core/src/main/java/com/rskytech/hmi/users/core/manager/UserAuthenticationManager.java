package com.rskytech.hmi.users.core.manager;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.PlatformUI;

import com.rskytech.hmi.users.User;
import com.rskytech.hmi.users.core.service.IUserService;
import com.rskytech.hmi.users.core.service.UserService;

public class UserAuthenticationManager {

	/**
	 * 认证用户信息
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	public static User authentifyUser(String name, String password) {
//		IUserService userService = UserService.getInstance();
		IUserService userService = (IUserService) PlatformUI.getWorkbench().getService(IUserService.class);
		if(StringUtils.isNotBlank(name)&&StringUtils.isNotBlank(password)){
			return userService.loadCurrentUser(name, password);
		}
		return null;
	}

}
