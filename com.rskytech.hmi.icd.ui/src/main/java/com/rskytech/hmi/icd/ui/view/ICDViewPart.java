package com.rskytech.hmi.icd.ui.view;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.IconUIResource;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.part.ViewPart;

public class ICDViewPart extends ViewPart {

	public static String VIEW_ID = "com.rskytech.hmi.icd.ui.view.ICDViewPart";

	public ICDViewPart() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		gridLayout.verticalSpacing = 0;
		gridLayout.horizontalSpacing = 0;
		parent.setLayout(gridLayout);

		FormToolkit formToolkit = new FormToolkit(Display.getCurrent());
		Form form = formToolkit.createForm(parent);
		form.setText("ICD资源管理");
		formToolkit.decorateFormHeading(form);
		form.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

		// Composite client = formToolkit.createComposite(parent, SWT.NONE);
		// client.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		TreeViewer icdTreeViewer = new TreeViewer(parent, SWT.MULTI
				| SWT.BORDER | SWT.FULL_SELECTION);
		icdTreeViewer.getTree().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));
		icdTreeViewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				File file = new File("/Users/robin/Downloads/xml/My.icd");
				if (file.exists()) {
					IFileStore fileStore = EFS.getLocalFileSystem().getStore(
							file.toURI());
					IEditorInput input = new FileStoreEditorInput(fileStore);
					try {
						ICDViewPart.this
								.getSite()
								.getWorkbenchWindow()
								.getActivePage()
								.openEditor(input,
										"com.rskytech.hmi.icd.model.editor.RSICDConfigEditorID");
					} catch (PartInitException e) {
						e.printStackTrace();
					}
				}
			}
		});
		icdTreeViewer.setContentProvider(new ITreeContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
				// TODO Auto-generated method stub

			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean hasChildren(Object element) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Object getParent(Object element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] getElements(Object inputElement) {
				// TODO Auto-generated method stub
				return ((List) inputElement).toArray();
			}

			@Override
			public Object[] getChildren(Object parentElement) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		icdTreeViewer.setLabelProvider(new ILabelProvider() {

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
				// TODO Auto-generated method stub
				return (String) element;
			}

			@Override
			public Image getImage(Object element) {
				// TODO Auto-generated method stub
				return null;
			}
		});

		String icds = "icd";
		ArrayList list = new ArrayList();
		list.add(icds);
		icdTreeViewer.setInput(list);

	}

	@Override
	public void setFocus() {

	}

}
