package iciciloans.homeloans;

 class Parent 
{
 public void workhard()
 {
	 System.out.println("parent : weakup early");
}
 public void care()
 {
	 System.out.println("Parent : atmost care");
 }
}
public class Child extends Parent
{
	 public void workhard()
	 {
		System.out.println("child  : weakup anytime");
	}
	public void love() {
		System.out.println("Child : i am in love...");
	}
	
public static void main(String[] args)
{
	Child obj =new Child();
	obj.workhard();
	obj.care();
	obj.love();
	}
}