package launching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_05 extends BaseTest
{
public static void main(String[] args) throws Exception 
{
	init();
	luncher("chromebrowser");
	navigateUrl("amazonurl");
	
	selectOption("amazondropbox_id","books");
	//typeText("amazonsearchtextbox_name","harry potter");//after  i want to use hear id name so 
	typeText("amazonsearchtextbox_id","harry potter");
	clickElement("amazonsearchbutton_xpath");
	
	//WebElement loc=driver.findElement(By.id("twotabsearchtextbox")); //before run comit the proxy
	//loc.sendKeys("books");
	
	//driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
	//driver.findElement(By.name("field-keywords")).sendKeys("harry potter");
	//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click(); //chropath -> xpath
	}


}




