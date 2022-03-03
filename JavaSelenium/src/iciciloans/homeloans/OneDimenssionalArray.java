
package iciciloans.homeloans;

import java.util.Scanner;

public class OneDimenssionalArray {

	public static void main(String[] args) 
	{
	/*	int []a= {10,20,30,40};
		for(int i = 0;i<a.length;i++)
		{                                       //  1st way to declare array
			//System.out.println(a[i]);
			System.out.println("a["+i+"]="+a[i]);
			
		}*/
		Scanner scan =new Scanner (System.in);
		System.out.println("enter the array size");
		int asize = scan.nextInt();
		
		
		int[]a=new int[asize];
		int sum=0;
		/*a[0]=10;
		a[1]=20;                      //2nd way
		a[2]=30;
		a[3]=40;
		//a[4]=50;  ---- its comming outofbound exception bcz array size is 4
		
		*/
		System.out.println("enter the array element:");
		for(int i = 0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum=sum+a[i];		
			}
		System.out.println("sum of array is :"+sum);
	}  

}
