package iciciloans.carloans;

public class SecondClass {
	
		//data properties
		int a=10, b=20 ,result;
		
		//behaviours
		public void  add(int a,int b) 
		{
			result=a+b;
			System.out.println("add of a & b is: + result");
			
		}
		public void sub(int a,int b) 
		{
			result=a-b;
			System.out.println("sub of a & b is: + result");
			
		}
		public static void main(String[] args) {
			System.out.println("hello");
			SecondClass obj=new SecondClass();
			obj.add(10,20);
			obj.sub(10,20);
			//SecondClass obj1=new SecondClass();
			//obj.add(100,200);
			//obj.sub(100,200);


		}
	}


