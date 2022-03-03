package iciciloans.homeloans;

public class StringDemo1 {
	public static void main(String[] args) 
	{
		String s1="sushree";
		String s2="swagatika";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//s1=s1+s2;
		s1=s1.concat(s2);
		System.out.println(s1.hashCode());
		System.out.println("--------------------------------------");
		StringBuffer ss1=new StringBuffer("swaga");
		StringBuffer ss2 = new StringBuffer("tika");
		System.out.println(ss1.hashCode());
		System.out.println(ss2.hashCode());
		
		//ss1=ss1+ss2;//we can use + in StringBuffer
		ss1=ss1.append(ss2);
		System.out.println(ss1.hashCode());
				
	}

}
