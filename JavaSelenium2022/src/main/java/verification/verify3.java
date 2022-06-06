package verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
import launching.BaseTest;

public class verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception
	{
		init();
		test = rep.createTest("Vetify3");
		test.log(Status.INFO,"Init the properties file");
		
		luncher("chromebrowser");
		test.log(Status.INFO,"opening the browser :-" + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS,"navigate to url :-\" +childprop.getProperty(\"amazoneurl\")");

		String exceptedLink = "Customer Service";
		
		if(!isLinkEqual(exceptedLink))
			//System.out.println("both links are equal...");
			reportFailure("Both links are not equal....");
		else
			//System.out.println("both links are not equal...");
		reportSuccess("Both links are equal...");
		
		rep.flush();
}

	

	

	

}
