package com.rskytech.hmi.icd.common.model.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.rskytech.hmi.icd.common.model.impl.Device;
import com.rskytech.hmi.icd.common.model.impl.ICD;
import com.rskytech.hmi.icd.common.model.impl.Type;
import com.rskytech.hmi.icd.common.model.query.ModelQuery;
import com.rskytech.hmi.icd.model.Channel;

/**
 * 
 * @author robin
 *
 */
public class RSICDConfigModelManager {

	public static ICD createICD(EObject eObject) {
		Collection<?> collections = ModelQuery.queryICD(eObject);
		com.rskytech.hmi.icd.model.ICD eIcd = (com.rskytech.hmi.icd.model.ICD) collections.toArray()[0];
		ICD icd = new ICD(eIcd);

		// --获取device设备信息
		Collection<?> devices = getDevices(eObject);
		for (Object eDevice : devices) {
			Device device = new Device((EObject) eDevice);
			// --根据不同类型的总线进行对象组织
			Map<String, List<Channel>> channels = getChannels((com.rskytech.hmi.icd.model.Device) eDevice);
			for (Iterator iter = channels.entrySet().iterator(); iter.hasNext();) {
				Map.Entry<String, List<Channel>> entry = (Entry<String, List<Channel>>) iter.next();
				String channelType = entry.getKey();
				if (channelType != null) {
					Type type = new Type();
					type.setName(channelType);
					List<Channel> list = entry.getValue();
					for (Channel eChannel : list) {
						com.rskytech.hmi.icd.common.model.impl.Channel channel = new com.rskytech.hmi.icd.common.model.impl.Channel(
								eChannel);
						type.addChannel(channel);
					}
					device.addType(type);
				}
			}
			icd.addDevice(device);
		}

		return icd;
	}

	private static Collection<?> getDevices(EObject eObject) {
		Collection devices = ModelQuery.queryDeivces(eObject);
		return devices;
	}

	private static Map<String, List<Channel>> getChannels(com.rskytech.hmi.icd.model.Device eDevice) {
		Map<String, List<Channel>> channelMap = new HashMap<String, List<Channel>>();
		EList<Channel> channels = eDevice.getChannels();
		for (Channel channel : channels) {
			String type = channel.getType();
			if (!channelMap.containsKey(type)) {
				channelMap.put(type, new ArrayList<Channel>());
			}
			List<Channel> list = channelMap.get(type);
			list.add(channel);
		}
		return channelMap;

	}

}
