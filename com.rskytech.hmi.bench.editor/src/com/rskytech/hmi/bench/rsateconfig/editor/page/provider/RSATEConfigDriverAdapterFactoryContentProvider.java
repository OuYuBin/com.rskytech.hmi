package com.rskytech.hmi.bench.rsateconfig.editor.page.provider;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

/**
 * 
 * @author robin
 *
 */
public class RSATEConfigDriverAdapterFactoryContentProvider extends AdapterFactoryContentProvider {

	public RSATEConfigDriverAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object[] getElements(Object object) {
		if (object instanceof List) {
			return ((List) object).toArray();
		}
		return super.getElements(object);
	}

}
