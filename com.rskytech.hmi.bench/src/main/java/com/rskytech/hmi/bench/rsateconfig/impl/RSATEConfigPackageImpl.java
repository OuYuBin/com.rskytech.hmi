/**
 */
package com.rskytech.hmi.bench.rsateconfig.impl;

import com.rskytech.hmi.bench.rsateconfig.Bench;
import com.rskytech.hmi.bench.rsateconfig.Conf;
import com.rskytech.hmi.bench.rsateconfig.DocumentRoot;
import com.rskytech.hmi.bench.rsateconfig.Driver;
import com.rskytech.hmi.bench.rsateconfig.DriverNameAndVersion;
import com.rskytech.hmi.bench.rsateconfig.Drivers;
import com.rskytech.hmi.bench.rsateconfig.Node;
import com.rskytech.hmi.bench.rsateconfig.Nodes;
import com.rskytech.hmi.bench.rsateconfig.Param;
import com.rskytech.hmi.bench.rsateconfig.RSATEConfig;
import com.rskytech.hmi.bench.rsateconfig.RSATEConfigFactory;
import com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage;
import com.rskytech.hmi.bench.rsateconfig.Resource;
import com.rskytech.hmi.bench.rsateconfig.Resources;
import com.rskytech.hmi.bench.rsateconfig.VirtualResource;
import com.rskytech.hmi.bench.rsateconfig.VirtualResources;
import com.rskytech.hmi.bench.rsateconfig.util.RSATEConfigValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RSATEConfigPackageImpl extends EPackageImpl implements RSATEConfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass benchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confEClass = null;

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
	private EClass driverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driverNameAndVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driversEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsateConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualResourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType driverNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tokenEDataType = null;

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
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RSATEConfigPackageImpl() {
		super(eNS_URI, RSATEConfigFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RSATEConfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RSATEConfigPackage init() {
		if (isInited) return (RSATEConfigPackage)EPackage.Registry.INSTANCE.getEPackage(RSATEConfigPackage.eNS_URI);

		// Obtain or create and register package
		RSATEConfigPackageImpl theRSATEConfigPackage = (RSATEConfigPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RSATEConfigPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RSATEConfigPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRSATEConfigPackage.createPackageContents();

		// Initialize created meta-data
		theRSATEConfigPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRSATEConfigPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RSATEConfigValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRSATEConfigPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RSATEConfigPackage.eNS_URI, theRSATEConfigPackage);
		return theRSATEConfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBench() {
		return benchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBench_Nodes() {
		return (EReference)benchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBench_Drivers() {
		return (EReference)benchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBench_Resources() {
		return (EReference)benchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBench_VirtualResources() {
		return (EReference)benchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBench_Ip() {
		return (EAttribute)benchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBench_Name() {
		return (EAttribute)benchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBench_Port() {
		return (EAttribute)benchEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConf() {
		return confEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConf_Param() {
		return (EReference)confEClass.getEStructuralFeatures().get(0);
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
	public EReference getDocumentRoot_RSATEConfig() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDriver() {
		return driverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDriver_Version() {
		return (EAttribute)driverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDriver_Name() {
		return (EAttribute)driverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDriverNameAndVersion() {
		return driverNameAndVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDriverNameAndVersion_Name() {
		return (EAttribute)driverNameAndVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDriverNameAndVersion_Version() {
		return (EAttribute)driverNameAndVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrivers() {
		return driversEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrivers_Driver() {
		return (EReference)driversEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Ip() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodes() {
		return nodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodes_Node() {
		return (EReference)nodesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParam() {
		return paramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParam_Name() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParam_Value() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Available() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Driver() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Conf() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResources() {
		return resourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResources_Resource() {
		return (EReference)resourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRSATEConfig() {
		return rsateConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSATEConfig_Bench() {
		return (EReference)rsateConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualResource() {
		return virtualResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualResource_Resource() {
		return (EAttribute)virtualResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualResource_Name() {
		return (EAttribute)virtualResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualResources() {
		return virtualResourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualResources_VirtualResource() {
		return (EReference)virtualResourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDriverName() {
		return driverNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getToken() {
		return tokenEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSATEConfigFactory getRSATEConfigFactory() {
		return (RSATEConfigFactory)getEFactoryInstance();
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
		benchEClass = createEClass(BENCH);
		createEReference(benchEClass, BENCH__NODES);
		createEReference(benchEClass, BENCH__DRIVERS);
		createEReference(benchEClass, BENCH__RESOURCES);
		createEReference(benchEClass, BENCH__VIRTUAL_RESOURCES);
		createEAttribute(benchEClass, BENCH__IP);
		createEAttribute(benchEClass, BENCH__NAME);
		createEAttribute(benchEClass, BENCH__PORT);

		confEClass = createEClass(CONF);
		createEReference(confEClass, CONF__PARAM);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RSATE_CONFIG);

		driverEClass = createEClass(DRIVER);
		createEAttribute(driverEClass, DRIVER__VERSION);
		createEAttribute(driverEClass, DRIVER__NAME);

		driverNameAndVersionEClass = createEClass(DRIVER_NAME_AND_VERSION);
		createEAttribute(driverNameAndVersionEClass, DRIVER_NAME_AND_VERSION__NAME);
		createEAttribute(driverNameAndVersionEClass, DRIVER_NAME_AND_VERSION__VERSION);

		driversEClass = createEClass(DRIVERS);
		createEReference(driversEClass, DRIVERS__DRIVER);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__IP);
		createEAttribute(nodeEClass, NODE__NAME);

		nodesEClass = createEClass(NODES);
		createEReference(nodesEClass, NODES__NODE);

		paramEClass = createEClass(PARAM);
		createEAttribute(paramEClass, PARAM__NAME);
		createEAttribute(paramEClass, PARAM__VALUE);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__AVAILABLE);
		createEReference(resourceEClass, RESOURCE__DRIVER);
		createEReference(resourceEClass, RESOURCE__CONF);
		createEAttribute(resourceEClass, RESOURCE__NAME);

		resourcesEClass = createEClass(RESOURCES);
		createEReference(resourcesEClass, RESOURCES__RESOURCE);

		rsateConfigEClass = createEClass(RSATE_CONFIG);
		createEReference(rsateConfigEClass, RSATE_CONFIG__BENCH);

		virtualResourceEClass = createEClass(VIRTUAL_RESOURCE);
		createEAttribute(virtualResourceEClass, VIRTUAL_RESOURCE__RESOURCE);
		createEAttribute(virtualResourceEClass, VIRTUAL_RESOURCE__NAME);

		virtualResourcesEClass = createEClass(VIRTUAL_RESOURCES);
		createEReference(virtualResourcesEClass, VIRTUAL_RESOURCES__VIRTUAL_RESOURCE);

		// Create data types
		driverNameEDataType = createEDataType(DRIVER_NAME);
		integerEDataType = createEDataType(INTEGER);
		tokenEDataType = createEDataType(TOKEN);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(benchEClass, Bench.class, "Bench", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBench_Nodes(), this.getNodes(), null, "nodes", null, 1, 1, Bench.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBench_Drivers(), this.getDrivers(), null, "drivers", null, 1, 1, Bench.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBench_Resources(), this.getResources(), null, "resources", null, 1, 1, Bench.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBench_VirtualResources(), this.getVirtualResources(), null, "virtualResources", null, 1, 1, Bench.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBench_Ip(), theXMLTypePackage.getString(), "ip", null, 0, 1, Bench.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBench_Name(), this.getToken(), "name", null, 0, 1, Bench.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBench_Port(), theXMLTypePackage.getInt(), "port", null, 0, 1, Bench.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(confEClass, Conf.class, "Conf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConf_Param(), this.getParam(), null, "param", null, 0, -1, Conf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RSATEConfig(), this.getRSATEConfig(), null, "rSATEConfig", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(driverEClass, Driver.class, "Driver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDriver_Version(), this.getToken(), "version", null, 1, 1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDriver_Name(), this.getDriverName(), "name", null, 0, 1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(driverNameAndVersionEClass, DriverNameAndVersion.class, "DriverNameAndVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDriverNameAndVersion_Name(), this.getToken(), "name", null, 1, 1, DriverNameAndVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDriverNameAndVersion_Version(), this.getToken(), "version", null, 1, 1, DriverNameAndVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(driversEClass, Drivers.class, "Drivers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDrivers_Driver(), this.getDriver(), null, "driver", null, 1, -1, Drivers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Ip(), theXMLTypePackage.getString(), "ip", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodesEClass, Nodes.class, "Nodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodes_Node(), this.getNode(), null, "node", null, 1, -1, Nodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramEClass, Param.class, "Param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParam_Name(), this.getToken(), "name", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParam_Value(), this.getToken(), "value", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Available(), this.getInteger(), "available", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Driver(), this.getDriverNameAndVersion(), null, "driver", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Conf(), this.getConf(), null, "conf", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcesEClass, Resources.class, "Resources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResources_Resource(), this.getResource(), null, "resource", null, 1, -1, Resources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rsateConfigEClass, RSATEConfig.class, "RSATEConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRSATEConfig_Bench(), this.getBench(), null, "bench", null, 1, 1, RSATEConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualResourceEClass, VirtualResource.class, "VirtualResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualResource_Resource(), theXMLTypePackage.getString(), "resource", null, 1, 1, VirtualResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualResource_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, VirtualResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualResourcesEClass, VirtualResources.class, "VirtualResources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualResources_VirtualResource(), this.getVirtualResource(), null, "virtualResource", null, 1, -1, VirtualResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(driverNameEDataType, String.class, "DriverName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, String.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tokenEDataType, String.class, "Token", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
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
		  (benchEClass, 
		   source, 
		   new String[] {
			 "name", "Bench",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getBench_Nodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Nodes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBench_Drivers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Drivers",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBench_Resources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Resources",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBench_VirtualResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VirtualResources",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBench_Ip(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ip",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBench_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBench_Port(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "port",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (confEClass, 
		   source, 
		   new String[] {
			 "name", "Conf",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getConf_Param(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Param",
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
		  (getDocumentRoot_RSATEConfig(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RSATEConfig",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (driverEClass, 
		   source, 
		   new String[] {
			 "name", "Driver",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDriver_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDriver_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (driverNameEDataType, 
		   source, 
		   new String[] {
			 "name", "DriverName",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[\\w_\\-]+"
		   });	
		addAnnotation
		  (driverNameAndVersionEClass, 
		   source, 
		   new String[] {
			 "name", "DriverNameAndVersion",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getDriverNameAndVersion_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDriverNameAndVersion_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (driversEClass, 
		   source, 
		   new String[] {
			 "name", "Drivers",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDrivers_Driver(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Driver",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (integerEDataType, 
		   source, 
		   new String[] {
			 "name", "Integer",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "\\d+"
		   });	
		addAnnotation
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "name", "Node",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getNode_Ip(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ip",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getNode_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (nodesEClass, 
		   source, 
		   new String[] {
			 "name", "Nodes",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getNodes_Node(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Node",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (paramEClass, 
		   source, 
		   new String[] {
			 "name", "Param",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getParam_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getParam_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (resourceEClass, 
		   source, 
		   new String[] {
			 "name", "Resource",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getResource_Available(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Available",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResource_Driver(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Driver",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResource_Conf(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Conf",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResource_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (resourcesEClass, 
		   source, 
		   new String[] {
			 "name", "Resources",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getResources_Resource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Resource",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (rsateConfigEClass, 
		   source, 
		   new String[] {
			 "name", "RSATEConfig",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRSATEConfig_Bench(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Bench",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tokenEDataType, 
		   source, 
		   new String[] {
			 "name", "Token",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "minLength", "1"
		   });	
		addAnnotation
		  (virtualResourceEClass, 
		   source, 
		   new String[] {
			 "name", "VirtualResource",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getVirtualResource_Resource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Resource",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVirtualResource_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (virtualResourcesEClass, 
		   source, 
		   new String[] {
			 "name", "VirtualResources",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getVirtualResources_VirtualResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VirtualResource",
			 "namespace", "##targetNamespace"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (getBench_Ip(), 
		   source, 
		   new String[] {
			 "documentation", "IP\u5730\u5740."
		   });	
		addAnnotation
		  (getBench_Name(), 
		   source, 
		   new String[] {
			 "documentation", "RTC\u4e3b\u7ed3\u70b9\u540d\u79f0."
		   });	
		addAnnotation
		  (getBench_Port(), 
		   source, 
		   new String[] {
			 "documentation", "\u7aef\u53e3."
		   });	
		addAnnotation
		  (getDriver_Version(), 
		   source, 
		   new String[] {
			 "documentation", "\u8bbe\u5907\u9a71\u52a8\u7248\u672c\u4fe1\u606f."
		   });	
		addAnnotation
		  (getDriver_Name(), 
		   source, 
		   new String[] {
			 "documentation", "\u8bbe\u5907\u540d\u79f0."
		   });	
		addAnnotation
		  (getNode_Ip(), 
		   source, 
		   new String[] {
			 "documentation", "IP\u5730\u5740."
		   });	
		addAnnotation
		  (getNode_Name(), 
		   source, 
		   new String[] {
			 "documentation", "\u540d\u79f0."
		   });	
		addAnnotation
		  (getResource_Available(), 
		   source, 
		   new String[] {
			 "documentation", "\u8d44\u6e90\u662f\u5426\u53ef\u7528."
		   });	
		addAnnotation
		  (getResource_Driver(), 
		   source, 
		   new String[] {
			 "documentation", "\u8d44\u6e90\u5305\u542b\u8bbe\u5907\u7684\u540d\u79f0\u53ca\u7248\u672c."
		   });	
		addAnnotation
		  (getResource_Conf(), 
		   source, 
		   new String[] {
			 "documentation", ""
		   });	
		addAnnotation
		  (getResources_Resource(), 
		   source, 
		   new String[] {
			 "documentation", "\u8d44\u6e90\u4fe1\u606f."
		   });	
		addAnnotation
		  (getVirtualResources_VirtualResource(), 
		   source, 
		   new String[] {
			 "documentation", "\u865a\u62df\u8d44\u6e90\u4fe1\u606f."
		   });
	}

} //RSATEConfigPackageImpl
