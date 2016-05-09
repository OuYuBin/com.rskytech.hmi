/**
 */
package com.rskytech.hmi.bench.rsateconfig.provider;

import com.rskytech.hmi.bench.rsateconfig.util.RSATEConfigAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RSATEConfigItemProviderAdapterFactory extends RSATEConfigAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSATEConfigItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rskytech.hmi.bench.rsateconfig.Bench} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BenchItemProvider benchItemProvider;

	/**
	 * This creates an adapter for a {@link com.rskytech.hmi.bench.rsateconfig.Bench}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBenchAdapter() {
		if (benchItemProvider == null) {
			benchItemProvider = new BenchItemProvider(this);
		}

		return benchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rskytech.hmi.bench.rsateconfig.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link com.rskytech.hmi.bench.rsateconfig.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rskytech.hmi.bench.rsateconfig.Driver} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriverItemProvider driverItemProvider;

	/**
	 * This creates an adapter for a {@link com.rskytech.hmi.bench.rsateconfig.Driver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDriverAdapter() {
		if (driverItemProvider == null) {
			driverItemProvider = new DriverItemProvider(this);
		}

		return driverItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rskytech.hmi.bench.rsateconfig.DriverNameAndVersion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriverNameAndVersionItemProvider driverNameAndVersionItemProvider;

	/**
	 * This creates an adapter for a {@link com.rskytech.hmi.bench.rsateconfig.DriverNameAndVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDriverNameAndVersionAdapter() {
		if (driverNameAndVersionItemProvider == null) {
			driverNameAndVersionItemProvider = new DriverNameAndVersionItemProvider(this);
		}

		return driverNameAndVersionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rskytech.hmi.bench.rsateconfig.Drivers} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriversItemProvider driversItemProvider;

	/**
	 * This creates an adapter for a {@link com.rskytech.hmi.bench.rsateconfig.Drivers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDriversAdapter() {
		if (driversItemProvider == null) {
			driversItemProvider = new DriversItemProvider(this);
		}

		return driversItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rskytech.hmi.bench.rsateconfig.Node} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeItemProvider nodeItemProvider;

	/**
	 * This creates an adapter for a {@link com.rskytech.hmi.bench.rsateconfig.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeAdapter() {
		if (nodeItemProvider == null) {
			nodeItemProvider = new NodeItemProvider(this);
		}

		return nodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rskytech.hmi.bench.rsateconfig.Nodes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodesItemProvider nodesItemProvider;

	/**
	 * This creates an adapter for a {@link com.rskytech.hmi.bench.rsateconfig.Nodes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodesAdapter() {
		if (nodesItemProvider == null) {
			nodesItemProvider = new NodesItemProvider(this);
		}

		return nodesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rskytech.hmi.bench.rsateconfig.Resouces} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResoucesItemProvider resoucesItemProvider;

	/**
	 * This creates an adapter for a {@link com.rskytech.hmi.bench.rsateconfig.Resouces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResoucesAdapter() {
		if (resoucesItemProvider == null) {
			resoucesItemProvider = new ResoucesItemProvider(this);
		}

		return resoucesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rskytech.hmi.bench.rsateconfig.Resource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceItemProvider resourceItemProvider;

	/**
	 * This creates an adapter for a {@link com.rskytech.hmi.bench.rsateconfig.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceAdapter() {
		if (resourceItemProvider == null) {
			resourceItemProvider = new ResourceItemProvider(this);
		}

		return resourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rskytech.hmi.bench.rsateconfig.RSATEConfig} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RSATEConfigItemProvider rsateConfigItemProvider;

	/**
	 * This creates an adapter for a {@link com.rskytech.hmi.bench.rsateconfig.RSATEConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRSATEConfigAdapter() {
		if (rsateConfigItemProvider == null) {
			rsateConfigItemProvider = new RSATEConfigItemProvider(this);
		}

		return rsateConfigItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (benchItemProvider != null) benchItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (driverItemProvider != null) driverItemProvider.dispose();
		if (driverNameAndVersionItemProvider != null) driverNameAndVersionItemProvider.dispose();
		if (driversItemProvider != null) driversItemProvider.dispose();
		if (nodeItemProvider != null) nodeItemProvider.dispose();
		if (nodesItemProvider != null) nodesItemProvider.dispose();
		if (resoucesItemProvider != null) resoucesItemProvider.dispose();
		if (resourceItemProvider != null) resourceItemProvider.dispose();
		if (rsateConfigItemProvider != null) rsateConfigItemProvider.dispose();
	}

}
