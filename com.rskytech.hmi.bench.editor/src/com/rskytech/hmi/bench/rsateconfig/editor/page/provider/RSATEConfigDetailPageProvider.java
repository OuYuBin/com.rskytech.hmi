package com.rskytech.hmi.bench.rsateconfig.editor.page.provider;

import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IDetailsPageProvider;

import com.rskytech.hmi.bench.rsateconfig.editor.page.RSATEConfigDetailPage;

/**
 * 
 * @author robin
 *
 */
public class RSATEConfigDetailPageProvider implements IDetailsPageProvider {

	@Override
	public Object getPageKey(Object object) {
		return object;
	}

	@Override
	public IDetailsPage getPage(Object key) {
		return new RSATEConfigDetailPage(key);
	}

}
