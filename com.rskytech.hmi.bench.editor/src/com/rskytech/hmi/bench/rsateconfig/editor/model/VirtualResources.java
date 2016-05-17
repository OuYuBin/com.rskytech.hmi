package com.rskytech.hmi.bench.rsateconfig.editor.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author robin
 *
 */
public class VirtualResources extends AbstractRSATEConfigModel implements IRSATEConfigContainerModel {

	List<VirtualResource> virtualResources = new ArrayList<VirtualResource>();

	public VirtualResources(EObject eObject) {
		super(eObject);
	}

	public void addResource(VirtualResource virtualResource) {
		virtualResources.add(virtualResource);
	}

	@Override
	public List<? extends IRSATEConfigModel> getRSATEConfigModels() {
		return virtualResources;
	}

}
