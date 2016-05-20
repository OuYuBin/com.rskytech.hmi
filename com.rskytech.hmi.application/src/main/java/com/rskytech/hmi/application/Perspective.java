package com.rskytech.hmi.application;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.navigator.resources.ProjectExplorer;

import com.rskytech.hmi.bench.ui.view.BenchViewPart;
import com.rskytech.hmi.navigator.TestProjectNavigator;

public class Perspective implements IPerspectiveFactory {

	/**
	 * The ID of the perspective as specified in the extension.
	 */
	public static final String ID = "com.rskytech.hmi.application.perspective";

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);

		// layout.addStandaloneView(NavigationView.ID, false, IPageLayout.LEFT,
		// 0.25f, editorArea);
		IFolderLayout topLeft = layout.createFolder("projects", IPageLayout.LEFT, 0.25f, editorArea);
		// folder.addPlaceholder(View.ID + ":*");
		topLeft.addView(TestProjectNavigator.VIEW_ID);

		// layout.getViewLayout(NavigationView.ID).setCloseable(false);
		// IFolderLayout topLeft=layout.addView(TestProjectNavigator.VIEW_ID,
		// IPageLayout.LEFT, 0.23f, editorArea);
		IFolderLayout bottomLeft = layout.createFolder("benches", IPageLayout.BOTTOM, 0.50f, "projects");

		bottomLeft.addView(BenchViewPart.ID);
	}
}
