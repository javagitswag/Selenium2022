package launching;

import org.openqa.selenium.By;

public class Instagram extends BaseTest
{

	public static void main(String[] args) throws Exception
	{
		init();
		luncher("chromebrowser");
		navigateUrl("instagram");
		
		driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]/input[1]")).sendKeys("swagatikapradhan798@gmail.com");
		
	}

}
