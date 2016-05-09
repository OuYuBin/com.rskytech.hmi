package com.rskytech.hmi.project.wizard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import com.rskytech.hmi.internal.resource.ResourceUtil;
import com.rskytech.hmi.project.wizard.page.NewRskyTechTestProjectWizardPage;
import com.rskytech.hmi.template.util.TemplateUtils;

/**
 * 
 * @author robin
 *
 */
public class NewRskyTechTestProjectWizard extends BasicNewProjectResourceWizard implements INewWizard {

	private NewRskyTechTestProjectWizardPage newRskyTechTestProjectWizardPage;

	IWorkbench workbench;

	public NewRskyTechTestProjectWizard() {
		setNeedsProgressMonitor(true);
		//super();
	}

	@Override
	public void addPages() {
		newRskyTechTestProjectWizardPage = new NewRskyTechTestProjectWizardPage();
		addPage(newRskyTechTestProjectWizardPage);
		//super.addPages();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		this.workbench = workbench;
		this.setWindowTitle("新建测试项目");
		//super.init(workbench, currentSelection);
	}

	@Override
	public boolean performFinish() {
		final String projectName = newRskyTechTestProjectWizardPage.getProjectNameText().getText();
		try {
			getContainer().run(true, true, new WorkspaceModifyOperation() {

				@Override
				protected void execute(IProgressMonitor monitor)
						throws CoreException, InvocationTargetException, InterruptedException {
					monitor.beginTask("创建测试项目...", 3000);
					IProject project = ResourceUtil.getProject(projectName);
					if (!project.exists()) {
						IProjectDescription desc = project.getWorkspace().newProjectDescription(project.getName());
						desc.setLocationURI(project.getLocationURI());
						project.create(desc,monitor);
						if (project != null && project.exists()) {
				            
							// IFolder
							// destFolder=project.getProjectRelativePath()
//							IFolder destFolder = ResourcesPlugin.getWorkspace().getRoot()
//									.getFolder(project.getLocation());
							project.open(monitor);
							TemplateUtils.copyFolderFromTemplate(project, "newSimpleProject",null);
							ResourcesPlugin.getWorkspace().save(true, monitor);
						}
					}
					monitor.done();

				}
			});
			updatePerspective();
		} catch (InvocationTargetException | InterruptedException e) {
			e.printStackTrace();
		}

		return true;
	}

}
