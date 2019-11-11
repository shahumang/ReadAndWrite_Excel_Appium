package demo;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Sanity_Taskflow {	

	AndroidDriver<WebElement> driver;	
	
	//	SetUp Connection 
	@Test(priority = 1, enabled=true)
	public void setUp() throws Exception
	{	
		final DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "ce0317139b2bec340c");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.sag.rcx.taskFlow12x");
		capabilities.setCapability("appActivity", "md5ea47cf0b2a5bd2b7d928196b74472daf.SplashActivity");	 
		capabilities.setCapability(CapabilityType.VERSION, "7.1.1");
		 
		System.out.println("Application Launching success!!!");		    
			   
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:1717/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);	
	}	

	//	Application configuration and Test Scenario ID: TS_02
	
	@Test(priority = 2, enabled=true)
	public void doConfiguration() throws Exception
	{
		Thread.sleep(3000);
		Operation.configuration(driver); 
		Thread.sleep(3000);
	}

	/*@Test(priority = 3, enabled=true)
	public void doLogin() throws Exception
	{		
		Thread.sleep(3000);
		Operation.login(driver); 
		Thread.sleep(8000);
	}
	@Test(priority = 4, enabled=true)
	public void doWalkthrough() throws Exception
	{
		Thread.sleep(3000);
		Operation.walkthrough(driver); 
	}*/
	/*@Test(priority = 5, enabled=true)
	public void TaskInfo() throws Exception
	{	
		Thread.sleep(3000);
		Operation.filter(driver);
		Thread.sleep(3000);
		Operation.toDo_task(driver);
		Thread.sleep(3000);
		Operation.taskDetails(driver);
		Thread.sleep(3000);
		Operation.complete_task(driver);
		Thread.sleep(3000);
	}*/
	/*@Test(priority = 6, enabled=true)
	public void enableBook() throws Exception
	{
		Thread.sleep(5000);
		Operation.sidebarOpen(driver);
		Thread.sleep(5000);
		Operation.settingOpen(driver);
		Thread.sleep(5000);
		Operation.enableBooking(driver);
		Thread.sleep(2000);
		Operation.sidebarOpen(driver);
		Thread.sleep(2000);
		Operation.tapOnBookingMenu(driver);		
		Thread.sleep(5000);
		Operation.bookingList(driver);
		Thread.sleep(5000);
		Operation.bookingDetails(driver);
		Thread.sleep(5000);
	}*/
	
	/*@Test(priority = 6, enabled=true)
	public void addNewTask() throws Exception
	{
		Thread.sleep(3000);
		Operation.filter(driver);
		Thread.sleep(3000);
		Operation.sidebarOpen(driver);
		Thread.sleep(3000);
		Operation.addTask(driver);
		Thread.sleep(3000);
		Operation.firstStep_Worktype_CreateTask(driver);
		Thread.sleep(3000);
		Operation.second_Worktype_CreateTask(driver);
		Thread.sleep(3000);
		Operation.third_employee_CreateTask(driver);
		Thread.sleep(3000);
		Operation.fourth_tasksummary_CreateTask(driver);
		Thread.sleep(3000);
	}*/
	
}
