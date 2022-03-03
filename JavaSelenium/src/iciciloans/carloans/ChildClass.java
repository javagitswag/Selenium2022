package iciciloans.carloans;

public class ChildClass extends FirstAbstract {
	public static void main(String[] args) {
	ChildClass obj=new ChildClass();
	obj.m1();
	obj.m2();
	}

	@Override
	public void m1() {
	System.out.println("i am concreate from ChildClass");
		
	}
	@Override
	public void m2() {
	System.out.println("i am overriden from ChildClass");
		
	}

}
