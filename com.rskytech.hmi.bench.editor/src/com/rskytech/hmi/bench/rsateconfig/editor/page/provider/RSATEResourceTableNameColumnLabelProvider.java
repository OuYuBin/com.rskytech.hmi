package com.rskytech.hmi.bench.rsateconfig.editor.page.provider;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ColumnLabelProvider;

import com.rskytech.hmi.bench.rsateconfig.Bench;
import com.rskytech.hmi.bench.rsateconfig.Conf;
import com.rskytech.hmi.bench.rsateconfig.Node;
import com.rskytech.hmi.bench.rsateconfig.Param;
import com.rskytech.hmi.bench.rsateconfig.Resource;
import com.rskytech.hmi.bench.rsateconfig.VirtualResource;

/**
 * 
 * @author robin
 *
 */
public class RSATEResourceTableNameColumnLabelProvider extends ColumnLabelProvider {

	EStructuralFeature feature;

	EReference eReference;

	String featureName;

	public RSATEResourceTableNameColumnLabelProvider(EReference eReference, EStructuralFeature feature) {
		this(feature);
		this.eReference = eReference;
	}

	public RSATEResourceTableNameColumnLabelProvider(EReference eReference, String featureName) {
		this.featureName = featureName;
		this.eReference = eReference;
	}

	public RSATEResourceTableNameColumnLabelProvider(EStructuralFeature feature) {
		this.feature = feature;
	}

	@Override
	public String getText(Object element) {
		EObject eOwner = null;
		if (element instanceof com.rskytech.hmi.bench.rsateconfig.editor.model.Resource) {
			eOwner = (Resource) ((com.rskytech.hmi.bench.rsateconfig.editor.model.Resource) element).getEObject();
		} else if (element instanceof com.rskytech.hmi.bench.rsateconfig.editor.model.VirtualResource) {
			eOwner = (VirtualResource) ((com.rskytech.hmi.bench.rsateconfig.editor.model.VirtualResource) element)
					.getEObject();
		} else if (element instanceof com.rskytech.hmi.bench.rsateconfig.editor.model.Node) {
			eOwner = (Node) ((com.rskytech.hmi.bench.rsateconfig.editor.model.Node) element).getEObject();
		}
		if (eReference != null) {
			if (eReference.getName().equals("param")) {
				Conf conf = (Conf) eOwner.eGet(eOwner.eClass().getEStructuralFeature("conf"));
				EList<Param> params = conf.getParam();
				for (Param param : params) {
					if (param.getName().equals(featureName)) {
						return param.getValue();
					}
				}
				return "";

			}
			EObject eObject = (EObject) eOwner.eGet((EStructuralFeature) eReference);
			return (String) eObject.eGet(feature);
		} else {
			return (String) eOwner.eGet(feature);
		}

	}
}
