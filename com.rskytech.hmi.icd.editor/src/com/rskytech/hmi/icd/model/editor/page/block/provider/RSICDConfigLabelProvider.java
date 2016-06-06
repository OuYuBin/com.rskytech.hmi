package com.rskytech.hmi.icd.model.editor.page.block.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.rskytech.hmi.icd.common.model.IRSICDConfigModel;
import com.rskytech.hmi.icd.model.editor.RSICDEditorPlugin;

/**
 * 
 * @author robin
 *
 */
public class RSICDConfigLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object element) {
		return RSICDEditorPlugin.getPlugin().getImageRegistry().get(element.getClass().getSimpleName());
	}

	@Override
	public String getText(Object element) {
		if (element instanceof IRSICDConfigModel) {
			EObject eObject = ((IRSICDConfigModel) element).getEObject();
			String name = null;
			if (eObject != null) {
				EStructuralFeature feature = eObject.eClass().getEStructuralFeature("name");
				if (feature != null)
					name = (String) eObject.eGet(feature);
				if (name == null) {
					name = ((IRSICDConfigModel) element).getEObject().eClass().getName();
				}
			} else {
				name = ((IRSICDConfigModel) element).getName();
			}
			return name;
		}
		return element.getClass().getSimpleName();
	}

}
