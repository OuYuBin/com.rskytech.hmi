package com.rskytech.hmi.common.activities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.activities.IActivity;
import org.eclipse.ui.activities.IMutableActivityManager;

/**
 * 
 * @author robin
 *
 */
public class ActivitiesManager {

	public static Map<String, IActivity> getActivites() {
		Map<String, IActivity> map = new HashMap<String, IActivity>();
		IMutableActivityManager mutableActivityManager = PlatformUI.getWorkbench().getActivitySupport()
				.createWorkingCopy();
		Set<?> set = mutableActivityManager.getDefinedActivityIds();
		for (Iterator<?> iter = set.iterator(); iter.hasNext();) {
			Object object = iter.next();
			String desc = object.toString();
			if (isUserRestriction(desc)) {
				IActivity activity = mutableActivityManager.getActivity(desc);
				map.put(activity.getId(), activity);
			}

		}
		return map;
	}

	public static boolean isUserRestriction(String desc) {
		return desc != null && desc.contains("com.rskytech.hmi");
	}

}
