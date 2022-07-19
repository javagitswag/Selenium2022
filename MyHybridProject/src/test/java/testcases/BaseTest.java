package testcases;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import keywords.ApplicationKeywords;

public class BaseTest 
{
	public  ApplicationKeywords app;
   
	@BeforeTest  //its executing once 
    public void beforeTest(ITestContext context) throws Exception //one method reference variable i can pass in other method -ITestcontext
    {
      app=new ApplicationKeywords();
     
      context.setAttribute("app",app);
      System.out.println("beforeTest");
    }
	
    @BeforeMethod //its executing every test
    public void beforemethod(ITestContext context)
    {
        System.out.println("beforeMethod");	
        app=(ApplicationKeywords)context.getAttribute("app");
    }
}