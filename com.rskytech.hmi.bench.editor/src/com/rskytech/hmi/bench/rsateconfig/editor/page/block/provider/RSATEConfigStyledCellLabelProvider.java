package com.rskytech.hmi.bench.rsateconfig.editor.page.block.provider;

import org.eclipse.jface.viewers.DecoratingStyledCellLabelProvider;
import org.eclipse.jface.viewers.IDecorationContext;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.StyledCellLabelProvider;

/**
 * 
 * @author robin
 *
 */
public class RSATEConfigStyledCellLabelProvider extends DecoratingStyledCellLabelProvider {

	public RSATEConfigStyledCellLabelProvider(IStyledLabelProvider labelProvider, ILabelDecorator decorator,
			IDecorationContext decorationContext) {
		super(labelProvider, decorator, decorationContext);
	}

}
