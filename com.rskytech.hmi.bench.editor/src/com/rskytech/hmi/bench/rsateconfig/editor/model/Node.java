package com.rskytech.hmi.bench.rsateconfig.editor.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * 树形节点展现Bench对象,代表一个RTC
 * 
 * @author robin
 *
 */
public class Node extends AbstractRSATEConfigModel implements IRSATEConfigContainerModel {

	Resources resources;

	VirtualResources virtualResources;

	public Node(EObject eObject) {
		super(eObject);
	}

	public Resources getResources() {
		return resources;
	}

	public void setResources(Resources resources) {
		this.resources = resources;
	}

	public VirtualResources getVirtualResources() {
		return virtualResources;
	}

	public void setVirtualResources(VirtualResources virtualResources) {
		this.virtualResources = virtualResources;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<? extends IRSATEConfigModel> getRSATEConfigModels() {
		List list = new ArrayList();
		list.add(getResources());
		list.add(getVirtualResources());
		return list;
	}

}
