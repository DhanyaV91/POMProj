package com.training.regression.tests;

import org.openqa.selenium.WebDriver;

import com.training.pom.CourseAssessmentPOM;

public class CourseAssessmentTest {
	
	private CourseAssessmentPOM assessmentPOM;

	public CourseAssessmentTest(WebDriver driver) {
		assessmentPOM = new CourseAssessmentPOM(driver);
	}
	
	public void courseAssessmentActivity() throws InterruptedException {
		assessmentPOM.clickCourseCatalog();
		assessmentPOM.searchSECourse("Basics of Selenium");
		assessmentPOM.subscribeCourse();
		assessmentPOM.SECourseAssessment("Test Driven Development", "Behaviour Driven Development", "Data Driven Testing", "Test New Generation", "Simple Object Access Protocol");
	}
	
	public void logoutDBTest() throws InterruptedException {
		assessmentPOM.logout();
	}

}
