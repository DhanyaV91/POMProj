package com.training.sanity.tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import com.training.pom.ProjectPOM;

public class ProjectCreateTest {
	private ProjectPOM projectPOM;
	
	public ProjectCreateTest(WebDriver driver) throws IOException {	
		projectPOM = new ProjectPOM(driver);
	}
	
	public void createProject() throws InterruptedException {
	  projectPOM.clickMyCoursesPage();
	  projectPOM.clickOnSECourse();
	  projectPOM.clickOnProjectIcon();
	  projectPOM.createProject("e learning", "e learning project");
	  projectPOM.createTask("design");
	  projectPOM.addRole("developer");
	  projectPOM.assignRole("sunil n");
	}
	
	public void logOut() throws InterruptedException {
		projectPOM.logoutTeacher();
	}
}
