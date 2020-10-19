package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseTestPOM {
	private WebDriver driver;
	
	@FindBy(linkText="Course catalog")
	private WebElement courseCatlg;
	
	@FindBy(name="search_term")
	private WebElement searchCourse;
	
	@FindBy(xpath="//*[@id='cm-content']/div/div[2]/div/div/div/div[1]/form/div/div/button")
	private WebElement searchCourseBtn;
	
	@FindBy(xpath="//*[@title='Subscribe']")
	private WebElement subscribeCourse;
	
	@FindBy(linkText="My courses")
	private WebElement myCoursesTab;	
	
	 @FindBy(linkText="SECourse") 
	 private WebElement SECourseLink;
	  
	  @FindBy(xpath="//*[@title='Tests']") 
	  private WebElement Tests;
	  
	  @FindBy(linkText="SECourseTest")
	  private WebElement SECourseTestLink;
	  
	  @FindBy(linkText="Start test")
	  private WebElement startTestBtn;
	  
	  @FindBy(id="choice-308-1")
	  private WebElement idChk;
	  
	  @FindBy(id="choice-308-2")
	  private WebElement nameChk;
	  
	  @FindBy(id="choice-308-3")
	  private WebElement tagNameChk;
	  
	  @FindBy(id="choice-308-4")
	  private WebElement linkTextChk;
	  
	  @FindBy(id="choice-308-5")
	  private WebElement partialLinkTextChk;
	  
	  @FindBy(tagName="iframe")
	  private WebElement iFrame;	  
	  
	  @FindBy(tagName="p")
	  private WebElement testQustns;
	  
	  @FindBy(xpath="//*[@name='save_now']")
	  private WebElement saveAnsBtn;
	  
	  @FindBy(id="choice-311-1")
	  private WebElement selWebDriver;
	  
	  @FindBy(id="choice-311-2")
	  private WebElement selRC;
	  
	  @FindBy(id="choice-311-3")
	  private WebElement selIDE;
	  
	  @FindBy(id="choice-311-4")
	  private WebElement selGrid;
	  
	  @FindBy(id="choice_id_2_0")
	  private WebElement blank1;
	  
	  @FindBy(id="choice_id_3_0")
	  private WebElement blank2;
	  
	  @FindBy(id="choice_id_5_0")
	  private WebElement blank3;
	  
	  @FindBy(id="choice_id_6_0")
	  private WebElement blank4;
	  
		@FindBy(className="dropdown-toggle")
		private WebElement usrDropDown;
		
		@FindBy(xpath="//*[@title='Logout']")
		private WebElement logout;
	
	
	// the driver information will be given by selenium test case 
	public CourseTestPOM(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	public void clickCourseCatalog() throws InterruptedException {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		this.courseCatlg.click();
	}
	
	
	 public void searchSECourse(String name) throws InterruptedException {
		 this.searchCourse.sendKeys(name);
		 this.searchCourseBtn.click();
	 }
	 
	 public void subscribeCourse() throws InterruptedException {
			Actions act = new Actions(driver);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			this.subscribeCourse.click();
	 }
	 
	 public void SECourseTest(String ans1, String ans2, String ans3, String ans4, String ans5, String ans6) throws InterruptedException {
		 this.myCoursesTab.click();
		 this.SECourseLink.click();
		 this.Tests.click();
		 this.SECourseTestLink.click();
		 this.startTestBtn.click();
		 this.idChk.click();
		 this.nameChk.click();
		 this.tagNameChk.click();
		 this.linkTextChk.click();
		 this.partialLinkTextChk.click();
		 this.saveAnsBtn.click();
		 Thread.sleep(1000);
		 this.blank1.sendKeys(ans1);
		 this.saveAnsBtn.click();
		 Thread.sleep(1000);
		 this.blank2.sendKeys(ans2);
		 this.saveAnsBtn.click();
		 Thread.sleep(1000);
		 this.selWebDriver.click();
		 this.selRC.click();
		 this.selIDE.click();
		 this.selGrid.click();
		 this.saveAnsBtn.click();		 
		 Thread.sleep(1000); 
		 this.blank3.sendKeys(ans3);
		 this.saveAnsBtn.click();
		 Thread.sleep(1000);
		 this.blank4.sendKeys(ans4);
		 this.saveAnsBtn.click();
		 Thread.sleep(1000);
		 driver.switchTo().frame(iFrame);
		 this.testQustns.sendKeys(ans5);
		 driver.switchTo().defaultContent();
		 this.saveAnsBtn.click();
		 Thread.sleep(1000);	 
		 driver.switchTo().frame(iFrame);
		 this.testQustns.sendKeys(ans6);
		 driver.switchTo().defaultContent();
		 this.saveAnsBtn.click();
		 Thread.sleep(1000);
	 }
	 
	 public void logout() throws InterruptedException {
			Thread.sleep(1000);
			this.usrDropDown.click();
			Thread.sleep(2000);
			this.logout.click();
	 }

}
