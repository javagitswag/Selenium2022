package iciciloans.homeloans;

public class VariableTypes {
	// primitive variable
	int x=100;// instance/instance-global/non static
	static String name ="vmware"; //static/static-global
	
	public  void m1() 
	{
		int y=200;//local variable
		//System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(VariableTypes.name);
	}
	public static void m2() {
		VariableTypes obj=new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.name);
	}
	
	public static void main(String[] args)
	{
		 VariableTypes obj=new VariableTypes();//non  primitive/reference variable
		 System.out.println(obj.x);
		 System.out.println(VariableTypes.name);
		

	}

}
