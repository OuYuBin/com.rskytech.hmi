package com.rskytech.hmi.bench.rsateconfig.editor.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author robin
 *
 */
public class Resources extends AbstractRSATEConfigModel implements IRSATEConfigContainerModel {

	List<Resource> resources = new ArrayList<Resource>();

	public Resources(EObject eObject) {
		super(eObject);
	}

	public void addResource(Resource resource) {
		resources.add(resource);
	}

	@Override
	public List<? extends IRSATEConfigModel> getRSATEConfigModels() {
		return resources;
	}

}
