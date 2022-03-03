package iciciloans.homeloans;

public class CastingDemo {

	

	public static void main(String[] args) {
		/*
		 byte-1,short-2,char-2,int-4,long-8,float-4,double-8
		 containerBottel(1-ltr)---->500 ml water -no risk -->widening
		                       ---->1.5ltr      -risk     -->narrowing
	   */
		int x=10;
		System.out.println(x);
		double y= x;
		System.out.println(y);
		
		double a=12.10;
		System.out.println(a);
		float b=(float) a;
		System.out.println(b);
		
		int e=67;
		System.out.println(e);
		char f=(char) e;
		System.out.println(f);

	}

}
