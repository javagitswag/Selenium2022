package iciciloans.carloans;

 public class B  extends A //ISA Relationship
 {
public int x=100;
public void m1()   //method
{
	 System.out.println("i am overriden m1 from B");
}
	public void m2() 
	{
		 System.out.println("i am m2 from B");
	}
 public static void main(String[] args)
 {
	 A a =new A(); //HASA relationship
	 a.m1();
	 
	 B b=new B ();
	 b.m2();
	 b.m1();
	 //we can use parent cls reference variable to refer/hold child object
	 A obj=new A();
	 a.m1();
	 //chaild cant 
	 //B obj1=new b();
	 
 }
	

	
}
