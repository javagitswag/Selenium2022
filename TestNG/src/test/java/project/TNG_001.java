package project;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_001 extends BaseTest
{
  
  @BeforeMethod(groups= {"Regressio","sanity"})
  @Parameters("browser")
  public void startprocess() throws Exception
  {
	  System.out.println("brfore method.........");
	  try 
	  {
		init();
	} 
	  catch (Exception e)
	  {
		e.printStackTrace();
	  }
		test = rep.createTest("Tc_6");
		test.log(Status.INFO,"Init the properties file");
		
		luncher("chromebrowser");
		test.log(Status.INFO,"opening the browser :-" + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS,"navigate to url :-" +childprop.getProperty("amazoneurl"));
		  
  }
  
  @Test(groups= {"Regressio","sanity"})
  public void amazon()
  {
	  System.out.println("f test...........");
	    selectOption("amazondropbox_id","books");
		test.log(Status.FAIL,"selecting the option  books by using locater: -"+orgprop.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtextbox_id","harry potter");
		test.log(Status.PASS,"enter the harry potter by using locater: -"+orgprop.getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.INFO,"click by element by using locater:-"+orgprop.getProperty("amazonsearchbutton_xpath"));
		  
  }

  @AfterMethod(groups= {"Regressio","sanity"})
  public void endprocess()
  {
	  System.out.println("after method.........");
	  rep.flush();
	  driver.quit();
  }

}
