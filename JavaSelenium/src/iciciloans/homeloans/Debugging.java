package iciciloans.homeloans;

import java.util.Scanner;

public class Debugging
{
public int m1()
{
	
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the array size");
		int asize=scan.nextInt();
		int []a=new int[asize];
		int sum=0;
		
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum=a[i]+sum;
		}
	 System.out.println("sum of array:"+sum);
	return sum;
	}

	
	public static void main(String[] args) 
	{
		Debugging obj=new Debugging();
		int count =obj.m1();
		System.out.println("count of array :"+count);

}
}


