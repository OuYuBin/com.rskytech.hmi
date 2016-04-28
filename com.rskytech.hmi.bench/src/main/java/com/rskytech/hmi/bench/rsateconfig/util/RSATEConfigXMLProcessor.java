/**
 */
package com.rskytech.hmi.bench.rsateconfig.util;

import com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RSATEConfigXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSATEConfigXMLProcessor() {
		super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
		extendedMetaData.putPackage(null, RSATEConfigPackage.eINSTANCE);
	}
	
	/**
	 * Register for "*" and "xml" file extensions the RSATEConfigResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new RSATEConfigResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new RSATEConfigResourceFactoryImpl());
		}
		return registrations;
	}

} //RSATEConfigXMLProcessor
