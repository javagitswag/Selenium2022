package pom;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import project.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class POM_001 extends BaseTest
{
  @BeforeMethod
  public void startProcess() throws Exception 
  {
	  init();
	  luncher("chromebrowser");
	  navigateUrl("practiceurl");
	  /*WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
	  */
  }
  @Test(enabled = false)
  public void login() 
  {
	  LoginPage page= new LoginPage(driver);
	  page.customerLogin();
	  Assert.assertEquals(page.verifyError(),"Authentication failed.");	
  }
  @Test
  public void customerRegistation() throws Exception
  {
	  init();
	  CustomerRegistrationPage page=new CustomerRegistrationPage(driver);
	  page.customerRegistation();
  }
   
 
@AfterMethod()
  public void endProcess()
  {
  }

}