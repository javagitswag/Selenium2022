package iciciloans.homeloans;

import iciciloans.carloans.A;

import iciciloans.carloans.B;
//public class C extends A //access specifier

public class C extends B //inharitance
{       //public int x =100;
	 	public  void m3() 
	{
		 System.out.println("i am m3 from C");
	}
 public static void main(String[] args)
 {
	 A a =new A();
	 a.m1();
	 
	 B b =new B();
	 b.m2();
	 b.m1();
	 
	 C c=new C ();
	 c.m3 ();//c.m3();
	 c.m2();
	 c.m1();//c.m1();
 }
	

}
