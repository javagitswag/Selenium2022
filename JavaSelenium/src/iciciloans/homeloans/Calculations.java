package iciciloans.homeloans;

public class Calculations {
	int a,b,result;
	
	public Calculations(int a, int b) //this is cl  parameter  
	{
		super();
		this.a = a;
		this.b = b;
	}
	
	public void add()
	{
		 result=a+b;
		 System.out.println( "add of A & B :" + result);
	 }
	 public void sub()
		{
			 result=a-b;
			 System.out.println( "sub of A & B :" + result);
		 }
	 
	 public static void main(String[] args) {
		 Calculations obj = new Calculations(100,200);//this is cl argument
		 obj.add();
		 obj.sub();
	
		 Calculations obj1 = new Calculations(10,20); 
		 obj1.add();
		 obj1.sub();
	
	}

}
