package iciciloans.homeloans;

public class DataType {
	byte b;//=-128;
	short s;//=32767;
	int i;//=2147483647;
	long l;//=2147483647;
	
	float f;//=11.34f;
	double d;//=34.56;
	
	boolean bb;//=true;
	char ch;//='b';
	
	String str;
	static String cname;
	static float roi;
	

	public static void main(String[] args)
	{
		int x=100;
		
		DataType obj= new DataType();
		System.out.println("byte :"+ obj.b);
		System.out.println("short :"+ obj.s);
		System.out.println("int :"+ obj.i);
		System.out.println("long :"+ obj.l);
		
		System.out.println("float :"+ obj.f);
		System.out.println("double :"+ obj.d);
		
		System.out.println("boolean :"+ obj.bb);
		System.out.println("char :"+ obj.ch);
		
		System.out.println("cname :"+ cname);
		System.out.println("ROI :"+ DataType.roi);
		System.out.println("x : "+ x);
	}

}
