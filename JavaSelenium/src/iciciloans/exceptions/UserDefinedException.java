package iciciloans.exceptions;

import java.util.Scanner;

public class UserDefinedException extends Exception
{

	public UserDefinedException(String string) 
	{
		super(string);
	}	

	public static void main(String[] args)
	{
		String str;
    Scanner scan=new Scanner (System.in);
    
   while (true)
   {
	   System.out.println("enter the 10 digit String value :");
	   str =scan.nextLine();
	   
	try {
		if (str.length() != 10) {
			throw new UserDefinedException("should be a 10 character String");
		}
		else
		{
			System.out.println(str);
			break;
		}
	} catch (UserDefinedException e) {

		e.printStackTrace();
	} 
}
   
 
   
   
   
   
   
	}
}