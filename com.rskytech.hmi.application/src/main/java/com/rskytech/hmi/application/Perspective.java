package com.rskytech.hmi.application;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.navigator.resources.ProjectExplorer;

import com.rskytech.hmi.navigator.TestProjectNavigator;

public class Perspective implements IPerspectiveFactory {

	/**
	 * The ID of the perspective as specified in the extension.
	 */
	public static final String ID = "com.rskytech.hmi.application.perspective";

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		
//		layout.addStandaloneView(NavigationView.ID,  false, IPageLayout.LEFT, 0.25f, editorArea);
//		IFolderLayout folder = layout.createFolder("messages", IPageLayout.TOP, 0.5f, editorArea);
//		folder.addPlaceholder(View.ID + ":*");
//		folder.addView(View.ID);
		
		//layout.getViewLayout(NavigationView.ID).setCloseable(false);
		layout.addView(TestProjectNavigator.VIEW_ID, IPageLayout.LEFT, 0.23f, editorArea);
		
		layout.addView(BenchViewPart.ID,IPageLayout.RIGHT,0.67f,editorArea);
	}
}
