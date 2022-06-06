package launching;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

public class Tc_6 extends BaseTest
{
	
public static void main(String[] args) throws Exception 
{
	init();
	test = rep.createTest("Tc_6");
	test.log(Status.INFO,"Init the properties file");
	
	luncher("chromebrowser");
	test.log(Status.INFO,"opening the browser :-" + p.getProperty("chromebrowser"));
	
	navigateUrl("amazonurl");
	test.log(Status.PASS,"navigate to url :-\" +childprop.getProperty(\"amazoneurl\")");
	
	selectOption("amazondropbox_id","books");
	test.log(Status.FAIL,"selecting the option  books by using locater:-\"+orgprop.getProperty(\"amazondropbox_id\")");
	
	typeText("amazonsearchtextbox_id","harry potter");
	test.log(Status.PASS,"enter the harry potter by using locater:-\"+orgprop.getProperty(\"amazonsearchtextbox_id\")");
	
	clickElement("amazonsearchbutton_xpath");
	test.log(Status.INFO,"click by element by using locater:-\"+orgprop.getProperty(\"amazonsearchbutton_xpath\")");
	
	rep.flush();
	
	}


}




