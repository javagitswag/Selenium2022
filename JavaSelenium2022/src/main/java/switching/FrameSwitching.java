package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameSwitching {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));--.1st way to swich(with locaters)
		driver.switchTo().frame(0);       //2nd way to switch(with index)
		driver.findElement(By.linkText("org.openqa.selenium")).click();//-->1st take frame otherwise its fail &showing like no such element because this is having under a frame
		driver.switchTo().defaultContent();    //for comes out the existing frame
		
		Thread.sleep(4000);
		
	    driver.switchTo().frame(driver.findElement(By.name("packageFrame")));//not clicking in this case 1st comeout in1st frame
	    driver.findElement(By.linkText("WebDriver")).click();
	    driver.switchTo().defaultContent();
	    
	    Thread.sleep(4000);
	    
	    driver.switchTo().frame(driver.findElement(By.name("classFrame")));
	    driver.findElement(By.linkText("SearchContext")).click();
	}

}



