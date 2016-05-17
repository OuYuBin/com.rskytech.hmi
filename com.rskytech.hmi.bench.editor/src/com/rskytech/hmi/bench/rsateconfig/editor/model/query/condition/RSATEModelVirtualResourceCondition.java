package com.rskytech.hmi.bench.rsateconfig.editor.model.query.condition;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;

import com.rskytech.hmi.bench.rsateconfig.Resource;
import com.rskytech.hmi.bench.rsateconfig.VirtualResource;

/**
 * 
 * @author robin
 *
 */
public class RSATEModelVirtualResourceCondition extends EObjectCondition {

	Collection<Resource> resources;

	public RSATEModelVirtualResourceCondition(Collection<Resource> resources) {
		this.resources = resources;
	}

	@Override
	public boolean isSatisfied(EObject eObject) {
		if (eObject instanceof VirtualResource) {
			String virtualResourceName = ((VirtualResource) eObject).getResource();
			for (Resource resource : resources) {
				String name = resource.getName();
				if (name != null && name.equals(virtualResourceName)) {
					return true;
				}
			}
		}

		return false;
	}

}
