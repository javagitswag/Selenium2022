package launching;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.function.Function;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	
	public static WebDriver driver;
	public static String  projectpath=System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainprop;
	public static Properties childprop;
	public static Properties orgprop;
	public static ExtentReports rep;
	public static ExtentTest test;
	
	
	public static void init() throws Exception
	{                                         
		fis=new FileInputStream(projectpath+"/src/main/resources/data.properties");
		p=new Properties();
		p.load(fis);
		String value=p.getProperty("amazonurl");
		System.out.println(value);
		
		fis=new FileInputStream(projectpath+"/src/main/resources/environment.properties");
		mainprop=new Properties();
		mainprop.load(fis);
		String e =mainprop.getProperty("env");
		System.out.println(e);
	
	   fis=new FileInputStream(projectpath+"/src/main/resources/"+e+".properties");	
	   childprop=new Properties();
	   childprop.load(fis);
	  String v = childprop.getProperty("amazonurl");
	  System.out.println(v);
	                                         
	  fis=new FileInputStream(projectpath+"/src/main/resources/org.properties");
	  orgprop=new Properties();
	  orgprop.load(fis);
	  
	  fis=new FileInputStream(projectpath+"src/main/resources/log4jconfig.properties");
	  PropertyConfigurator.configure(fis);
	  
	  rep=ExtentManager.getInstance();
	  
	}
	
	public static void luncher(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			//WebDriverManager.chromedriver().setup();
			ChromeOptions option=new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\mama\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3");//search -chrome://version->copy profile path->paste
			driver=new ChromeDriver(option);
			option.addArguments("--start-maxim"	+ "ize");
			//certificate error handling
			//option.addArguments("--ignore-certificate-errors-spki-list");
			//proxy ip setting
			//option.addArguments("--proxy-server=https://192.168.10.1:9090");
		}
		else if (p.getProperty(browser).equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			
			
			ProfilesIni p=new ProfilesIni();//hear i want my user define  browser
			FirefoxProfile pofile=p.getProfile("jan2022FF");
			
			FirefoxOptions option=new FirefoxOptions();//creating obj
			option.setProfile(pofile);//set profile
			
			//handling browser notification
			pofile.setPreference("dom.webnotifications.enabled",false);
			
			//handing certificate error
			pofile.setAcceptUntrustedCertificates(true);
			pofile.setAssumeUntrustedCertificateIssuer(false);
			
			//how to work with proxy setting
			pofile.setPreference("network.proxy.type",1);
			pofile.setPreference("network.proxy.socks","192.168.10.1");
			pofile.setPreference("network.proxy.socks_port",1744);
			
			
			driver=new FirefoxDriver(option);
		}
	}
	
	  public static void navigateUrl(String url)
	  {
	  driver.get(childprop.getProperty(url));
	  }
		
		  public static void clickElement(String locaterkey)
		  {
		  //driver.findElement(By.xpath(orprop.getProperty(locaterkey))); }
		  getElement(locaterkey).click();
		  }
		  public static void typeText(String locaterkey, String text)
		  {
		  //driver.findElement(By.name(orprop.getProperty(locaterkey))).sendKeys(text);
			  getElement(locaterkey).sendKeys(text);   
		  }
		  
		  public static void selectOption(String locaterkey, String option) {
		  //driver.findElement(By.id(orprop.getProperty(locaterkey))).sendKeys(option);
			  getElement(locaterkey).sendKeys(option);   
		  }
		 
	public static WebElement getElement(String locaterkey)//add return statement
	{
		WebElement element=null;//anything is matching thats returning this element thats why we declare local variable
			
		//check for element presence
		if(!isElementpresent(locaterkey))
			//report a failure
			System.out.println("Element is not present:"+locaterkey);
		element=driver.findElement(getlocater(locaterkey));
		
		/*
		 * if(locaterkey.endsWith("_id")) {
		 * element=driver.findElement(By.id(orprop.getProperty(locaterkey))); } else if
		 * (locaterkey.endsWith("_name")) {
		 * element=driver.findElement(By.name(orprop.getProperty(locaterkey))); } else
		 * if (locaterkey.endsWith("_className")) {
		 * element=driver.findElement(By.className(orprop.getProperty(locaterkey))); }
		 * else if (locaterkey.endsWith("_xpath")) {
		 * element=driver.findElement(By.xpath(orprop.getProperty(locaterkey))); } else
		 * if (locaterkey.endsWith("_linkText")) {
		 * element=driver.findElement(By.linkText(orprop.getProperty(locaterkey))); }
		 * else if (locaterkey.endsWith("_partialLinkText")) {
		 * element=driver.findElement(By.partialLinkText(orprop.getProperty(locaterkey)
		 * )); }
		 */
		
		return element;	
	}

	public static boolean isElementpresent(String locaterkey) {
		System.out.println("check for element present...");
		WebDriverWait wait  =new WebDriverWait (driver,120);
		
		try
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(getlocater(locaterkey)));
			/*
			 * if(locaterkey.endsWith("_id")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(orprop.
			 * getProperty(locaterkey)))); } else if(locaterkey.endsWith("_name")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.name(orprop.
			 * getProperty(locaterkey)))); } else if(locaterkey.endsWith("_classname")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.className(orprop.
			 * getProperty(locaterkey)))); } else if(locaterkey.endsWith("_xpath")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(orprop.
			 * getProperty(locaterkey)))); } else if(locaterkey.endsWith("_sccSelector")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(orprop
			 * .getProperty(locaterkey)))); } else if(locaterkey.endsWith("_linkText")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(orprop.
			 * getProperty(locaterkey)))); } else
			 * if(locaterkey.endsWith("_partialLinkText")) {
			 * wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(
			 * orprop.getProperty(locaterkey)))); }
			 */
		} catch (Exception e) 
		{
			return false;
		}
		
		return true;
	}
	public static  By getlocater(String LocaterKey)
	{
		By by=null;
		if(LocaterKey.endsWith("_id")) {
			by=By.id(orgprop.getProperty(LocaterKey));
		}
		else if(LocaterKey.endsWith("_name")){
			By.name(orgprop.getProperty(LocaterKey));
		}
		else if(LocaterKey.endsWith("_classname")){
			By.className(orgprop.getProperty(LocaterKey));
		}
		else if(LocaterKey.endsWith("_xpath")){
			By.xpath(orgprop.getProperty(LocaterKey));
		}
		else if(LocaterKey.endsWith("_cssSelector")){
			By.cssSelector(orgprop.getProperty(LocaterKey));
		}
		else if(LocaterKey.endsWith("_linktext")){
			By.linkText(orgprop.getProperty(LocaterKey));
		}
		else if(LocaterKey.endsWith("_partiallinktext")){
			By.partialLinkText(orgprop.getProperty(LocaterKey));
		}
		
		return by;
		
	}
	public static boolean isLinkEqual(String exceptedLink) 
	{
		String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		if(actualLink.equals(exceptedLink))
			return true;
		else
		    return false;
	}
	//******************report************
	
	public static void reportSuccess(String passmsg)
	{
		test.log(Status.PASS, passmsg);
	}

	public static void reportFailure(String failmsg) throws Exception
	{
		test.log(Status.FAIL, failmsg);
		takesScreenshot();
	}

	public static void takesScreenshot() throws Exception 
	{
		Date dt=new Date();
		System.out.println(dt);
		String dateFormat=dt.toString().replace(":", "_").replace(" ", "_")+".png";		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File(projectpath+"//failurescreenshots//"+dateFormat));
		
		test.log(Status.INFO, "Screenshot --->" +test.addScreenCaptureFromPath(projectpath+"//failurescreenshots//"+dateFormat));

	}
	
	
	}



