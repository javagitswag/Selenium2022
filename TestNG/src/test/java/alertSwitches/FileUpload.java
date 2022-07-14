package alertSwitches;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FileUpload
{
	WebDriver driver;
  @Test
  public void f() 
  {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
	  driver.get("https://transfer.pcloud.com/");
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException, Exception 
  {
	  driver.findElement(By.xpath("//span[contains(text(),'Click here to add files')]")).click();
	  Thread.sleep(3000);
	  
	  
	  //Runtime.getRuntime().exec("D:\\uploadupdated.exe");
	 Runtime.getRuntime().exec("C:\\Users\\mama\\Desktop\\fileload.exe");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
