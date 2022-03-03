package iciciloans.homeloans;

public class StringDemo {

	public static void main(String[] args) {
		String s1="swagatika";
		System.out.println(s1);
		
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.hashCode());
		System.out.println(s1.indexOf('g'));
		System.out.println(s1.charAt(1));
		
		String s2=new String("pradhan");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		String s3="Swagatika";
		System.out.println(s3);
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		String s4="swagatik";
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.contains(s4));
		
		//s1=s1+s2;
		//s1=s1.concat(s2);
		System.out.println(s1);
		
		//s1=s1+" "+s2;
		//System.out.println(s1);
		//System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s3.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equals(s3.toLowerCase()));
		System.out.println(s1);
		System.out.println(s1.replace('t','r'));
		System.out.println(s1.substring(1,7));//except ending index + 1
		
		String s5=" swagatika";//space also consider 1 character
		System.out.println(s1);
		System.out.println(s5);
		System.out.println(s5.trim());//left/right side spaces are cut
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s5.trim()));
		
		String s6="  Swagatika";
		System.out.println(s1.equals(s6.trim().toLowerCase()));
		
		String s7="sushree  swagatika pradhan";
		System.out.println(s7);
		String []str=s7.split(" ");
		for(String s:str) 
		{
			System.out.println(s);
		}
		System.out.println(s1.startsWith("swa"));
		System.out.println(s1.endsWith("tik"));
		
	}

}


