package com.rskytech.hmi.bench.rsateconfig.editor.model.manager;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import com.rskytech.hmi.bench.rsateconfig.Bench;
import com.rskytech.hmi.bench.rsateconfig.Node;
import com.rskytech.hmi.bench.rsateconfig.Resource;
import com.rskytech.hmi.bench.rsateconfig.Resources;
import com.rskytech.hmi.bench.rsateconfig.VirtualResource;
import com.rskytech.hmi.bench.rsateconfig.VirtualResources;
import com.rskytech.hmi.bench.rsateconfig.editor.model.query.ModelQuery;

/**
 * 硬件信息管理类
 * 
 * @author robin
 *
 */
public class RSATEConfigModelManager {

	@SuppressWarnings("unchecked")
	public static com.rskytech.hmi.bench.rsateconfig.editor.model.Bench createBench(EObject root) {
		Collection<?> collection = ModelQuery.queryBench(root);
		com.rskytech.hmi.bench.rsateconfig.editor.model.Bench bench = new com.rskytech.hmi.bench.rsateconfig.editor.model.Bench(
				(Bench) collection.toArray()[0]);
		Collection<Node> eNodes = (Collection<Node>) getNodes(root);
		for (Node eNode : eNodes) {
			com.rskytech.hmi.bench.rsateconfig.editor.model.Node node = new com.rskytech.hmi.bench.rsateconfig.editor.model.Node(
					eNode);

			// --获取资源板卡信息
			Resources eResources = getResources(root);
			com.rskytech.hmi.bench.rsateconfig.editor.model.Resources resources = new com.rskytech.hmi.bench.rsateconfig.editor.model.Resources(
					eResources);
			Collection<Resource> eResourceList = (Collection<Resource>) getResource(root, eNode);
			for (Resource eResource : eResourceList) {
				com.rskytech.hmi.bench.rsateconfig.editor.model.Resource resource = new com.rskytech.hmi.bench.rsateconfig.editor.model.Resource(
						eResource);
				resources.addResource(resource);
			}
			node.setResources(resources);
			
			//--获取虚拟资源板卡信息
			VirtualResources eVirtualResources=getVirtualResources(root);
			com.rskytech.hmi.bench.rsateconfig.editor.model.VirtualResources virtualResources = new com.rskytech.hmi.bench.rsateconfig.editor.model.VirtualResources(
					eVirtualResources);
			Collection<VirtualResource> eVirtualResourceList=(Collection<VirtualResource>) getVirtualResource(root, eResourceList);
			for(VirtualResource eVirtualResource:eVirtualResourceList){
				com.rskytech.hmi.bench.rsateconfig.editor.model.VirtualResource virtualResource = new com.rskytech.hmi.bench.rsateconfig.editor.model.VirtualResource(
						eVirtualResource);
				virtualResources.addResource(virtualResource);
			}
			node.setVirtualResources(virtualResources);
			
			bench.addNode(node);
		}
		return bench;
	}

	private static Collection<?> getNodes(EObject root) {
		Collection<?> collection = ModelQuery.queryNodes(root);
		return collection;
	}

	private static Resources getResources(EObject root) {
		Collection<?> collection = ModelQuery.queryResources(root);
		return (Resources) collection.toArray()[0];
	}

	private static Collection<?> getResource(EObject root, EObject parent) {
		Collection<?> collection = ModelQuery.queryResource(root, parent);
		return collection;
	}
	
	private static VirtualResources getVirtualResources(EObject root) {
		Collection<?> collection = ModelQuery.queryVirtualResources(root);
		return (VirtualResources) collection.toArray()[0];
	}
	
	private static Collection<?> getVirtualResource(EObject root, Collection<Resource> resources) {
		Collection<?> collection = ModelQuery.queryVirtualResource(root, resources);
		return collection;
	}
}
