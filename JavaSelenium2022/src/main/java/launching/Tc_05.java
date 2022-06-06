package launching;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_05 extends BaseTest
{
	private static final Logger Log=Logger.getLogger(Tc_05.class);
	
public static void main(String[] args) throws Exception 
{
	init();
	Log.info("Init the properties file");
	
	luncher("chromebrowser");
	Log.info("opening the browser :-" + p.getProperty("chromebrowser"));
	
	navigateUrl("amazonurl");
	Log.info("navigate to url :-" +childprop.getProperty("amazoneurl") );
	
	selectOption("amazondropbox_id","books");
	Log.info("selecting the option  books by using locater:-"+orgprop.getProperty("amazondropbox_id"));
	//typeText("amazonsearchtextbox_name","harry potter");//after  i want to use hear id name so 
	
	typeText("amazonsearchtextbox_id","harry potter");
	Log.info("enter the harry potter by using locater:-"+orgprop.getProperty("amazonsearchtextbox_id"));

	clickElement("amazonsearchbutton_xpath");
	Log.info("click by element by using locater:-"+orgprop.getProperty("amazonsearchbutton_xpath"));
	//WebElement loc=driver.findElement(By.id("twotabsearchtextbox")); //before run comit the proxy
	//loc.sendKeys("books");
	
	//driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
	//driver.findElement(By.name("field-keywords")).sendKeys("harry potter");
	//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click(); //chropath -> xpath
	}


}




