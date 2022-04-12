package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement drag = driver.findElement(By.className("ui-slider-handle ui-corner-all ui-state-default"));		
		WebElement handle = driver.findElement(By.className("ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content"));
		
		Actions a=new Actions(driver);
		a.clickAndHold(drag).moveToElement(handle).release(drag).build().perform();
		

	}

}
