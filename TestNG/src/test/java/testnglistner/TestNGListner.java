package testnglistner;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.model.Report;

import project.BaseTest;

public class TestNGListner extends BaseTest implements ITestListener
{

	public void onTestStart(ITestResult result) 
	{
		//if u want to create log into testNG
		Reporter.log("Test Started Running : "+result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) 
	{  //if success screenshot
		if(result.isSuccess())
		{
		   try
		   {
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//i want to store my screenshot in success folder (new-->folder
	        FileHandler.copy(srcFile,new File(projectpath+"//success//"+filepath+".png"));
		   //in html file i want to inhance same screenshot
		   Reporter.log("<a href='"+projectpath+"//success//"+filepath+".png"+"'> <img src='"+projectpath+"//success//"+filepath+".png"+"' height='100' width='100'/> </a>");
		  Reporter.log("test has success :"+result.getMethod().getMethodName());
		   } 
	        catch (IOException e) 
		    {
			e.printStackTrace();
		    }
		}		
	}

	public void onTestFailure(ITestResult result) 
	{
		if(!result.isSuccess())
		{
		   try
		   {
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//i want to store my screenshot in success folder (new-->folder
	        FileHandler.copy(srcFile,new File(projectpath+"//failure//"+filepath+".png"));
		   Reporter.log("<a href='"+projectpath+"//failure//"+filepath+".png"+"'> <img src='"+projectpath+"//failure//"+filepath+".png"+"' height='100' width='100'/> </a>");
		  Reporter.log("test has fail :"+result.getMethod().getMethodName());
		   } 
	        catch (IOException e) 
		    {
			e.printStackTrace();
		    }
		}		
	}	
	public void onTestSkipped(ITestResult result) 
	{
	Reporter.log("Test is skiped :"+result.getMethod().getMethodName());	
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
		
	}

	public void onStart(ITestContext context)
	{
		
	}

	public void onFinish(ITestContext context) 
	{
		
	}

}
