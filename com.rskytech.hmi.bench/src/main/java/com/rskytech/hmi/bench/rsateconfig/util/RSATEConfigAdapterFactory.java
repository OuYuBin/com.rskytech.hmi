/**
 */
package com.rskytech.hmi.bench.rsateconfig.util;

import com.rskytech.hmi.bench.rsateconfig.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage
 * @generated
 */
public class RSATEConfigAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RSATEConfigPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSATEConfigAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RSATEConfigPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RSATEConfigSwitch<Adapter> modelSwitch =
		new RSATEConfigSwitch<Adapter>() {
			@Override
			public Adapter caseBench(Bench object) {
				return createBenchAdapter();
			}
			@Override
			public Adapter caseConf(Conf object) {
				return createConfAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDriver(Driver object) {
				return createDriverAdapter();
			}
			@Override
			public Adapter caseDriverNameAndVersion(DriverNameAndVersion object) {
				return createDriverNameAndVersionAdapter();
			}
			@Override
			public Adapter caseDrivers(Drivers object) {
				return createDriversAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseNodes(Nodes object) {
				return createNodesAdapter();
			}
			@Override
			public Adapter caseParam(Param object) {
				return createParamAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseResources(Resources object) {
				return createResourcesAdapter();
			}
			@Override
			public Adapter caseRSATEConfig(RSATEConfig object) {
				return createRSATEConfigAdapter();
			}
			@Override
			public Adapter caseVirtualResource(VirtualResource object) {
				return createVirtualResourceAdapter();
			}
			@Override
			public Adapter caseVirtualResources(VirtualResources object) {
				return createVirtualResourcesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.bench.rsateconfig.Bench <em>Bench</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.bench.rsateconfig.Bench
	 * @generated
	 */
	public Adapter createBenchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.bench.rsateconfig.Conf <em>Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.bench.rsateconfig.Conf
	 * @generated
	 */
	public Adapter createConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.bench.rsateconfig.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.bench.rsateconfig.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.bench.rsateconfig.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.bench.rsateconfig.Driver
	 * @generated
	 */
	public Adapter createDriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.bench.rsateconfig.DriverNameAndVersion <em>Driver Name And Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.bench.rsateconfig.DriverNameAndVersion
	 * @generated
	 */
	public Adapter createDriverNameAndVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.bench.rsateconfig.Drivers <em>Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.bench.rsateconfig.Drivers
	 * @generated
	 */
	public Adapter createDriversAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.bench.rsateconfig.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.bench.rsateconfig.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.bench.rsateconfig.Nodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.bench.rsateconfig.Nodes
	 * @generated
	 */
	public Adapter createNodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.bench.rsateconfig.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.bench.rsateconfig.Param
	 * @generated
	 */
	public Adapter createParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.bench.rsateconfig.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.bench.rsateconfig.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.bench.rsateconfig.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.bench.rsateconfig.Resources
	 * @generated
	 */
	public Adapter createResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.bench.rsateconfig.RSATEConfig <em>RSATE Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.bench.rsateconfig.RSATEConfig
	 * @generated
	 */
	public Adapter createRSATEConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.bench.rsateconfig.VirtualResource <em>Virtual Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.bench.rsateconfig.VirtualResource
	 * @generated
	 */
	public Adapter createVirtualResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rskytech.hmi.bench.rsateconfig.VirtualResources <em>Virtual Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rskytech.hmi.bench.rsateconfig.VirtualResources
	 * @generated
	 */
	public Adapter createVirtualResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RSATEConfigAdapterFactory
