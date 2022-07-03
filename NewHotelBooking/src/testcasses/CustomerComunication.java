package testcasses;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CustomerComunication
{
  @Test
  public void checkEmailVarification(ITestContext context)
  {
	  String bookID = (String)context.getAttribute("bID");
	  System.out.println(" checkEmailVarification ");
  }
  
  @Test
  public void checkMobileVarification(ITestContext context)
  {
	  String bookID = (String)context.getAttribute("bID");
	  System.out.println(" checkMobileVarification ");
  }
}
