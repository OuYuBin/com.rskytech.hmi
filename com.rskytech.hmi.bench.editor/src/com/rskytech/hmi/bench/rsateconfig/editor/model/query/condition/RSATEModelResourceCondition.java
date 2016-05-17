package com.rskytech.hmi.bench.rsateconfig.editor.model.query.condition;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;

import com.rskytech.hmi.bench.rsateconfig.Conf;
import com.rskytech.hmi.bench.rsateconfig.Node;
import com.rskytech.hmi.bench.rsateconfig.Param;
import com.rskytech.hmi.bench.rsateconfig.Resource;

/**
 * 
 * @author robin
 *
 */
public class RSATEModelResourceCondition extends EObjectCondition {

	EObject parent;

	String name;

	public RSATEModelResourceCondition(EObject parent) {
		this.parent = parent;
		this.name = ((Node) parent).getName();
	}

	@Override
	public boolean isSatisfied(EObject eObject) {
		if (name != null && eObject instanceof Resource) {
			Conf conf = ((Resource) eObject).getConf();
			if (conf != null) {
				EList<Param> params = conf.getParam();
				for (Param param : params) {
					if (param.getName().equals("location")) {
						String value = param.getValue();
						if (name.equals(value)) {
							return true;
						}
					}
				}
			}
		}

		return false;
	}

}
