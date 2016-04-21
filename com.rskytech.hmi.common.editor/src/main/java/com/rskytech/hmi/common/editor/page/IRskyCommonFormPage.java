package com.rskytech.hmi.common.editor.page;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.forms.editor.IFormPage;

/**
 * 
 * @author robin
 *
 */
public interface IRskyCommonFormPage extends IFormPage {

	public Resource getResource();
}
