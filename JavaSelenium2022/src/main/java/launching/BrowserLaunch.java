package launching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserLaunch 
{
	public static void main(String[] args)
	{
		
	WebDriver driver;//webdriver is a interface,driver is a reference  its holding implimentation details.its call polymorphisom concept
	
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\mama\\Desktop\\selenium 2022\\ chromedriver.exe");
	 WebDriverManager.chromedriver().setup();
	  driver =new  ChromeDriver();
	
	//System.setProperty("webdriver.gecko.driver","C:/Users/mama/Desktop/selenium 2022/geckodriver.exe");
	WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver(); 
	
	

	//webdriver.ie.driver
	//webdriver.edge.driver
	}

}
