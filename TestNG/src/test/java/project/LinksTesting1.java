package project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class LinksTesting1 extends BaseTest
{
	
	@BeforeMethod(groups= {"Regressio","smoke"})
	@Parameters("browser")
	public void setup(String bType) throws Exception
	{
		System.out.println("startProcess");
	    init();
		test = rep.createTest("LinksTesting1");
		test.log(Status.PASS, "Initiating the Property Files...");
				
		luncher("bType");
		test.log(Status.INFO, "Opened the Browser :- " + p.getProperty("chromebrowser"));
						
		navigateUrl("googleurl");
		test.log(Status.PASS, "Navigated to app :-" + childprop.getProperty("googleurl"));
	}
	
	
	@Test(groups= {"Regressio","smoke"})
	public void linktesting1()
	
	 {
		String expval="Google Images";
		
		driver.findElement(By.linkText("Images")).click();	
		Reporter.log("Clicked on Image Link");
		String actval=driver.getTitle();
		
		Assert.assertEquals(actval, expval);
		
	 }
	
	@AfterMethod(groups= {"Regressio","smoke"})
	public void tearDown()
	{
		 System.out.println("endProcess");
		  	rep.flush();
			driver.quit();
	}

}
