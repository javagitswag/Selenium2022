package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//fb email place write something
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='swagatika'");
	    
		//print title
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
       //window page scroll
		js.executeScript("window.scrollBy(0,100)");
		
		//go to page last
		js.executeScript("window.scroll(0,document.body.scrollHeight)");
		
		//scroll for view login
		js.executeScript("document.getElementById('loginbutton').scrollIntoView()");
        
		//window page back
		js.executeScript("window.hostory.back()");
		Thread.sleep(4000);
		
		//page forword
        js.executeScript("window.hostory.forword()");
		Thread.sleep(4000);
		
		//refresh
		js.executeScript("window.history.go(0)");
		
	}

}
