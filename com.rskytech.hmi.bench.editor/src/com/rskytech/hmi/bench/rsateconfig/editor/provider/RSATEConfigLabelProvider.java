package com.rskytech.hmi.bench.rsateconfig.editor.provider;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * 
 * @author robin
 *
 */
public class RSATEConfigLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object element) {
		return super.getImage(element);
	}

	@Override
	public String getText(Object element) {
		return element.toString();
	}

}
