package com.rskytech.hmi.bench.rsateconfig.editor.model.query;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;

import com.rskytech.hmi.bench.rsateconfig.Resource;
import com.rskytech.hmi.bench.rsateconfig.editor.model.query.condition.RSATEModelBenchCondition;
import com.rskytech.hmi.bench.rsateconfig.editor.model.query.condition.RSATEModelNodeCondition;
import com.rskytech.hmi.bench.rsateconfig.editor.model.query.condition.RSATEModelResourceCondition;
import com.rskytech.hmi.bench.rsateconfig.editor.model.query.condition.RSATEModelResourcesCondition;
import com.rskytech.hmi.bench.rsateconfig.editor.model.query.condition.RSATEModelVirtualResourceCondition;
import com.rskytech.hmi.bench.rsateconfig.editor.model.query.condition.RSATEModelVirtualResourcesCondition;

/**
 * 
 * @author robin
 *
 */
public class ModelQuery {

	public static Collection<?> queryBench(EObject root) {
		SELECT select = new SELECT(new FROM(root), new WHERE(new RSATEModelBenchCondition()));
		return select.execute();
	}

	public static Collection<?> queryNodes(EObject root) {
		SELECT select = new SELECT(new FROM(root), new WHERE(new RSATEModelNodeCondition()));
		return select.execute();
	}

	public static Collection<?> queryResources(EObject root) {
		SELECT select = new SELECT(new FROM(root), new WHERE(new RSATEModelResourcesCondition()));
		return select.execute();
	}

	public static Collection<?> queryResource(EObject root, EObject parent) {
		SELECT select = new SELECT(new FROM(root), new WHERE(new RSATEModelResourceCondition(parent)));
		return select.execute();
	}

	public static Collection<?> queryVirtualResources(EObject root) {
		SELECT select = new SELECT(new FROM(root), new WHERE(new RSATEModelVirtualResourcesCondition()));
		return select.execute();
	}
	
	public static Collection<?> queryVirtualResource(EObject root, Collection<Resource> resources) {
		SELECT select = new SELECT(new FROM(root), new WHERE(new RSATEModelVirtualResourceCondition(resources)));
		return select.execute();
	}

}
