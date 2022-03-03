package pack1;

public class Class1
{
	int a,b,result;
	
	
	public Class1(int a, int b) //this is cl  parameter  
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
		 Class1 obj =new Class1 (100,200);//this is cl argument
		 obj.add();
		 obj.sub();
		 
		
	
	}



}
