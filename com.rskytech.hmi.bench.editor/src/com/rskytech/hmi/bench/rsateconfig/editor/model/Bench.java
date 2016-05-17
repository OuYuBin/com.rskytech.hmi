package com.rskytech.hmi.bench.rsateconfig.editor.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * 树形节点展现Bench对象,代表主RTC
 * 
 * @author robin
 *
 */
public class Bench extends AbstractRSATEConfigModel implements IRSATEConfigContainerModel {

	List<Node> nodes = new ArrayList<Node>();

	public Bench(EObject eObject) {
		super(eObject);
	}

	public void addNode(Node node) {
		nodes.add(node);
	}

	@Override
	public List<? extends IRSATEConfigModel> getRSATEConfigModels() {
		return nodes;
	}

}
