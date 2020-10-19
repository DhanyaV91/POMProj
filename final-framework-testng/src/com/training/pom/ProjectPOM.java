package com.training.pom;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProjectPOM {
	
	private WebDriver driver;
	
	@FindBy(xpath="//*[@title='My courses']")
	private WebElement myCourses; 
	
	@FindBy(linkText="APITesting")
	private WebElement SECourse;
	
	@FindBy(xpath="//*[@title='Projects']")
	private WebElement Project; 
	
	@FindBy(xpath="//*[@title='Create a new project']")
	private WebElement createProject;
	
	@FindBy(id="add_blog_blog_name")
	private WebElement projectTitle;
	
	@FindBy(id="add_blog_blog_subtitle")
	private WebElement projSubTitle;
	
	@FindBy(id="add_blog_submit")
	private WebElement blogSubmitBtn;
	
	@FindBy(linkText="e learning")
	private WebElement projLink;
	
	@FindBy(xpath="//*[@id='toolbar']/div/div/a[2]/img")
	private WebElement newTask;
	
	@FindBy(id="add_post_title")
	private WebElement taskTitle;
	
	@FindBy(id="add_post_save")
	private WebElement postSaveBtn;
	
	@FindBy(xpath="//*[@id='toolbar']/div/div/a[3]/img")
	private WebElement roleMngtIcon;
	
	@FindBy(linkText="Add a new role")
	private WebElement addRole;
	
	@FindBy(name="task_name")
	private WebElement roleTitle;
	
	@FindBy(name="Submit")
	private WebElement saveBtn;
	
	@FindBy(linkText="Assign roles")
	private WebElement assignRole;
	
	@FindBy(className="filter-option")
	private WebElement usrDropDown; 
	
	@FindBy(xpath="//*[@id='assign_task']/fieldset/div[1]/div[1]/div/div/div[2]/ul/li/a")
	private WebElement userSelc;
	
	@FindBy(id="assign_task_submit")
	private WebElement validateBtn;
	
	@FindBy(xpath="//*[@title='Users management']")
	private WebElement usrMngtIcon;
	
	@FindBy(xpath="//*[@name='user[]' and @value='445']")
	private WebElement usrChkBox;
	
	@FindBy(xpath="//*[@title='Unregister']")
	private WebElement unrgstrOpt;
	
	@FindBy(xpath="//*[@id='main_content']/div/div/div/form[2]/div[2]/div/div/div/ul/li/a")
	private WebElement unrgstrSelc;	
	
	@FindBy(xpath="//*[@id='main_content']/div/div/div/form[2]/div[2]/button")
	private WebElement unrgstrBtn;
	
	@FindBy(className="dropdown-toggle")
	private WebElement usrDropDown1;
	
	@FindBy(xpath="//*[@title='Logout']")
	private WebElement logout;
	
	
	// the driver information will be given by selenium test case 
	public ProjectPOM(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	public void clickMyCoursesPage() throws InterruptedException {
		Thread.sleep(2000);
		this.myCourses.click();
	}
	
	public void clickOnSECourse() throws InterruptedException {
		Thread.sleep(3000);
		this.SECourse.click();
	}
	
	public void clickOnProjectIcon() throws InterruptedException {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		this.Project.click();
	}
	
	public void createProject(String title, String subtitle) throws InterruptedException {
		this.createProject.click();
		Thread.sleep(1000);
		this.projectTitle.clear();
		this.projectTitle.sendKeys(title);
		Thread.sleep(1000);
		this.projSubTitle.clear();
		this.projSubTitle.sendKeys(subtitle);
		Thread.sleep(1000);
		this.blogSubmitBtn.click();
	}
	
	public void createTask(String title) throws InterruptedException {
		Thread.sleep(1000);
		this.projLink.click();
		Thread.sleep(1000);
		this.newTask.click();
		Thread.sleep(1000);
		this.taskTitle.sendKeys(title);
		Thread.sleep(1000);
		this.postSaveBtn.click();
	}
	
	public void addRole(String title) throws InterruptedException {
		Thread.sleep(1000);
		this.roleMngtIcon.click();
		Thread.sleep(1000);
		this.addRole.click();
		Thread.sleep(1000);
		this.roleTitle.sendKeys(title);
		this.saveBtn.click();
		Thread.sleep(1000);
	}
	
	public void assignRole(String name) throws InterruptedException {
		this.assignRole.click();
		Thread.sleep(1000);
		this.usrDropDown.click();
		this.userSelc.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		this.validateBtn.click();
		Thread.sleep(1000);
		this.usrMngtIcon.click();
		Thread.sleep(1000);
		this.usrChkBox.click();
		Thread.sleep(1000);
		this.unrgstrOpt.click();
		this.unrgstrSelc.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		this.unrgstrBtn.click();
	}
	
	public void logoutTeacher() throws InterruptedException {
		Thread.sleep(1000);
		this.usrDropDown1.click();
		Thread.sleep(2000);
		this.logout.click();
	}
}
