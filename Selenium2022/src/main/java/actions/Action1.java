package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action1 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com");
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"))).perform();//more then one action then .build().perform()
		driver.findElement(By.xpath("//a[contains(text(),'Your Orders']")).click();

	}

}
