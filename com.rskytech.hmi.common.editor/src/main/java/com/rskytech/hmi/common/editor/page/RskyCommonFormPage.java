package com.rskytech.hmi.common.editor.page;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;

import com.rskytech.hmi.common.editor.IRskyCommonEditor;

/**
 * 
 * @author robin
 *
 */
public class RskyCommonFormPage extends FormPage implements IRskyCommonFormPage {

	Resource resource;

	public RskyCommonFormPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
		if (editor instanceof IRskyCommonEditor) {
			this.resource = ((IRskyCommonEditor) editor).getResource();
		}
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

}
