/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.rskytech.hmi.icd.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.rskytech.hmi.icd.model.RSICDConfigFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface RSICDConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/com.rskytech.hmi.icd/model/RSICDConfig.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RSICDConfig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RSICDConfigPackage eINSTANCE = com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.icd.model.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.icd.model.impl.BusImpl
	 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 0;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CHANNEL = 0;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.icd.model.impl.ICDElementImpl <em>ICD Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.icd.model.impl.ICDElementImpl
	 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getICDElement()
	 * @generated
	 */
	int ICD_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICD_ELEMENT__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICD_ELEMENT__INDEX = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICD_ELEMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>ICD Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICD_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.icd.model.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.icd.model.impl.ChannelImpl
	 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__COMMENT = ICD_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__INDEX = ICD_ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = ICD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CONFIG = ICD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__DATAS = ICD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TYPE = ICD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = ICD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.icd.model.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.icd.model.impl.ConfigImpl
	 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.icd.model.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.icd.model.impl.DataImpl
	 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getData()
	 * @generated
	 */
	int DATA = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__COMMENT = ICD_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__INDEX = ICD_ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = ICD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATAS = ICD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = ICD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.icd.model.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.icd.model.impl.DeviceImpl
	 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__COMMENT = ICD_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__INDEX = ICD_ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = ICD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CHANNELS = ICD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = ICD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.icd.model.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.icd.model.impl.DocumentRootImpl
	 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

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
	 * The feature id for the '<em><b>ICD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ICD = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.rskytech.hmi.icd.model.impl.ICDImpl <em>ICD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rskytech.hmi.icd.model.impl.ICDImpl
	 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getICD()
	 * @generated
	 */
	int ICD = 6;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICD__DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICD__BUS = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICD__DATA = 2;

	/**
	 * The number of structural features of the '<em>ICD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICD_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.icd.model.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see com.rskytech.hmi.icd.model.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rskytech.hmi.icd.model.Bus#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channel</em>'.
	 * @see com.rskytech.hmi.icd.model.Bus#getChannel()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Channel();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.icd.model.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see com.rskytech.hmi.icd.model.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rskytech.hmi.icd.model.Channel#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config</em>'.
	 * @see com.rskytech.hmi.icd.model.Channel#getConfig()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Config();

	/**
	 * Returns the meta object for the reference list '{@link com.rskytech.hmi.icd.model.Channel#getDatas <em>Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datas</em>'.
	 * @see com.rskytech.hmi.icd.model.Channel#getDatas()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Datas();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.icd.model.Channel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.rskytech.hmi.icd.model.Channel#getType()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Type();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.icd.model.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see com.rskytech.hmi.icd.model.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.icd.model.Config#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see com.rskytech.hmi.icd.model.Config#getProperty()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Property();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.icd.model.Config#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.rskytech.hmi.icd.model.Config#getValue()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Value();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.icd.model.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see com.rskytech.hmi.icd.model.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the reference list '{@link com.rskytech.hmi.icd.model.Data#getDatas <em>Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datas</em>'.
	 * @see com.rskytech.hmi.icd.model.Data#getDatas()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Datas();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.icd.model.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see com.rskytech.hmi.icd.model.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the reference list '{@link com.rskytech.hmi.icd.model.Device#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Channels</em>'.
	 * @see com.rskytech.hmi.icd.model.Device#getChannels()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Channels();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.icd.model.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.rskytech.hmi.icd.model.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.rskytech.hmi.icd.model.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.rskytech.hmi.icd.model.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.rskytech.hmi.icd.model.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.rskytech.hmi.icd.model.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.rskytech.hmi.icd.model.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.rskytech.hmi.icd.model.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.rskytech.hmi.icd.model.DocumentRoot#getICD <em>ICD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ICD</em>'.
	 * @see com.rskytech.hmi.icd.model.DocumentRoot#getICD()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ICD();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.icd.model.ICD <em>ICD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICD</em>'.
	 * @see com.rskytech.hmi.icd.model.ICD
	 * @generated
	 */
	EClass getICD();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rskytech.hmi.icd.model.ICD#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device</em>'.
	 * @see com.rskytech.hmi.icd.model.ICD#getDevice()
	 * @see #getICD()
	 * @generated
	 */
	EReference getICD_Device();

	/**
	 * Returns the meta object for the containment reference '{@link com.rskytech.hmi.icd.model.ICD#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus</em>'.
	 * @see com.rskytech.hmi.icd.model.ICD#getBus()
	 * @see #getICD()
	 * @generated
	 */
	EReference getICD_Bus();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rskytech.hmi.icd.model.ICD#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see com.rskytech.hmi.icd.model.ICD#getData()
	 * @see #getICD()
	 * @generated
	 */
	EReference getICD_Data();

	/**
	 * Returns the meta object for class '{@link com.rskytech.hmi.icd.model.ICDElement <em>ICD Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICD Element</em>'.
	 * @see com.rskytech.hmi.icd.model.ICDElement
	 * @generated
	 */
	EClass getICDElement();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.icd.model.ICDElement#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see com.rskytech.hmi.icd.model.ICDElement#getComment()
	 * @see #getICDElement()
	 * @generated
	 */
	EAttribute getICDElement_Comment();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.icd.model.ICDElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see com.rskytech.hmi.icd.model.ICDElement#getIndex()
	 * @see #getICDElement()
	 * @generated
	 */
	EAttribute getICDElement_Index();

	/**
	 * Returns the meta object for the attribute '{@link com.rskytech.hmi.icd.model.ICDElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.rskytech.hmi.icd.model.ICDElement#getName()
	 * @see #getICDElement()
	 * @generated
	 */
	EAttribute getICDElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RSICDConfigFactory getRSICDConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.icd.model.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.icd.model.impl.BusImpl
		 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__CHANNEL = eINSTANCE.getBus_Channel();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.icd.model.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.icd.model.impl.ChannelImpl
		 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__CONFIG = eINSTANCE.getChannel_Config();

		/**
		 * The meta object literal for the '<em><b>Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__DATAS = eINSTANCE.getChannel_Datas();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__TYPE = eINSTANCE.getChannel_Type();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.icd.model.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.icd.model.impl.ConfigImpl
		 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__PROPERTY = eINSTANCE.getConfig_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__VALUE = eINSTANCE.getConfig_Value();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.icd.model.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.icd.model.impl.DataImpl
		 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__DATAS = eINSTANCE.getData_Datas();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.icd.model.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.icd.model.impl.DeviceImpl
		 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__CHANNELS = eINSTANCE.getDevice_Channels();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.icd.model.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.icd.model.impl.DocumentRootImpl
		 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>ICD</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ICD = eINSTANCE.getDocumentRoot_ICD();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.icd.model.impl.ICDImpl <em>ICD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.icd.model.impl.ICDImpl
		 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getICD()
		 * @generated
		 */
		EClass ICD = eINSTANCE.getICD();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICD__DEVICE = eINSTANCE.getICD_Device();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICD__BUS = eINSTANCE.getICD_Bus();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICD__DATA = eINSTANCE.getICD_Data();

		/**
		 * The meta object literal for the '{@link com.rskytech.hmi.icd.model.impl.ICDElementImpl <em>ICD Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rskytech.hmi.icd.model.impl.ICDElementImpl
		 * @see com.rskytech.hmi.icd.model.impl.RSICDConfigPackageImpl#getICDElement()
		 * @generated
		 */
		EClass ICD_ELEMENT = eINSTANCE.getICDElement();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICD_ELEMENT__COMMENT = eINSTANCE.getICDElement_Comment();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICD_ELEMENT__INDEX = eINSTANCE.getICDElement_Index();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICD_ELEMENT__NAME = eINSTANCE.getICDElement_Name();

	}

} //RSICDConfigPackage
