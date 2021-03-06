/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.rskytech.hmi.icd.model.impl;

import com.rskytech.hmi.icd.model.Bus;
import com.rskytech.hmi.icd.model.Channel;
import com.rskytech.hmi.icd.model.Config;
import com.rskytech.hmi.icd.model.Data;
import com.rskytech.hmi.icd.model.Device;
import com.rskytech.hmi.icd.model.DocumentRoot;
import com.rskytech.hmi.icd.model.ICDElement;
import com.rskytech.hmi.icd.model.RSICDConfigFactory;
import com.rskytech.hmi.icd.model.RSICDConfigPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RSICDConfigPackageImpl extends EPackageImpl implements RSICDConfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass icdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass icdElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.rskytech.hmi.icd.model.RSICDConfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RSICDConfigPackageImpl() {
		super(eNS_URI, RSICDConfigFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RSICDConfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RSICDConfigPackage init() {
		if (isInited) return (RSICDConfigPackage)EPackage.Registry.INSTANCE.getEPackage(RSICDConfigPackage.eNS_URI);

		// Obtain or create and register package
		RSICDConfigPackageImpl theRSICDConfigPackage = (RSICDConfigPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RSICDConfigPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RSICDConfigPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRSICDConfigPackage.createPackageContents();

		// Initialize created meta-data
		theRSICDConfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRSICDConfigPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RSICDConfigPackage.eNS_URI, theRSICDConfigPackage);
		return theRSICDConfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBus() {
		return busEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_Channel() {
		return (EReference)busEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_Config() {
		return (EReference)channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_Datas() {
		return (EReference)channelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_Type() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfig() {
		return configEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_Property() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_Value() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Datas() {
		return (EReference)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Channels() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ICD() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICD() {
		return icdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getICD_Device() {
		return (EReference)icdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getICD_Bus() {
		return (EReference)icdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getICD_Data() {
		return (EReference)icdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICDElement() {
		return icdElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getICDElement_Comment() {
		return (EAttribute)icdElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getICDElement_Index() {
		return (EAttribute)icdElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getICDElement_Name() {
		return (EAttribute)icdElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSICDConfigFactory getRSICDConfigFactory() {
		return (RSICDConfigFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		busEClass = createEClass(BUS);
		createEReference(busEClass, BUS__CHANNEL);

		channelEClass = createEClass(CHANNEL);
		createEReference(channelEClass, CHANNEL__CONFIG);
		createEReference(channelEClass, CHANNEL__DATAS);
		createEAttribute(channelEClass, CHANNEL__TYPE);

		configEClass = createEClass(CONFIG);
		createEAttribute(configEClass, CONFIG__PROPERTY);
		createEAttribute(configEClass, CONFIG__VALUE);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__DATAS);

		deviceEClass = createEClass(DEVICE);
		createEReference(deviceEClass, DEVICE__CHANNELS);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ICD);

		icdEClass = createEClass(ICD);
		createEReference(icdEClass, ICD__DEVICE);
		createEReference(icdEClass, ICD__BUS);
		createEReference(icdEClass, ICD__DATA);

		icdElementEClass = createEClass(ICD_ELEMENT);
		createEAttribute(icdElementEClass, ICD_ELEMENT__COMMENT);
		createEAttribute(icdElementEClass, ICD_ELEMENT__INDEX);
		createEAttribute(icdElementEClass, ICD_ELEMENT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add supertypes to classes
		channelEClass.getESuperTypes().add(this.getICDElement());
		dataEClass.getESuperTypes().add(this.getICDElement());
		deviceEClass.getESuperTypes().add(this.getICDElement());

		// Initialize classes and features; add operations and parameters
		initEClass(busEClass, Bus.class, "Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBus_Channel(), this.getChannel(), null, "channel", null, 0, -1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannel_Config(), this.getConfig(), null, "config", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Datas(), this.getData(), null, "datas", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configEClass, Config.class, "Config", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfig_Property(), theXMLTypePackage.getString(), "property", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_Datas(), this.getData(), null, "datas", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevice_Channels(), this.getChannel(), null, "channels", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ICD(), this.getICD(), null, "iCD", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(icdEClass, com.rskytech.hmi.icd.model.ICD.class, "ICD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getICD_Device(), this.getDevice(), null, "device", null, 0, -1, com.rskytech.hmi.icd.model.ICD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getICD_Bus(), this.getBus(), null, "bus", null, 0, 1, com.rskytech.hmi.icd.model.ICD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getICD_Data(), this.getData(), null, "data", null, 0, -1, com.rskytech.hmi.icd.model.ICD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(icdElementEClass, ICDElement.class, "ICDElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getICDElement_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, ICDElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getICDElement_Index(), theXMLTypePackage.getLong(), "index", null, 0, 1, ICDElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getICDElement_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ICDElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });	
		addAnnotation
		  (busEClass, 
		   source, 
		   new String[] {
			 "name", "Bus",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getBus_Channel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Channel",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (channelEClass, 
		   source, 
		   new String[] {
			 "name", "Channel",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getChannel_Config(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "config",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getChannel_Datas(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "datas",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getChannel_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (configEClass, 
		   source, 
		   new String[] {
			 "name", "Config",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getConfig_Property(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getConfig_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (dataEClass, 
		   source, 
		   new String[] {
			 "name", "Data",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getData_Datas(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "datas",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (deviceEClass, 
		   source, 
		   new String[] {
			 "name", "Device",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getDevice_Channels(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "channels",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_ICD(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ICD",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (icdEClass, 
		   source, 
		   new String[] {
			 "name", "ICD",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getICD_Device(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Device",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getICD_Bus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Bus",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getICD_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Data",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (icdElementEClass, 
		   source, 
		   new String[] {
			 "name", "ICDElement",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getICDElement_Comment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getICDElement_Index(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "index",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getICDElement_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });
	}

} //RSICDConfigPackageImpl
