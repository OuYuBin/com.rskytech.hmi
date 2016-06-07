/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.rskytech.hmi.icd.model.editor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;

import org.eclipse.emf.edit.ui.action.ControlAction;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.action.ValidateAction;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;

import com.rskytech.hmi.icd.common.model.IRSICDConfigContainerModel;
import com.rskytech.hmi.icd.model.Device;
import com.rskytech.hmi.icd.model.editor.action.RSICDCreateChildAction;
import com.rskytech.hmi.protocol.manager.RSProtocolManager;
import com.rskytech.hmi.protocol.provider.IRSProtocolContentProvider;

/**
 * This is the action bar contributor for the RSICDConfig model editor. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class RSICDConfigActionBarContributor extends EditingDomainActionBarContributor
		implements ISelectionChangedListener {
	/**
	 * This keeps track of the active editor. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected IEditorPart activeEditorPart;

	/**
	 * This keeps track of the current selection provider. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ISelectionProvider selectionProvider;

	/**
	 * This action opens the Properties view. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected IAction showPropertiesViewAction = new Action(
			RSICDEditorPlugin.INSTANCE.getString("_UI_ShowPropertiesView_menu_item")) {
		public void run() {
			try {
				getPage().showView("org.eclipse.ui.views.PropertySheet");
			} catch (PartInitException exception) {
				RSICDEditorPlugin.INSTANCE.log(exception);
			}
		}
	};

	/**
	 * This action refreshes the viewer of the current editor if the editor
	 * implements {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IAction refreshViewerAction = new Action(
			RSICDEditorPlugin.INSTANCE.getString("_UI_RefreshViewer_menu_item")) {
		public boolean isEnabled() {
			return activeEditorPart instanceof IViewerProvider;
		}

		public void run() {
			if (activeEditorPart instanceof IViewerProvider) {
				Viewer viewer = ((IViewerProvider) activeEditorPart).getViewer();
				if (viewer != null) {
					viewer.refresh();
				}
			}
		}
	};

	/**
	 * This will contain one
	 * {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to
	 * each descriptor generated for the current selection by the item provider.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection createChildActions = new ArrayList();

	/**
	 * This is the menu manager into which menu contribution items should be
	 * added for CreateChild actions. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected IMenuManager createChildMenuManager;

	/**
	 * This will contain one
	 * {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} corresponding
	 * to each descriptor generated for the current selection by the item
	 * provider. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection createSiblingActions;

	/**
	 * This is the menu manager into which menu contribution items should be
	 * added for CreateSibling actions. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected IMenuManager createSiblingMenuManager;

	/**
	 * This creates an instance of the contributor. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public RSICDConfigActionBarContributor() {
		super(ADDITIONS_LAST_STYLE);
		loadResourceAction = new LoadResourceAction();
		validateAction = new ValidateAction();
		controlAction = new ControlAction();
	}

	/**
	 * This adds Separators for editor additions to the tool bar. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator("rsicdconfig-settings"));
		toolBarManager.add(new Separator("rsicdconfig-additions"));
	}

	/**
	 * This adds to the menu bar a menu and some separators for editor
	 * additions, as well as the sub-menus for object creation items. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);

		// IMenuManager submenuManager = new
		// MenuManager(RSICDEditorPlugin.INSTANCE.getString("_UI_RSICDConfigEditor_menu"),
		// "com.rskytech.hmi.icd.modelMenuID");
		// menuManager.insertAfter("additions", submenuManager);
		// submenuManager.add(new Separator("settings"));
		// submenuManager.add(new Separator("actions"));
		// submenuManager.add(new Separator("additions"));
		// submenuManager.add(new Separator("additions-end"));
		//
		// // Prepare for CreateChild item addition or removal.
		// //
		// createChildMenuManager = new
		// MenuManager(RSICDEditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item"));
		// submenuManager.insertBefore("additions", createChildMenuManager);
		//
		// // Prepare for CreateSibling item addition or removal.
		// //
		// createSiblingMenuManager = new
		// MenuManager(RSICDEditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item"));
		// submenuManager.insertBefore("additions", createSiblingMenuManager);
		//
		// // Force an update because Eclipse hides empty menus now.
		// //
		// submenuManager.addMenuListener
		// (new IMenuListener() {
		// public void menuAboutToShow(IMenuManager menuManager) {
		// menuManager.updateAll(true);
		// }
		// });
		//
		// addGlobalActions(submenuManager);
	}

	@Override
	public void setActivePage(IEditorPart part) {
		super.setActivePage(part);
	}

	/**
	 * When the active editor changes, this remembers the change and registers
	 * with it as a selection provider. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void setActiveEditor(IEditorPart part) {
		super.setActiveEditor(part);
		activeEditorPart = part;

		// Switch to the new selection provider.
		//
		if (selectionProvider != null) {
			selectionProvider.removeSelectionChangedListener(this);
		}
		if (part == null) {
			selectionProvider = null;
		} else {
			selectionProvider = part.getSite().getSelectionProvider();
			selectionProvider.addSelectionChangedListener(this);

			// Fake a selection changed event to update the menus.
			//
			if (selectionProvider.getSelection() != null) {
				selectionChanged(new SelectionChangedEvent(selectionProvider, selectionProvider.getSelection()));
			}
		}
	}

	/**
	 * This implements
	 * {@link org.eclipse.jface.viewers.ISelectionChangedListener}, handling
	 * {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for
	 * the children and siblings that can be added to the selected object and
	 * updating the menus accordingly. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated not 重建右键菜单,用于添加元素
	 */
	public void selectionChanged(SelectionChangedEvent event) {
		ISelection selection = event.getSelection();
		if (selection instanceof IStructuredSelection) {
			Object object = ((IStructuredSelection) selection).getFirstElement();
			if (object instanceof IRSICDConfigContainerModel) {
				EObject eObject = ((IRSICDConfigContainerModel) object).getEObject();
				if (eObject != null) {
					EditingDomain editingDomain = ((IEditingDomainProvider) activeEditorPart).getEditingDomain();
					Collection newChildDescriptions = editingDomain.getNewChildDescriptors(eObject, null);
					if (newChildDescriptions != null) {
						createChildActions = generateChildActions(eObject, newChildDescriptions);
					}
				}else{
					createChildActions=Collections.EMPTY_LIST;
				}
			}
		}

		// if (createChildMenuManager != null) {
		// depopulateManager(createChildMenuManager, createChildActions);
		// }
		// if (createSiblingMenuManager != null) {
		// depopulateManager(createSiblingMenuManager, createSiblingActions);
		// }

		// Query the new selection for appropriate new child/sibling descriptors
		//
		// Collection newChildDescriptors = null;
		// Collection newSiblingDescriptors = null;
		//
		// ISelection selection = event.getSelection();
		// if (selection instanceof IStructuredSelection &&
		// ((IStructuredSelection) selection).size() == 1) {
		// Object object = ((IStructuredSelection) selection).getFirstElement();
		//
		// EditingDomain domain = ((IEditingDomainProvider)
		// activeEditorPart).getEditingDomain();
		//
		// newChildDescriptors = domain.getNewChildDescriptors(object, null);
		// newSiblingDescriptors = domain.getNewChildDescriptors(null, object);
		// }
		//
		// // Generate actions for selection; populate and redraw the menus.
		// //
		// createChildActions = generateCreateChildActions(newChildDescriptors,
		// selection);
		// createSiblingActions =
		// generateCreateSiblingActions(newSiblingDescriptors, selection);

		// if (createChildMenuManager != null) {
		// populateManager(createChildMenuManager, createChildActions, null);
		// createChildMenuManager.update(true);
		// }
		// if (createSiblingMenuManager != null) {
		// populateManager(createSiblingMenuManager, createSiblingActions,
		// null);
		// createSiblingMenuManager.update(true);
		// }
	}

	private Collection<IAction> generateChildActions(EObject eObject,
			Collection<?> newChildDescriptions) {
		Collection<IAction> actions = new ArrayList<IAction>();
		// --针对设备节点定制总线菜单显示
		if (eObject instanceof Device) {
			List<IRSProtocolContentProvider> providers = RSProtocolManager.createProtocolProvider();
			for (IRSProtocolContentProvider provider : providers) {
				String protocolName = provider.getProtocolName();
				String protocolGroupName = provider.getGroupName();
				RSICDCreateChildAction rsICDCreateChildAction = new RSICDCreateChildAction();
				rsICDCreateChildAction.setText(protocolName);
				rsICDCreateChildAction.setGroupName(protocolGroupName);
				rsICDCreateChildAction
						.setImageDescriptor(RSICDEditorPlugin.getPlugin().getImageRegistry().getDescriptor("Channel"));
				actions.add(rsICDCreateChildAction);
			}
		}else{
			for(Object descriptor:newChildDescriptions){
				RSICDCreateChildAction rsICDCreateChildAction = new RSICDCreateChildAction();
				if(descriptor instanceof CommandParameter){
					EObject eChild=(EObject) ((CommandParameter)descriptor).value;
					String name=eChild.eClass().getName();
					rsICDCreateChildAction.setText(name);
					actions.add(rsICDCreateChildAction);
				}
			}
		}
		return actions;
	}

	/**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction}
	 * for each object in <code>descriptors</code>, and returns the collection
	 * of these actions. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection generateCreateChildActions(Collection descriptors, ISelection selection) {
		Collection actions = new ArrayList();
		if (descriptors != null) {
			for (Iterator i = descriptors.iterator(); i.hasNext();) {
				actions.add(new CreateChildAction(activeEditorPart, selection, i.next()));
			}
		}
		return actions;
	}

	/**
	 * This generates a
	 * {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each
	 * object in <code>descriptors</code>, and returns the collection of these
	 * actions. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection generateCreateSiblingActions(Collection descriptors, ISelection selection) {
		Collection actions = new ArrayList();
		if (descriptors != null) {
			for (Iterator i = descriptors.iterator(); i.hasNext();) {
				actions.add(new CreateSiblingAction(activeEditorPart, selection, i.next()));
			}
		}
		return actions;
	}

	/**
	 * This populates the specified <code>manager</code> with
	 * {@link org.eclipse.jface.action.ActionContributionItem}s based on the
	 * {@link org.eclipse.jface.action.IAction}s contained in the
	 * <code>actions</code> collection, by inserting them before the specified
	 * contribution item <code>contributionID</code>. If
	 * <code>contributionID</code> is <code>null</code>, they are simply added.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected void populateManager(IContributionManager manager, Collection<RSICDCreateChildAction> actions,
			String contributionID) {
		// --分组处理action
		Map<String, List<IAction>> actionMap = new HashMap<String, List<IAction>>();
		for (RSICDCreateChildAction action : actions) {
			String groupName = action.getGroupName();
			if (groupName != null) {
				if (!actionMap.containsKey(groupName)) {
					actionMap.put(groupName, new ArrayList<IAction>());
				}
			} else {
				groupName = "common";
				if (!actionMap.containsKey(groupName)) {
					actionMap.put(groupName, new ArrayList<IAction>());
				}
			}
			List createChildActions = actionMap.get(groupName);
			createChildActions.add(action);
		}

		for (Iterator iter = actionMap.entrySet().iterator(); iter.hasNext();) {
			Map.Entry entry = (Entry) iter.next();
			String key = (String) entry.getKey();
			if (key.equals("common")) {
				List<IAction> actionList = (List<IAction>) entry.getValue();
				for (Iterator i = actionList.iterator(); i.hasNext();) {
					IAction action = (IAction) i.next();
					if (contributionID != null) {
						manager.insertBefore(contributionID, action);
					} else {
						manager.add(action);
					}
				}
			} else {
				// --需要生成2级菜单
				MenuManager subMenuManager = new MenuManager(key);
				List<IAction> actionList = (List<IAction>) entry.getValue();
				for (Iterator i = actionList.iterator(); i.hasNext();) {
					IAction action = (IAction) i.next();
					subMenuManager.add(action);
				}
				manager.add(subMenuManager);

			}
		}

		// if (actions != null) {
		//
		// }
	}

	/**
	 * This removes from the specified <code>manager</code> all
	 * {@link org.eclipse.jface.action.ActionContributionItem}s based on the
	 * {@link org.eclipse.jface.action.IAction}s contained in the
	 * <code>actions</code> collection. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected void depopulateManager(IContributionManager manager, Collection actions) {
		if (actions != null) {
			IContributionItem[] items = manager.getItems();
			for (int i = 0; i < items.length; i++) {
				// Look into SubContributionItems
				//
				IContributionItem contributionItem = items[i];
				while (contributionItem instanceof SubContributionItem) {
					contributionItem = ((SubContributionItem) contributionItem).getInnerItem();
				}

				// Delete the ActionContributionItems with matching action.
				//
				if (contributionItem instanceof ActionContributionItem) {
					IAction action = ((ActionContributionItem) contributionItem).getAction();
					if (actions.contains(action)) {
						manager.remove(contributionItem);
					}
				}
			}
		}
	}

	/**
	 * This populates the pop-up menu before it appears. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		super.menuAboutToShow(menuManager);
		MenuManager submenuManager = null;

		submenuManager = new MenuManager("New");
		populateManager(submenuManager, createChildActions, null);
		menuManager.insertBefore("edit", submenuManager);

		// submenuManager = new
		// MenuManager(RSICDEditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item"));
		// populateManager(submenuManager, createSiblingActions, null);
		// menuManager.insertBefore("edit", submenuManager);
	}

	/**
	 * This inserts global actions before the "additions-end" separator. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addGlobalActions(IMenuManager menuManager) {
		// menuManager.insertAfter("additions-end", new
		// Separator("ui-actions"));
		// menuManager.insertAfter("ui-actions", showPropertiesViewAction);
		//
		// refreshViewerAction.setEnabled(refreshViewerAction.isEnabled());
		// menuManager.insertAfter("ui-actions", refreshViewerAction);
		//
		// super.addGlobalActions(menuManager);
	}

	/**
	 * This ensures that a delete action will clean up all references to deleted
	 * objects. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected boolean removeAllReferencesOnDelete() {
		return true;
	}

}