package com.training.regression.tests;

import org.openqa.selenium.WebDriver;

import com.training.pom.CourseTestPOM;

public class CourseTest {
	
	private CourseTestPOM testPOM;

	public CourseTest(WebDriver driver) {
		testPOM = new CourseTestPOM(driver);
	}
	
	public void courseTestActivity() throws InterruptedException {
		testPOM.clickCourseCatalog();
		testPOM.searchSECourse("SECourse");
		testPOM.subscribeCourse();
		testPOM.SECourseTest("behavior-driven development", "build, test, and deploy", "testing framework", "JUnit5", "Collection of user stories is an Epic", "User story is functionality or the requirement if the user.");
	}
	
	public void logoutDBTest() throws InterruptedException {
		testPOM.logout();
	}

}
