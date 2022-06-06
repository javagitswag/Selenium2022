package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verfy1
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\amazon.in");
		
		//String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		String actualLink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		//String exceptedLink = "Customer Service";
		//String exceptedLink = "customer Service";
		//String exceptedLink = "Customer Serv";
		String exceptedLink = "customer serv";
		
		System.out.println("ActualLink :"+ actualLink);
		System.out.println("ExceptedLink :"+ exceptedLink);
		
		//if(actualLink.equals(exceptedLink))
		//if(actualLink.equalsIgnoreCase(exceptedLink))
		//if(actualLink.contains(exceptedLink))	
		if(actualLink.toLowerCase().contains(exceptedLink.toLowerCase()))	
			
			System.out.println("both links are equal...");
		else
			System.out.println("both links are not equal...");
			
	}

}
