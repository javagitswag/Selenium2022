package testcasses;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManager {
  @Test
  public void applyDiscount()
  {
	  System.out.println(" applyDiscount ");
  }
  @Parameters({"action"})  
  @Test
  public void makePayment(String  paymentType , ITestContext context)//ITestContext   -we can share one class test method value to another class
  {
	  //System.out.println(" makePayment ");
	  if(paymentType.equals("electronic media"))
		  System.out.println("making payment through electronic media");
	  else
		  System.out.println("making payment through pay@hotel");
  
    //Booking ID
	  String bookingID = "SSS12579";//-->ITS SHAE TO THE CUSTOMERCOMMUNICATION
	  System.out.println("Booking ID : " + bookingID);
	  context.setAttribute("bID",bookingID);
  }
  
}
