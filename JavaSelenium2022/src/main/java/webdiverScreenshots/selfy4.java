package webdiverScreenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selfy4 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		
		List<WebElement> links3 = driver.findElements(By.xpath("//div[@id='SIvCob']/a")); 
		for(int j=0;j<links3.size();j++)
		{
			Date dt=new Date();
			String d=dt.toString().replace(':', '_').replace(' ','_');
			
			 String linkName = links3.get(j).getAttribute("innerHTML");
			links3.get(j).click();
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(srcFile,new File("C:\\Users\\mama\\Desktop\\screenshot\\"+linkName+"_"+d+".png"));
		
			links3 = driver.findElements(By.xpath("//div[@id='SIvCob']/a")); 
		}
		
	}

}
