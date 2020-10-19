package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseAssessmentPOM {

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
	
	 @FindBy(linkText="Basics of Selenium") 
	 private WebElement BSECourseLink;
	 
	@FindBy(className="dropdown-toggle")
	private WebElement usrDropDown;
	
	@FindBy(xpath="//*[@title='Logout']")
	private WebElement logout;
	
	@FindBy(linkText="Assessments")
	private WebElement assessmtLink;
	
	@FindBy(xpath="//*[@title='Show']")
	private WebElement showAssmts;
		
	@FindBy(linkText="Basics of Selenium Course Test 1")
	private WebElement courseTestLink;
	
	  @FindBy(linkText="Start test")
	  private WebElement startTestBtn;
	  
	  @FindBy(xpath="//*[@name='save_now']")
	  private WebElement saveAnsBtn;
	  
	  @FindBy(id="choice_id_1_0")
	  private WebElement blank1;
	  
	  @FindBy(id="choice_id_2_0")
	  private WebElement blank2;
	  
	  @FindBy(id="choice_id_3_0")
	  private WebElement blank3;
	  
	  @FindBy(id="choice_id_4_0")
	  private WebElement blank4;
	  
	  @FindBy(id="choice_id_5_0")
	  private WebElement blank5;
	
	public CourseAssessmentPOM(WebDriver driver) {
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
	 
	 public void SECourseAssessment(String ans1, String ans2, String ans3, String ans4, String ans5) throws InterruptedException {
		Actions act = new Actions(driver);
		 this.myCoursesTab.click();
		 this.BSECourseLink.click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);		 
		 this.assessmtLink.click();
		 Thread.sleep(1000);
		 this.showAssmts.click();
		 Thread.sleep(2000);
		 this.courseTestLink.click();
		 Thread.sleep(1000);
		 this.startTestBtn.click();
		 this.blank1.sendKeys(ans1);
		 Thread.sleep(1000);
		 this.saveAnsBtn.click();
		 Thread.sleep(1000);
		 this.blank2.sendKeys(ans2);
		 Thread.sleep(1000);
		 this.saveAnsBtn.click();
		 Thread.sleep(1000); 
		 this.blank3.sendKeys(ans3);
		 Thread.sleep(1000);
		 this.saveAnsBtn.click();
		 Thread.sleep(1000);
		 this.blank4.sendKeys(ans4);
		 Thread.sleep(1000);
		 this.saveAnsBtn.click();
		 Thread.sleep(1000);
		 this.blank5.sendKeys(ans5);
		 Thread.sleep(1000);
		 this.saveAnsBtn.click();		 
		 Thread.sleep(2000);		 
	 }
	 
	 public void logout() throws InterruptedException {
			this.usrDropDown.click();
			Thread.sleep(2000);
			this.logout.click();
	 }	 
}
