package com.rskytech.hmi.icd.model.editor.page.block.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.rskytech.hmi.icd.common.model.IRSICDConfigModel;

/**
 * 
 * @author robin
 *
 */
public class RSICDConfigLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object element) {
		return super.getImage(element);
	}

	@Override
	public String getText(Object element) {
		if (element instanceof IRSICDConfigModel) {
			EObject eObject = ((IRSICDConfigModel) element).geteObject();
			String name="";
			if (eObject != null) {
				name = (String) eObject.eGet(eObject.eClass().getEStructuralFeature("name"));
				if (name == null) {
					name = ((IRSICDConfigModel) element).geteObject().eClass().getName();
				}
			}else{
				name=((IRSICDConfigModel) element).getName();
			}
			return name;
		}
		return null;
	}

}
