package testnglistner;

import org.apache.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.model.Log;

public class Retry implements IRetryAnalyzer 
{
	public static final Logger L=Logger .getLogger(Retry.class.getName());
	private int retryCount=0;
	private int maxRetryCount=3;

	public boolean retry(ITestResult result) 
	{
		if(retryCount<maxRetryCount)
		{
			Log("Retry test "+result.getName()+"with status "+ getResultStatusName(result.getStatus())+"for the"+(retryCount+1)+"times");
			retryCount++;
			return true;
		}
		return false;
	}

	
	public String getResultStatusName(int status) 
	{
		String resultName=null;
		if(status==1)
		    resultName = "SUCCESS";
		if(status==2)
			resultName = "fail";
		if(status==3)
			resultName = "SKIP";
		return resultName;
	}
	
	public void Log(String string) 
	{
	L.info(string);
	Reporter.log(string);
	
	}


}
