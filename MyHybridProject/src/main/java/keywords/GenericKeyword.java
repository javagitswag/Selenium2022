package keywords;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeyword 
{
	//property refrence
	public WebDriver driver;
	public String projectpath=System.getProperty("user.dir");
	public FileInputStream fis;
	public Properties mainProp;  //env
	public Properties childProp; //prod
	public Properties orProp;    //or
	
public void openBrowser(String browserName)
{
	System.out.println("Opening browser :" +childProp.getProperty(browserName));
	if(childProp.getProperty(browserName).equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(childProp.getProperty(browserName).equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();	
	}
}
public void navigate(String url)
{
	System.out.println("navigate url :"+ childProp.getProperty(url));
	driver.get(childProp.getProperty(url));
}
  public  WebElement getElement(String locatorKey) 
  {
	WebElement element  = null;
	//check for presence of Element
	if(!isElementPresent(locatorKey))
		//report the failure
		System.out.println("Element is not present :" +locatorKey);
	
	element = driver.findElement(getLocator(locatorKey));
		return element;		
  }
public  boolean isElementPresent(String locatorKey) 
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	try {
		wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));
	} catch (Exception e) {
		return false;
	}
	return true;
}

public  By getLocator(String locatorKey)
{
	By by=null;
	
	if(locatorKey.endsWith("_id")) {
		by = By.id(mainProp.getProperty(locatorKey));
	}else if(locatorKey.endsWith("_name")) {
		by = By.name(mainProp.getProperty(locatorKey));
	}else if(locatorKey.endsWith("_classname")) {
		by = By.className(mainProp.getProperty(locatorKey));
	}else if(locatorKey.endsWith("_linktext")) {
		by = By.linkText(mainProp.getProperty(locatorKey));
	}else if(locatorKey.endsWith("_partiallinktext")) {
		by = By.partialLinkText(mainProp.getProperty(locatorKey));
	}else if(locatorKey.endsWith("_xpath")) {
		by = By.xpath(mainProp.getProperty(locatorKey));
	}else if(locatorKey.endsWith("_css")) {
		by = By.cssSelector(mainProp.getProperty(locatorKey));
	}	
	return by;	
}

public void click(String locaterKey)
{
	getElement(locaterKey).click();
}
public void type(String locaterKey,String text)
{
	getElement(locaterKey).sendKeys(text);
}
public void select(String locaterKey,String option)
{
	getElement(locaterKey).sendKeys(option);
}
public String getText()
{
	return null;
	
}
public void closeBrowser()
{
	
}
}
