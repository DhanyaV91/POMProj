package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ProjectCreateTest createProject;
	private static Properties properties;
	private ScreenShot screenShot;
	

	@BeforeTest
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		createProject = new ProjectCreateTest(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);		
	}
	
	
	  @AfterTest public void tearDown() throws Exception { 
		 Thread.sleep(1000);
		 driver.quit(); 
		}
	 
	
	@Test(priority=0)
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("suniln");
		loginPOM.sendPassword("sunil@123");
		loginPOM.clickLoginBtn();
		createProject.createProject();
		screenShot.captureScreenShot("First");
	}
	
	@Test(priority=1)
	public void logoutTest() throws InterruptedException {
		createProject.logOut();
	}
}
