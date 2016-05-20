package com.rskytech.hmi.bench.rsateconfig.editor.page.block.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.jface.preference.JFacePreferences;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.TextStyle;

import com.rskytech.hmi.bench.rsateconfig.DriverNameAndVersion;
import com.rskytech.hmi.bench.rsateconfig.editor.RSATEConfigEditorPlugin;
import com.rskytech.hmi.bench.rsateconfig.editor.model.Bench;
import com.rskytech.hmi.bench.rsateconfig.editor.model.IRSATEConfigModel;
import com.rskytech.hmi.bench.rsateconfig.editor.model.Node;

/**
 * 
 * @author robin
 *
 */
public class RSATEConfigStyledLabelProvider implements IStyledLabelProvider {

	// @Override
	// public Image getImage(Object element) {
	// return
	// RSATEConfigEditorPlugin.getPlugin().getImageRegistry().get(element.getClass().getSimpleName());
	// }
	//
	// @Override
	// public String getText(Object element) {
	// return element.getClass().getSimpleName();
	// }

	protected Styler availiableStyler;

	public RSATEConfigStyledLabelProvider() {
		availiableStyler = new Styler() {
			public void applyStyles(TextStyle textStyle) {
				textStyle.strikeout = true;
			}
		};
	}

	@Override
	public void addListener(ILabelProviderListener listener) {

	}

	@Override
	public void dispose() {

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {

	}

	@Override
	public StyledString getStyledText(Object element) {
		Styler normalElementDecorationStyler = StyledString
				.createColorRegistryStyler(JFacePreferences.DECORATIONS_COLOR, null);
		EObject eObject = ((IRSATEConfigModel) element).getEObject();
		StyledString styledString = null;
		StringBuffer decorationStringBuffer = new StringBuffer();

		EStructuralFeature availableFeature = eObject.eClass().getEStructuralFeature("available");
		boolean isAvailiable = true;
		if (availableFeature != null) {
			isAvailiable = eObject.eGet(availableFeature) != null ? true : false;
		}

		EStructuralFeature nameFeature = eObject.eClass().getEStructuralFeature("name");
		if (nameFeature != null) {
			String name = (String) eObject.eGet(nameFeature);
			if (!isAvailiable) {
				styledString = new StyledString(name, availiableStyler);
			}else{
				styledString=new StyledString(name);
			}
		} else {
			styledString = new StyledString(element.getClass().getSimpleName());
		}

		EStructuralFeature ipFeature = eObject.eClass().getEStructuralFeature("ip");
		if (ipFeature != null) {
			String ip = (String) eObject.eGet(ipFeature);
			decorationStringBuffer.append(":" + ip);
		}
		
		EReference reference=(EReference) eObject.eClass().getEStructuralFeature("driver");
		if(reference!=null){
			DriverNameAndVersion driverNameAndVersion= (DriverNameAndVersion) eObject.eGet(reference);
			String name=driverNameAndVersion.getName();
			String version=driverNameAndVersion.getVersion();
			decorationStringBuffer.append(" [" + name+":"+version+"]");
		}
		
		
		styledString.append(decorationStringBuffer.toString(), normalElementDecorationStyler);

		return styledString;

	}

	@Override
	public Image getImage(Object element) {
		return RSATEConfigEditorPlugin.getPlugin().getImageRegistry().get(element.getClass().getSimpleName());
	}

}
