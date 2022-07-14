package alertSwitches;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AlertHandling 
{
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod()
  {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.navigate().to("https://demo.guru99.com/selenium/delete_customer.php");
  }
@Test
  public void f() throws InterruptedException
  {
	  driver.findElement(By.name("cusid")).sendKeys("123456");
	  driver.findElement(By.name("submit")).submit(); 
	  Thread.sleep(3000);
	  
	  Alert al=driver.switchTo().alert();//for switch to javascript pop-up
	  System.out.println(al.getText());//for getting message
	  String expval = ("Do you really want to delete this Customer?");
      Assert.assertEquals(al.getText(), expval);//for comparing actual & excepted
	  al.accept();
	  
  }
  @AfterMethod
  public void afterMethod() 
  {
  }

}
