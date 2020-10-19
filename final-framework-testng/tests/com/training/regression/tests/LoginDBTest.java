package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginDBTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private CourseAssessmentTest courseAssessment;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
	
	@BeforeTest
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		courseAssessment = new CourseAssessmentTest(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get(baseUrl);		
	}

	@AfterTest public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
		}
	 
	@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class, priority=0)
	public void loginDBTest(String userName, String password) throws InterruptedException {
		// for demonstration 
//		genericMethods.getElement("login", "id"); 
				
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		courseAssessment.courseAssessmentActivity();
		screenShot.captureScreenShot(userName);
	}

	@Test(priority=1)
	public void logoutDBTest() throws InterruptedException {
		courseAssessment.logoutDBTest();
	}
}