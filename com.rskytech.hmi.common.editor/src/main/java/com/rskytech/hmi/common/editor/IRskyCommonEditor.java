package com.rskytech.hmi.common.editor;


import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * 
 * @author robin
 *
 */
public interface IRskyCommonEditor extends IAdaptable{
	
	public Resource getResource();
	
	public EditingDomain getEditingDomain();

}
