package iciciloans.exceptions;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) { 
		int nr,dr,result;                       //i will read this value in scanner class
		//ArithmeticException	a=new ArithmeticException("divided by zero");
		Scanner scan=new Scanner(System.in);
		while (true)
		{
			System.out.println("enter the nr valute : ");
			nr=scan.nextInt();
			System.out.println("enter the dr valute : ");
			dr=scan.nextInt();
			try                          //only take statement --select>surround with>try catch
			{
				result = nr / dr;         // hear stop the execution so i will handel it using while loop
				System.out.println(result);
				break;
			}
			catch (Exception e)                        //in every at least 1 catch are imp
			{
				e.printStackTrace();
			} 
			finally
			{
			System.out.println("i am final blook...");	
			}
			
		}

	}

}
