package com.rskytech.hmi.users.core.service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.ILog;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.services.IServiceLocator;

import com.rskytech.hmi.users.Activator;
import com.rskytech.hmi.users.Profile;
import com.rskytech.hmi.users.User;
import com.rskytech.hmi.users.UsersConfiguration;
import com.rskytech.hmi.users.UsersFactory;
import com.rskytech.hmi.users.util.UsersAdapterFactory;

/**
 * 
 * @author robin
 *
 */
public class UserService implements IUserService {

	ILog log = Activator.getDefault().getLog();

	private static UserService INSTANCE = new UserService();

	private UserService() {

	}

	public static UserService getInstance() {
		if (INSTANCE != null) {
			return INSTANCE;
		}
		return new UserService();
	}

	private UserService(IServiceLocator parentLocator) {
	}

	/**
	 * 加载当前用户信息
	 */
	@Override
	public User loadCurrentUser(String name, String password) {
		// --载入大概当前用户配置信息
		Resource resource = loadUserConfigurationResource();
		UsersConfiguration usersConfiguration = (UsersConfiguration) resource.getContents().get(0);
		if (usersConfiguration != null) {
			EList<User> users = usersConfiguration.getUser();
			Iterator<User> iter = users.iterator();
			while (iter.hasNext()) {
				User user = iter.next();
				if (StringUtils.equals(user.getName(), name) && StringUtils.equals(user.getPassword(), password)) {
					return user;
				}
			}
		}
		return null;
	}

	private Resource loadUserConfigurationResource() {
		Resource resource = null;
		try {
			File file = getUserConfigurationFile();
			if (!file.exists()) {
				file.createNewFile();
			}
			URI uri = URI.createFileURI(file.toURI().getPath());
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getAdapterFactories().add(new UsersAdapterFactory());
			try {
				resource = resourceSet.getResource(uri, true);
			} catch (WrappedException wrappedException) {
				wrappedException.printStackTrace();
			}
			if (resource == null) {
				resource = resourceSet.createResource(uri);
				// --初始化用户配置信息及管理员admin信息
				UsersConfiguration usersConfiguration = UsersFactory.eINSTANCE.createUsersConfiguration();
				// --角色定义
				Profile profile = UsersFactory.eINSTANCE.createProfile();
				profile.setName("ROOT");
				usersConfiguration.getProfile().add(profile);
				User user = UsersFactory.eINSTANCE.createUser();
				user.setName("admin");
				user.setPassword("admin");
				user.getProfiles().add(profile);
				usersConfiguration.getUser().add(user);
				resource.getContents().add(usersConfiguration);
				Map<String, String> options = new HashMap<String, String>();
				options.put("ENCODING", "UTF-8");
				options.put("VERSION", "1.0");
				resource.save(options);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resource;

	}

	public File getUserConfigurationFile() {
		return Activator.getDefault().getStateLocation().append("userConfiguration.cfg").toFile();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
