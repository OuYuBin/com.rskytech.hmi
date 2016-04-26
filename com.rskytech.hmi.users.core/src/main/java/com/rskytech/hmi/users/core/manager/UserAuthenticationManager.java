package com.rskytech.hmi.users.core.manager;

import org.apache.commons.lang.StringUtils;
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
		IUserService userService = null;
		String version = System.getProperty("osgi.framework.version");
		if (version != null
				&& (version.startsWith("3.6") || (version.startsWith("3.7") || version.startsWith("3.8")))) {
			userService = (IUserService) PlatformUI.getWorkbench().getService(IUserService.class);
		} else {
			userService = UserService.getInstance();
		}
		if (StringUtils.isNotBlank(name) && StringUtils.isNotBlank(password)) {
			return userService.loadCurrentUser(name, password);
		}
		return null;
	}

}
