/**
 */
package com.rskytech.hmi.bench.rsateconfig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface RSATEConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rsateconfig";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/com.rskytech.hmi.bench/model/RSATEConfig.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.rskytech.hmi.bench";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RSATEConfigPackage eINSTANCE = com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.BenchImpl <em>Bench</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.BenchImpl
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getBench()
	 * @generated
	 */
	int BENCH = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCH__NODES = 0;

	/**
	 * The feature id for the '<em><b>Drivers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCH__DRIVERS = 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCH__RESOURCES = 2;

	/**
	 * The feature id for the '<em><b>Virtual Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCH__VIRTUAL_RESOURCES = 3;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCH__IP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCH__NAME = 5;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCH__PORT = 6;

	/**
	 * The number of structural features of the '<em>Bench</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCH_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Bench</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.ConfImpl <em>Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.ConfImpl
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getConf()
	 * @generated
	 */
	int CONF = 1;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF__PARAM = 0;

	/**
	 * The number of structural features of the '<em>Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.DocumentRootImpl
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>RSATE Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RSATE_CONFIG = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.DriverImpl <em>Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.DriverImpl
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getDriver()
	 * @generated
	 */
	int DRIVER = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.DriverNameAndVersionImpl <em>Driver Name And Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.DriverNameAndVersionImpl
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getDriverNameAndVersion()
	 * @generated
	 */
	int DRIVER_NAME_AND_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_NAME_AND_VERSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_NAME_AND_VERSION__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Driver Name And Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_NAME_AND_VERSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Driver Name And Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_NAME_AND_VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.DriversImpl <em>Drivers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.DriversImpl
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getDrivers()
	 * @generated
	 */
	int DRIVERS = 5;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVERS__DRIVER = 0;

	/**
	 * The number of structural features of the '<em>Drivers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Drivers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.NodeImpl
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.NodesImpl <em>Nodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.NodesImpl
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getNodes()
	 * @generated
	 */
	int NODES = 7;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES__NODE = 0;

	/**
	 * The number of structural features of the '<em>Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.ParamImpl
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.ResourceImpl
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 9;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__AVAILABLE = 0;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DRIVER = 1;

	/**
	 * The feature id for the '<em><b>Conf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONF = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.ResourcesImpl <em>Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.ResourcesImpl
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getResources()
	 * @generated
	 */
	int RESOURCES = 10;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigImpl <em>RSATE Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigImpl
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getRSATEConfig()
	 * @generated
	 */
	int RSATE_CONFIG = 11;

	/**
	 * The feature id for the '<em><b>Bench</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSATE_CONFIG__BENCH = 0;

	/**
	 * The number of structural features of the '<em>RSATE Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSATE_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>RSATE Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSATE_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.VirtualResourceImpl <em>Virtual Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.VirtualResourceImpl
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getVirtualResource()
	 * @generated
	 */
	int VIRTUAL_RESOURCE = 12;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_RESOURCE__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Conf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_RESOURCE__CONF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_RESOURCE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Virtual Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Virtual Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.VirtualResourcesImpl <em>Virtual Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.VirtualResourcesImpl
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getVirtualResources()
	 * @generated
	 */
	int VIRTUAL_RESOURCES = 13;

	/**
	 * The feature id for the '<em><b>Virtual Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_RESOURCES__VIRTUAL_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Virtual Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_RESOURCES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Virtual Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_RESOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Driver Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getDriverName()
	 * @generated
	 */
	int DRIVER_NAME = 14;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 15;

	/**
	 * The meta object id for the '<em>Token</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 16;


	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.bench.rsateconfig.Bench <em>Bench</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bench</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Bench
	 * @generated
	 */
	EClass getBench();

	/**
	 * Returns the meta object for the containment reference '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nodes</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Bench#getNodes()
	 * @see #getBench()
	 * @generated
	 */
	EReference getBench_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getDrivers <em>Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drivers</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Bench#getDrivers()
	 * @see #getBench()
	 * @generated
	 */
	EReference getBench_Drivers();

	/**
	 * Returns the meta object for the containment reference '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Bench#getResources()
	 * @see #getBench()
	 * @generated
	 */
	EReference getBench_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getVirtualResources <em>Virtual Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Virtual Resources</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Bench#getVirtualResources()
	 * @see #getBench()
	 * @generated
	 */
	EReference getBench_VirtualResources();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Bench#getIp()
	 * @see #getBench()
	 * @generated
	 */
	EAttribute getBench_Ip();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Bench#getName()
	 * @see #getBench()
	 * @generated
	 */
	EAttribute getBench_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.bench.rsateconfig.Bench#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Bench#getPort()
	 * @see #getBench()
	 * @generated
	 */
	EAttribute getBench_Port();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.bench.rsateconfig.Conf <em>Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conf</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Conf
	 * @generated
	 */
	EClass getConf();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rskytech.hmi.bench.rsateconfig.Conf#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Conf#getParam()
	 * @see #getConf()
	 * @generated
	 */
	EReference getConf_Param();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.bench.rsateconfig.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.rskytech.hmi.bench.rsateconfig.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.rskytech.hmi.bench.rsateconfig.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.rskytech.hmi.bench.rsateconfig.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.rskytech.hmi.bench.rsateconfig.DocumentRoot#getRSATEConfig <em>RSATE Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RSATE Config</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.DocumentRoot#getRSATEConfig()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RSATEConfig();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.bench.rsateconfig.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Driver
	 * @generated
	 */
	EClass getDriver();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.bench.rsateconfig.Driver#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Driver#getVersion()
	 * @see #getDriver()
	 * @generated
	 */
	EAttribute getDriver_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.bench.rsateconfig.Driver#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Driver#getName()
	 * @see #getDriver()
	 * @generated
	 */
	EAttribute getDriver_Name();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.bench.rsateconfig.DriverNameAndVersion <em>Driver Name And Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Name And Version</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.DriverNameAndVersion
	 * @generated
	 */
	EClass getDriverNameAndVersion();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.bench.rsateconfig.DriverNameAndVersion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.DriverNameAndVersion#getName()
	 * @see #getDriverNameAndVersion()
	 * @generated
	 */
	EAttribute getDriverNameAndVersion_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.bench.rsateconfig.DriverNameAndVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.DriverNameAndVersion#getVersion()
	 * @see #getDriverNameAndVersion()
	 * @generated
	 */
	EAttribute getDriverNameAndVersion_Version();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.bench.rsateconfig.Drivers <em>Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drivers</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Drivers
	 * @generated
	 */
	EClass getDrivers();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rskytech.hmi.bench.rsateconfig.Drivers#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Driver</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Drivers#getDriver()
	 * @see #getDrivers()
	 * @generated
	 */
	EReference getDrivers_Driver();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.bench.rsateconfig.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.bench.rsateconfig.Node#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Node#getIp()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Ip();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.bench.rsateconfig.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.bench.rsateconfig.Nodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Nodes
	 * @generated
	 */
	EClass getNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rskytech.hmi.bench.rsateconfig.Nodes#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Nodes#getNode()
	 * @see #getNodes()
	 * @generated
	 */
	EReference getNodes_Node();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.bench.rsateconfig.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.bench.rsateconfig.Param#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Param#getName()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.bench.rsateconfig.Param#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Param#getValue()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Value();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.bench.rsateconfig.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.bench.rsateconfig.Resource#getAvailable <em>Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Resource#getAvailable()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Available();

	/**
	 * Returns the meta object for the containment reference '{@link com.rskytech.hmi.bench.rsateconfig.Resource#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Driver</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Resource#getDriver()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Driver();

	/**
	 * Returns the meta object for the containment reference '{@link com.rskytech.hmi.bench.rsateconfig.Resource#getConf <em>Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conf</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Resource#getConf()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Conf();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.bench.rsateconfig.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.bench.rsateconfig.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Resources
	 * @generated
	 */
	EClass getResources();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rskytech.hmi.bench.rsateconfig.Resources#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.Resources#getResource()
	 * @see #getResources()
	 * @generated
	 */
	EReference getResources_Resource();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.bench.rsateconfig.RSATEConfig <em>RSATE Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RSATE Config</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfig
	 * @generated
	 */
	EClass getRSATEConfig();

	/**
	 * Returns the meta object for the containment reference '{@link com.rskytech.hmi.bench.rsateconfig.RSATEConfig#getBench <em>Bench</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bench</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfig#getBench()
	 * @see #getRSATEConfig()
	 * @generated
	 */
	EReference getRSATEConfig_Bench();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.bench.rsateconfig.VirtualResource <em>Virtual Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Resource</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.VirtualResource
	 * @generated
	 */
	EClass getVirtualResource();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.bench.rsateconfig.VirtualResource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.VirtualResource#getResource()
	 * @see #getVirtualResource()
	 * @generated
	 */
	EAttribute getVirtualResource_Resource();

	/**
	 * Returns the meta object for the containment reference '{@link com.rskytech.hmi.bench.rsateconfig.VirtualResource#getConf <em>Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conf</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.VirtualResource#getConf()
	 * @see #getVirtualResource()
	 * @generated
	 */
	EReference getVirtualResource_Conf();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.bench.rsateconfig.VirtualResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.VirtualResource#getName()
	 * @see #getVirtualResource()
	 * @generated
	 */
	EAttribute getVirtualResource_Name();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.bench.rsateconfig.VirtualResources <em>Virtual Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Resources</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.VirtualResources
	 * @generated
	 */
	EClass getVirtualResources();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rskytech.hmi.bench.rsateconfig.VirtualResources#getVirtualResource <em>Virtual Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Resource</em>'.
	 * @see com.rskytech.hmi.bench.rsateconfig.VirtualResources#getVirtualResource()
	 * @see #getVirtualResources()
	 * @generated
	 */
	EReference getVirtualResources_VirtualResource();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Driver Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Driver Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DriverName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[\\w_\\-]+'"
	 * @generated
	 */
	EDataType getDriverName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Integer' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='\\d+'"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Token</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Token' baseType='http://www.eclipse.org/emf/2003/XMLType#token' minLength='1'"
	 * @generated
	 */
	EDataType getToken();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RSATEConfigFactory getRSATEConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.BenchImpl <em>Bench</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.BenchImpl
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getBench()
		 * @generated
		 */
		EClass BENCH = eINSTANCE.getBench();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BENCH__NODES = eINSTANCE.getBench_Nodes();

		/**
		 * The meta object literal for the '<em><b>Drivers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BENCH__DRIVERS = eINSTANCE.getBench_Drivers();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BENCH__RESOURCES = eINSTANCE.getBench_Resources();

		/**
		 * The meta object literal for the '<em><b>Virtual Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BENCH__VIRTUAL_RESOURCES = eINSTANCE.getBench_VirtualResources();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENCH__IP = eINSTANCE.getBench_Ip();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENCH__NAME = eINSTANCE.getBench_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENCH__PORT = eINSTANCE.getBench_Port();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.ConfImpl <em>Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.ConfImpl
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getConf()
		 * @generated
		 */
		EClass CONF = eINSTANCE.getConf();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONF__PARAM = eINSTANCE.getConf_Param();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.DocumentRootImpl
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>RSATE Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RSATE_CONFIG = eINSTANCE.getDocumentRoot_RSATEConfig();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.DriverImpl <em>Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.DriverImpl
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getDriver()
		 * @generated
		 */
		EClass DRIVER = eINSTANCE.getDriver();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVER__VERSION = eINSTANCE.getDriver_Version();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVER__NAME = eINSTANCE.getDriver_Name();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.DriverNameAndVersionImpl <em>Driver Name And Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.DriverNameAndVersionImpl
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getDriverNameAndVersion()
		 * @generated
		 */
		EClass DRIVER_NAME_AND_VERSION = eINSTANCE.getDriverNameAndVersion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVER_NAME_AND_VERSION__NAME = eINSTANCE.getDriverNameAndVersion_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVER_NAME_AND_VERSION__VERSION = eINSTANCE.getDriverNameAndVersion_Version();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.DriversImpl <em>Drivers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.DriversImpl
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getDrivers()
		 * @generated
		 */
		EClass DRIVERS = eINSTANCE.getDrivers();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVERS__DRIVER = eINSTANCE.getDrivers_Driver();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.NodeImpl
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__IP = eINSTANCE.getNode_Ip();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.NodesImpl <em>Nodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.NodesImpl
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getNodes()
		 * @generated
		 */
		EClass NODES = eINSTANCE.getNodes();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES__NODE = eINSTANCE.getNodes_Node();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.ParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.ParamImpl
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getParam()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__VALUE = eINSTANCE.getParam_Value();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.ResourceImpl
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__AVAILABLE = eINSTANCE.getResource_Available();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__DRIVER = eINSTANCE.getResource_Driver();

		/**
		 * The meta object literal for the '<em><b>Conf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__CONF = eINSTANCE.getResource_Conf();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.ResourcesImpl <em>Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.ResourcesImpl
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getResources()
		 * @generated
		 */
		EClass RESOURCES = eINSTANCE.getResources();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES__RESOURCE = eINSTANCE.getResources_Resource();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigImpl <em>RSATE Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigImpl
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getRSATEConfig()
		 * @generated
		 */
		EClass RSATE_CONFIG = eINSTANCE.getRSATEConfig();

		/**
		 * The meta object literal for the '<em><b>Bench</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSATE_CONFIG__BENCH = eINSTANCE.getRSATEConfig_Bench();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.VirtualResourceImpl <em>Virtual Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.VirtualResourceImpl
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getVirtualResource()
		 * @generated
		 */
		EClass VIRTUAL_RESOURCE = eINSTANCE.getVirtualResource();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_RESOURCE__RESOURCE = eINSTANCE.getVirtualResource_Resource();

		/**
		 * The meta object literal for the '<em><b>Conf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_RESOURCE__CONF = eINSTANCE.getVirtualResource_Conf();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_RESOURCE__NAME = eINSTANCE.getVirtualResource_Name();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.bench.rsateconfig.impl.VirtualResourcesImpl <em>Virtual Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.VirtualResourcesImpl
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getVirtualResources()
		 * @generated
		 */
		EClass VIRTUAL_RESOURCES = eINSTANCE.getVirtualResources();

		/**
		 * The meta object literal for the '<em><b>Virtual Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_RESOURCES__VIRTUAL_RESOURCE = eINSTANCE.getVirtualResources_VirtualResource();

		/**
		 * The meta object literal for the '<em>Driver Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getDriverName()
		 * @generated
		 */
		EDataType DRIVER_NAME = eINSTANCE.getDriverName();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Token</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.rskytech.hmi.bench.rsateconfig.impl.RSATEConfigPackageImpl#getToken()
		 * @generated
		 */
		EDataType TOKEN = eINSTANCE.getToken();

	}

} //RSATEConfigPackage
