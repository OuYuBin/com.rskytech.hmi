package com.rskytech.hmi.bench.rsateconfig.editor.page.block.provider;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.rskytech.hmi.bench.rsateconfig.editor.RSATEConfigEditorPlugin;

/**
 * 
 * @author robin
 *
 */
public class RSATEConfigLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object element) {
		return RSATEConfigEditorPlugin.getPlugin().getImageRegistry().get(element.getClass().getSimpleName());
	}

	@Override
	public String getText(Object element) {
		return element.getClass().getSimpleName();
	}

}
