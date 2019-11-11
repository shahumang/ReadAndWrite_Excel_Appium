package demo;

import java.sql.Driver;
import java.time.Duration;

























import io.appium.java_client.TouchAction;
//import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.internal.TouchAction;

public class Operation {
	
	public static void configuration(AndroidDriver<WebElement> driver) throws Exception
	{
		//Get webservice from excel			
		WebElement taskflowService = driver.findElement(By.id("EntryWebShopUrl"));
		Read_Write_Excel.setExcelFile(ExcelPath.filepath+ExcelPath.filename, "Configuration");
		String getService = Read_Write_Excel.getCellData(1, 0, "WebService URL");	
		System.out.println(getService);
		taskflowService.clear();
		//driver.hideKeyboard();
		taskflowService.sendKeys(getService);
		
		//Get password from excel
		WebElement webServicePass = driver.findElement(By.id("EntryWebPassword"));
		Read_Write_Excel.setExcelFile(ExcelPath.filepath+ExcelPath.filename, "Configuration");
		String getPass = Read_Write_Excel.getCellData(1, 1, "Password");	
		System.out.println(getPass);
		//webServicePass.clear();
		//driver.hideKeyboard();
		webServicePass.sendKeys(getPass);	
		
		//Get webshopId from excel
		WebElement webshopId = driver.findElement(By.id("EntryWebShopId"));
		Read_Write_Excel.setExcelFile(ExcelPath.filepath+ExcelPath.filename, "Configuration");
		String getWebshop = Read_Write_Excel.getCellData(1, 2, "WebshopID");	
		webshopId.clear();
		//driver.hideKeyboard();
        webshopId.sendKeys(getWebshop);       
        driver.hideKeyboard();
        
        //Tap on submit button
        WebElement configButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='buttonConnect']"));
        configButton.click();		
        Thread.sleep(3000);
	}
	
	public static void login(AndroidDriver<WebElement> driver) throws Exception
	{
		//Get username from excel
		WebElement username = driver.findElement(By.id("entryUser"));
		//   //android.widget.EditText[@content-desc="entryUser"]
		Read_Write_Excel.setExcelFile(ExcelPath.filepath+ExcelPath.filename, "Login");
		String getUsername = Read_Write_Excel.getCellData(1, 0, "Username");	
		System.out.println(getUsername);
		username.clear();
		//driver.hideKeyboard();
		username.sendKeys(getUsername);
		
		//Get password from excel
		WebElement password = driver.findElement(By.id("entryPassword"));
		//	//android.widget.EditText[@content-desc="entryPassword"]
		Read_Write_Excel.setExcelFile(ExcelPath.filepath+ExcelPath.filename, "Login");
		String getPassword = Read_Write_Excel.getCellData(1, 1, "Password");	
		System.out.println(getPassword);
		//webServicePass.clear();
		//driver.hideKeyboard();
		password.sendKeys(getPassword);	
		
		//Tap on login button
        WebElement loginBtn = driver.findElement(By.id("buttonLogin"));
        //	//android.widget.Button[@content-desc="buttonLogin"]
        loginBtn.click();		
        Thread.sleep(1000);
	}
	
	public static void walkthrough(AndroidDriver<WebElement> driver) throws Exception
	{
		
 		WebElement skip = driver.findElement(By.id("BtnSkip"));
		skip.click();
		Thread.sleep(3000);
		
		/*try{
			TouchAction act = new TouchAction(driver);
			act.longPress(790, 180, Duration.ofSeconds(3)).moveTo(100, 180).release().perform();
			Thread.sleep(5000);
			System.out.println("test");
		}
		catch(Exception e)
		{
			System.out.println("Swipe not:found");
			
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
	    //int anchor = (int) (size.height * 0.9);
	    int startPoint = (int) (size.width * 0.60);
	    int endPoint = (int) (size.width * 0.40);
	    int starty = (int) size.height/2;
	   
	    new TouchAction(driver).press(startPoint, endPoint).waitAction(Duration.ofMillis(1000)).moveTo(startPoint, endPoint).release().perform();*/
		
		//BtnSkip
		//	//android.widget.Button[@content-desc="BtnSkip"]
	}
	public static void filter(AndroidDriver<WebElement> driver)
	{
		try{ 
				Thread.sleep(5000);
				WebElement filter = driver.findElement(By.id("Filter"));
				filter.click();				
				System.out.println("Tap on filter icon");
				Thread.sleep(8000);
				
			    WebElement uncheckMyTask = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView"));
			    uncheckMyTask.click();
			    System.out.println("Remove my task filter");
			    Thread.sleep(5000);
			    
			    WebElement saveFilter = driver.findElement(By.id("Save"));
			    saveFilter.click();
			    System.out.println("Filter save");
			    Thread.sleep(5000);
		}
		catch(Exception e){
				WebElement filter = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Filter']"));
				filter.click();
				System.out.println("No filter path found");
		}
	}
	public static void sidebarOpen(AndroidDriver<WebElement> driver) throws Exception
	{
		try
		{
			
			WebElement sidebar1 = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='OK']"));
			sidebar1.click();
			System.out.println("xpath of sidebar not found");	
		}
		catch(Exception e)
		{
			WebElement sidebar = driver.findElement(By.id("OK"));
			sidebar.click();
			System.out.println("Id of sidebar not found");
			driver.findElement(By.className("android.widget.ImageButton")).click();
		}
	}
	public static void settingOpen(AndroidDriver<WebElement> driver) throws Exception
	{
	    try{
	    	Thread.sleep(5000);
			WebElement sidebar = driver.findElement(By.xpath("//android.widget.ListView[@content-desc='SideMenuList']/android.widget.LinearLayout[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"));
			sidebar.click();
			Thread.sleep(3000);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("setting xpath not found");
	    	driver.findElement(By.name("Settings")).click();
	    	Thread.sleep(3000);
	    }
	}
	public static void enableBooking(AndroidDriver<WebElement> driver) throws Exception
	{ 
		try{
			Thread.sleep(5000);
			WebElement booking = driver.findElement(By.id("imageChkChangeHome"));
			booking.click();
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
			Thread.sleep(1000);
			driver.pressKeyCode(AndroidKeyCode.HOME);
		}
		catch(Exception e)
		{
			System.out.println("Booking id is not found");
			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='imageChkChangeHome']")).click();
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_MENU);
			driver.pressKeyCode(AndroidKeyCode.HOME);

		}		
	}
	public static void bookingList(AndroidDriver<WebElement> driver) throws Exception
	{
		try{
		WebElement tap_Booking_List = driver.findElement(By.xpath("//android.widget.ListView[@content-desc='listBooking']/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup"));
		tap_Booking_List.click();
		Thread.sleep(3000);		
		}
		catch(Exception e)
		{
			System.out.println("booking list xpath not found");
		}
	}
	
	public static void bookingDetails(AndroidDriver<WebElement> driver) throws Exception
	{
		//Add booking comment
		addComment(driver);
		Thread.sleep(3000);
		WebElement bookingName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView"));
		String Booking_Name = bookingName.getText();
		System.out.println(Booking_Name);
		Thread.sleep(3000);
		
		WebElement bookingDateTime = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView"));
		String Booking_Date_Time = bookingDateTime.getText();
		System.out.println(Booking_Date_Time);
		Thread.sleep(3000);
		
		WebElement bookingPlace = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[5]/android.widget.TextView"));
		String Booking_Place = bookingPlace.getText();
		System.out.println(Booking_Place);
		Thread.sleep(3000);
		
		WebElement bookingInfra = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[7]/android.widget.TextView"));
		String Booking_Infra = bookingInfra.getText();
		System.out.println(Booking_Infra);
		Thread.sleep(3000);
		
		WebElement customerDetails = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView"));
		/*//TouchAction ts = new TouchAction(driver);
		ts.press(207, 582).moveTo(8, -360).release().perform();*/
		String customer_details = customerDetails.getText();
		System.out.println(customer_details);
		Thread.sleep(3000);		
	}
	public static void tapOnBookingMenu(AndroidDriver<WebElement> driver) throws Exception
	{
		driver.findElement(By.xpath("//android.widget.ListView[@content-desc='SideMenuList']/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
		Thread.sleep(6000);
	}
	public static void openTask(AndroidDriver<WebElement> driver) throws Exception
	{ 
		try{
			WebElement sidebar = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='defaultHome']/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView"));
			sidebar.click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("task link xpath not found");
	    	driver.findElement(By.name("Tasks")).click();
	    	Thread.sleep(3000);
		}		
	}	
	
	public static void taskList(AndroidDriver<WebElement> driver) throws Exception
	{		
		String expectedResult ="No tasks";
		String expectedResult1 = "Something went wrong. Try again later.";
		try
		{
			Thread.sleep(3000);
			String errorMSG = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='stackMain']/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")).getText();
			System.out.println(errorMSG);
			String text = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='stackMain']/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView")).getText();
			System.out.println(text);
			
			if(errorMSG.contains(expectedResult1))
			{			
				System.out.println("Tasks Not found");
				WebElement refresh = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='stackMain']/android.view.ViewGroup[3]/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.widget.TextView"));
				refresh.click();			
				System.out.println("Refresh 1");
				Thread.sleep(3000);
			}
			else if (text.contains(expectedResult))
			{
				System.out.println("Tasks Not found");
				WebElement refresh1 = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='stackMain']/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.widget.TextView"));
			    refresh1.click();
			    System.out.println("Refresh");
			    Thread.sleep(3000);
			}
			else
			{
				System.out.println("Tasks found");
			}
		}		
		catch(Exception e)
		{
				System.out.println("task link xpath not found");	
			try
			{
				toDo_task(driver);						
			}		
			catch(Exception e1)
			{
				complete_task(driver);
			}
		}
	}
	
	public static void toDo_task(AndroidDriver<WebElement> driver)throws Exception
	{
		Thread.sleep(5000);
		String todo= driver.findElement(By.xpath("//android.widget.ListView[@content-desc='listTask']/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).getText();
		String exexctTodo = "Todo";
		//android.widget.ListView[@content-desc="listTask"]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView
		System.out.println(todo);
    //android.widget.ListView[@content-desc='listTask']/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView'
		if (exexctTodo.contains(todo))
		{
			driver.findElement(By.xpath("//android.widget.ListView[@content-desc='listTask']/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.ImageView")).click();
			System.out.println("To do found");
			Thread.sleep(3000);			 		
		}
		else
		{
			System.out.println("To do not found");
		}
	}
	
	public static void complete_task(AndroidDriver<WebElement> driver)throws Exception
	{
		String exexctCompleted = "Completed";
		String completed= driver.findElement(By.xpath("//android.widget.ListView[@content-desc='listTask']/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).getText();
 		if (exexctCompleted.contains(completed))
 		{
 			driver.findElement(By.xpath("//android.widget.ListView[@content-desc='listTask']/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.ImageView")).click();
 			System.out.println("Completed found");
 			Thread.sleep(3000);			 		
 		}
 		else
 		{
 			System.out.println("Completed task not found");
 		}
	}
	public static void taskDetails(AndroidDriver<WebElement> driver) throws Exception
	{
		//Tap on first task from task list
		driver.findElement(By.xpath("//android.widget.ListView[@content-desc='listTask']/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup")).click();
		System.out.println("Tap on task");
		Thread.sleep(5000);
		
		//Tap on mark done
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[6]/android.view.ViewGroup[1]/android.widget.Button")).click();
		System.out.println("Tap on mark done");
		Thread.sleep(3000);
		
		addComment(driver);
		/*//Update Employee
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();
	    System.out.println("edit icon on emp");
	    Thread.sleep(4000);
	    
	    WebElement saveFilter = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Save']"));
	    saveFilter.click();	  
	    System.out.println("Filter save");
	    Thread.sleep(4000);		    
	    
	    try{
	    	driver.findElement(By.id("android:id/button1")).click();
	    	System.out.println("Tap on yes for assigned task ");
	    	Thread.sleep(4000);
	    }
	    catch(Exception e)
	    {
	    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
	    	System.out.println("Tap on yes for assigned task with xpath");
	    	Thread.sleep(3000);	
	    }*/
	    
	    //Tap on back button redirect to the Task list screen
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageButton")).click();
	    System.out.println("Tap on back button");
	    Thread.sleep(5000);
	}
	public static void addComment(AndroidDriver<WebElement> driver) throws Exception
	{
		WebElement comment = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"));
		comment.click();
		comment.sendKeys("Test Test");
		System.out.println("Enter comment");
		Thread.sleep(3000);
		
		//Tap on done button on submit
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button")).click();
		System.out.println("Comment submitted");
		Thread.sleep(5000);
	}
	
	public static void addTask(AndroidDriver<WebElement> driver) throws Exception
	{
		WebElement tapOnNewTask_Sidebar = driver.findElement(By.xpath("//android.widget.ListView[@content-desc='SideMenuList']/android.widget.LinearLayout[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"));
		tapOnNewTask_Sidebar.click();
		Thread.sleep(3000);
	}
	public static void firstStep_Worktype_CreateTask(AndroidDriver<WebElement> driver) throws Exception
	{
		Thread.sleep(6000);
		WebElement workType = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView"));
	    workType.click();
	    System.out.println("Tap on worktype");
	    Thread.sleep(6000);	    
				
		WebElement submit_worktype = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView"));
	    submit_worktype.click();
	    System.out.println("Submit worktype");
		Thread.sleep(6000);
		
		WebElement Next = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView"));                                             
		Next.click();
		Thread.sleep(3000);		
/*		try{
			driver.findElement(By.id("android:id/button1")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
			
			Thread.sleep(2000);
		}
*/	}
	public static void second_Worktype_CreateTask(AndroidDriver<WebElement> driver) throws Exception
	{
		WebElement Next = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView"));
		Next.click();
		Thread.sleep(3000);
	}
	public static void third_employee_CreateTask(AndroidDriver<WebElement> driver) throws Exception
	{
		WebElement emp = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup"));
		emp.click();
		Thread.sleep(3000);
		
		WebElement next= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView"));
		next.click();
		Thread.sleep(3000);
	}
	public static void fourth_tasksummary_CreateTask(AndroidDriver<WebElement> driver) throws Exception
	{
		WebElement next= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView"));
		next.click();
		Thread.sleep(3000);
		
		WebElement confirm= driver.findElement(By.id("android:id/button1"));
		confirm.click();
		Thread.sleep(3000);
		
		WebElement confirm1 = driver.findElement(By.id("android:id/button2"));
		confirm1.click();		
		Thread.sleep(3000);		
	}
	
}	
		
	
	


