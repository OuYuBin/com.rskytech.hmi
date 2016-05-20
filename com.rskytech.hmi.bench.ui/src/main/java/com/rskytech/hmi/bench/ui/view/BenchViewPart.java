package com.rskytech.hmi.bench.ui.view;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.part.ViewPart;

import com.rskytech.hmi.bench.ui.Activator;
import com.rskytech.hmi.bench.ui.actions.ImportBenchFileAction;

/**
 * 
 * @author robin
 *
 */
public class BenchViewPart extends ViewPart {

	public static String ID = "com.rskytech.hmi.application.BenchViewPart";

	public TreeViewer ateTreeViewer;

	public BenchViewPart() {
	}

	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout(1, false);
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 1;
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		parent.setLayout(layout);

		FormToolkit formToolkit = new FormToolkit(Display.getCurrent());
		Form form = formToolkit.createForm(parent);
		form.setText("自动测试设备资源列表");
		formToolkit.decorateFormHeading(form);
		form.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		form.getToolBarManager().add(new ImportBenchFileAction(this));
		form.getToolBarManager().update(true);

		Composite body = form.getBody();
		layout = new GridLayout(1, false);
		layout.horizontalSpacing = 0;
		layout.marginWidth = 0;
		body.setLayout(layout);

		final Section section = formToolkit.createSection(body, Section.TITLE_BAR | Section.TWISTIE);
		section.clientVerticalSpacing = 0;
		section.marginWidth = 0;
		section.marginHeight = 0;
		section.setText("过滤");
		GridData gd = new GridData(SWT.FILL, SWT.TOP, true, false);
		section.setLayoutData(gd);

		Composite searchSectionClient = formToolkit.createComposite(section, SWT.NONE);
		layout = new GridLayout(1, false);
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 0;
		// layout.marginHeight = 0;
		// layout.marginWidth = 5;
		searchSectionClient.setLayout(layout);
		Text searchText = formToolkit.createText(searchSectionClient, "",
				SWT.BORDER | SWT.SEARCH | SWT.ICON_SEARCH | SWT.CANCEL);
		searchText.setMessage("搜索:");
		searchText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		section.setClient(searchSectionClient);

		Composite client = formToolkit.createComposite(parent, SWT.NONE);
		layout = new GridLayout();
		layout.marginWidth = 5;
		layout.marginTop = 0;
		// layout.marginHeight = 0;
		client.setLayout(layout);
		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		client.setLayoutData(gd);

		createATEComposite(client);
	}

	private void createATEComposite(Composite client) {
		ateTreeViewer = new TreeViewer(client, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		Tree tree = ateTreeViewer.getTree();
		// tree.setHeaderVisible(true);
		//tree.setLinesVisible(true);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		ateTreeViewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				Object object = selection.getFirstElement();
				if (object instanceof File) {
					File file = (File) object;
					if (file.exists() && file.isFile()) {
						IFileStore fileStore = EFS.getLocalFileSystem().getStore(file.toURI());
						IEditorInput input = new FileStoreEditorInput(fileStore);
						// FileInfo fileInfo=(FileInfo) fileStore.fetchInfo();
						// fileInfo.setName("sysConfig");
						// fileInfo.set
						// IDE.openEditorOnFileStore(window.getActivePage(),
						// fileStore);
						try {
							BenchViewPart.this.getSite().getWorkbenchWindow().getActivePage().openEditor(input,
									"com.rskytech.hmi.bench.rsateconfig.editor.RSATEConfigEditorID");
						} catch (PartInitException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});

		ateTreeViewer.setContentProvider(new ITreeContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

			}

			@Override
			public void dispose() {

			}

			@Override
			public boolean hasChildren(Object element) {
				return getChildren(element).length > 0;
			}

			@Override
			public Object getParent(Object element) {
				return null;
			}

			@Override
			public Object[] getElements(Object inputElement) {
				return ((List) inputElement).toArray();
			}

			@Override
			public Object[] getChildren(Object parentElement) {
				if (parentElement instanceof File) {
					if (((File) parentElement).isDirectory()) {
						return ((File) parentElement).listFiles();
					}
				}
				return Collections.EMPTY_LIST.toArray();
			}
		});

		ateTreeViewer.setLabelProvider(new ILabelProvider() {

			@Override
			public void removeListener(ILabelProviderListener listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean isLabelProperty(Object element, String property) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub

			}

			@Override
			public void addListener(ILabelProviderListener listener) {
				// TODO Auto-generated method stub

			}

			@Override
			public String getText(Object element) {
				if (element instanceof File) {

					return ((File) element).getName();

				}
				return null;
			}

			@Override
			public Image getImage(Object element) {
				if (element instanceof File) {
					if (((File) element).isDirectory())
						return Activator.getDefault().getImageRegistry().get("Benches");
					else
						return Activator.getDefault().getImageRegistry().get("Bench");
				}
				return null;
			}
		});
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IPath rootPath = workspace.getRoot().getLocation();
		IPath benchesPath = rootPath.append("Benches");
		File benchesFile = benchesPath.toFile();
		if (!(benchesFile.exists())) {
			benchesFile.mkdir();
		}
		// IFolder resource = workspace.getRoot().getFolder(benchesPath);
		// try {
		// if (resource.exists()) {
		// IResource[] resouces = resource.members();
		// }
		// } catch (CoreException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// File[] benchFiles = benchFolder.listFiles();
		List<File> list = new ArrayList<File>();
		list.add(benchesFile);

		ateTreeViewer.setInput(list);
	}

	@Override
	public void setFocus() {

	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		if ((TreeViewer.class).equals(adapter)) {
			return ateTreeViewer;
		}
		return super.getAdapter(adapter);
	}

}
