package iciciloans.homeloans;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 byte     -   Byte
		 short    -   Short
		 int      -   Integer
		 long     -   Long
		 float    -   Float
		 double   -   Double
		 char     -   Char
		 boolean  -   Boolean
		 */
		int  x=100;
		System.out.println(x);
		
		//Integer y=new Integer(200); 
		Integer y0=200;
		System.out.println(y0);
		
		Integer y1=x; 
		System.out.println(y1);
		
		Integer y2= Integer.valueOf(x) ;
		System.out.println(y2);
		
		ArrayList<Object> obj=new ArrayList<Object>();
		obj.add(10);
		obj.add("sushree");
		obj.add("swagatika");
		obj.add(12.34f);
		System.out.println("-------------------------------------------");
		
		String s1="350";
		String s2="350";
		System.out.println(s1+s2);
		
		int p1=Integer.parseInt(s1);
		int p2=Integer.parseInt(s2);
		
		System.out.println(p1+p2);
		
		//Integer p11= Integer.valueOf(p1) ;
		Integer  p11=p1;
		
		float  q1=Float .parseFloat(s1);
		float  q2=Float .parseFloat(s2);
		System.out.println(q1+q2);
		
		
	}

}
