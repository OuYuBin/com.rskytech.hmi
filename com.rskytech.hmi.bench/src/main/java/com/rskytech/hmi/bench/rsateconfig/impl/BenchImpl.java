/**
 */
package com.rskytech.hmi.bench.rsateconfig.impl;

import com.rskytech.hmi.bench.rsateconfig.Bench;
import com.rskytech.hmi.bench.rsateconfig.Drivers;
import com.rskytech.hmi.bench.rsateconfig.Nodes;
import com.rskytech.hmi.bench.rsateconfig.RSATEConfigPackage;
import com.rskytech.hmi.bench.rsateconfig.Resources;
import com.rskytech.hmi.bench.rsateconfig.VirtualResources;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bench</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.BenchImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.BenchImpl#getDrivers <em>Drivers</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.BenchImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.BenchImpl#getVirtualResources <em>Virtual Resources</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.BenchImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.BenchImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.rskytech.hmi.bench.rsateconfig.impl.BenchImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BenchImpl extends MinimalEObjectImpl.Container implements Bench {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected Nodes nodes;

	/**
	 * The cached value of the '{@link #getDrivers() <em>Drivers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivers()
	 * @generated
	 * @ordered
	 */
	protected Drivers drivers;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected Resources resources;

	/**
	 * The cached value of the '{@link #getVirtualResources() <em>Virtual Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualResources()
	 * @generated
	 * @ordered
	 */
	protected VirtualResources virtualResources;

	/**
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * This is true if the Port attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean portESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BenchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RSATEConfigPackage.Literals.BENCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodes getNodes() {
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodes(Nodes newNodes, NotificationChain msgs) {
		Nodes oldNodes = nodes;
		nodes = newNodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__NODES, oldNodes, newNodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodes(Nodes newNodes) {
		if (newNodes != nodes) {
			NotificationChain msgs = null;
			if (nodes != null)
				msgs = ((InternalEObject)nodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.BENCH__NODES, null, msgs);
			if (newNodes != null)
				msgs = ((InternalEObject)newNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.BENCH__NODES, null, msgs);
			msgs = basicSetNodes(newNodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__NODES, newNodes, newNodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drivers getDrivers() {
		return drivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDrivers(Drivers newDrivers, NotificationChain msgs) {
		Drivers oldDrivers = drivers;
		drivers = newDrivers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__DRIVERS, oldDrivers, newDrivers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrivers(Drivers newDrivers) {
		if (newDrivers != drivers) {
			NotificationChain msgs = null;
			if (drivers != null)
				msgs = ((InternalEObject)drivers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.BENCH__DRIVERS, null, msgs);
			if (newDrivers != null)
				msgs = ((InternalEObject)newDrivers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.BENCH__DRIVERS, null, msgs);
			msgs = basicSetDrivers(newDrivers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__DRIVERS, newDrivers, newDrivers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resources getResources() {
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResources(Resources newResources, NotificationChain msgs) {
		Resources oldResources = resources;
		resources = newResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__RESOURCES, oldResources, newResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResources(Resources newResources) {
		if (newResources != resources) {
			NotificationChain msgs = null;
			if (resources != null)
				msgs = ((InternalEObject)resources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.BENCH__RESOURCES, null, msgs);
			if (newResources != null)
				msgs = ((InternalEObject)newResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.BENCH__RESOURCES, null, msgs);
			msgs = basicSetResources(newResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__RESOURCES, newResources, newResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualResources getVirtualResources() {
		return virtualResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVirtualResources(VirtualResources newVirtualResources, NotificationChain msgs) {
		VirtualResources oldVirtualResources = virtualResources;
		virtualResources = newVirtualResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__VIRTUAL_RESOURCES, oldVirtualResources, newVirtualResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualResources(VirtualResources newVirtualResources) {
		if (newVirtualResources != virtualResources) {
			NotificationChain msgs = null;
			if (virtualResources != null)
				msgs = ((InternalEObject)virtualResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.BENCH__VIRTUAL_RESOURCES, null, msgs);
			if (newVirtualResources != null)
				msgs = ((InternalEObject)newVirtualResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSATEConfigPackage.BENCH__VIRTUAL_RESOURCES, null, msgs);
			msgs = basicSetVirtualResources(newVirtualResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__VIRTUAL_RESOURCES, newVirtualResources, newVirtualResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__IP, oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		boolean oldPortESet = portESet;
		portESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSATEConfigPackage.BENCH__PORT, oldPort, port, !oldPortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPort() {
		int oldPort = port;
		boolean oldPortESet = portESet;
		port = PORT_EDEFAULT;
		portESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RSATEConfigPackage.BENCH__PORT, oldPort, PORT_EDEFAULT, oldPortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPort() {
		return portESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RSATEConfigPackage.BENCH__NODES:
				return basicSetNodes(null, msgs);
			case RSATEConfigPackage.BENCH__DRIVERS:
				return basicSetDrivers(null, msgs);
			case RSATEConfigPackage.BENCH__RESOURCES:
				return basicSetResources(null, msgs);
			case RSATEConfigPackage.BENCH__VIRTUAL_RESOURCES:
				return basicSetVirtualResources(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RSATEConfigPackage.BENCH__NODES:
				return getNodes();
			case RSATEConfigPackage.BENCH__DRIVERS:
				return getDrivers();
			case RSATEConfigPackage.BENCH__RESOURCES:
				return getResources();
			case RSATEConfigPackage.BENCH__VIRTUAL_RESOURCES:
				return getVirtualResources();
			case RSATEConfigPackage.BENCH__IP:
				return getIp();
			case RSATEConfigPackage.BENCH__NAME:
				return getName();
			case RSATEConfigPackage.BENCH__PORT:
				return getPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RSATEConfigPackage.BENCH__NODES:
				setNodes((Nodes)newValue);
				return;
			case RSATEConfigPackage.BENCH__DRIVERS:
				setDrivers((Drivers)newValue);
				return;
			case RSATEConfigPackage.BENCH__RESOURCES:
				setResources((Resources)newValue);
				return;
			case RSATEConfigPackage.BENCH__VIRTUAL_RESOURCES:
				setVirtualResources((VirtualResources)newValue);
				return;
			case RSATEConfigPackage.BENCH__IP:
				setIp((String)newValue);
				return;
			case RSATEConfigPackage.BENCH__NAME:
				setName((String)newValue);
				return;
			case RSATEConfigPackage.BENCH__PORT:
				setPort((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RSATEConfigPackage.BENCH__NODES:
				setNodes((Nodes)null);
				return;
			case RSATEConfigPackage.BENCH__DRIVERS:
				setDrivers((Drivers)null);
				return;
			case RSATEConfigPackage.BENCH__RESOURCES:
				setResources((Resources)null);
				return;
			case RSATEConfigPackage.BENCH__VIRTUAL_RESOURCES:
				setVirtualResources((VirtualResources)null);
				return;
			case RSATEConfigPackage.BENCH__IP:
				setIp(IP_EDEFAULT);
				return;
			case RSATEConfigPackage.BENCH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RSATEConfigPackage.BENCH__PORT:
				unsetPort();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RSATEConfigPackage.BENCH__NODES:
				return nodes != null;
			case RSATEConfigPackage.BENCH__DRIVERS:
				return drivers != null;
			case RSATEConfigPackage.BENCH__RESOURCES:
				return resources != null;
			case RSATEConfigPackage.BENCH__VIRTUAL_RESOURCES:
				return virtualResources != null;
			case RSATEConfigPackage.BENCH__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case RSATEConfigPackage.BENCH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RSATEConfigPackage.BENCH__PORT:
				return isSetPort();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ip: ");
		result.append(ip);
		result.append(", name: ");
		result.append(name);
		result.append(", port: ");
		if (portESet) result.append(port); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BenchImpl
