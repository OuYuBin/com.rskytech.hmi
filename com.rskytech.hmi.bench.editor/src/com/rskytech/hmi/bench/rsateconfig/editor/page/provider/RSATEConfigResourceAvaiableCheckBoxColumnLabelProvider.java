package com.rskytech.hmi.bench.rsateconfig.editor.page.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.graphics.Image;

import com.rskytech.hmi.bench.rsateconfig.Resource;
import com.rskytech.hmi.bench.rsateconfig.VirtualResource;
import com.rskytech.hmi.bench.rsateconfig.editor.RSATEConfigEditorPlugin;

/**
 * 
 * @author robin
 * 
 */
public class RSATEConfigResourceAvaiableCheckBoxColumnLabelProvider extends ColumnLabelProvider {

	EStructuralFeature feature;

	public RSATEConfigResourceAvaiableCheckBoxColumnLabelProvider(EStructuralFeature feature) {
		super();
		this.feature = feature;
	}

	@Override
	public String getText(Object element) {
		return "";
	}

	@Override
	public Image getImage(Object element) {
		EObject eObject = null;
		if (element instanceof com.rskytech.hmi.bench.rsateconfig.editor.model.Resource) {
			eObject = (Resource) ((com.rskytech.hmi.bench.rsateconfig.editor.model.Resource) element).getEObject();
		} else if (element instanceof com.rskytech.hmi.bench.rsateconfig.editor.model.VirtualResource) {
			eObject = (VirtualResource) ((com.rskytech.hmi.bench.rsateconfig.editor.model.VirtualResource) element)
					.getEObject();
		}

		if (eObject.eGet(feature) != null && eObject.eGet(feature).equals("1")) {
			return RSATEConfigEditorPlugin.getPlugin().getImageRegistry().get("CheckBoxOn");
		}
		return RSATEConfigEditorPlugin.getPlugin().getImageRegistry().get("CheckBoxOff");
	}
}
