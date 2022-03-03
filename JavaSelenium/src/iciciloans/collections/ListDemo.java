package iciciloans.collections;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("swagatika");
		a.add(20);
		a.add(20);
		a.add("Beauty");
		System.out.println(a);

		System.out.println(a.size());
		System.out.println(a.isEmpty());
		a.add(70);
		System.out.println(a);
        System.out.println(a.contains("mama"));
		System.out.println(a.contains("swagatika"));
		System.out.println(a.get(1));
		a.add(1,"sai");
		System.out.println(a);
		a.set(1,"saiketan");
		System.out.println(a);
		System.out.println(a.subList(1,5));
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		a.remove("swagatika");
		System.out.println(a);
		a.clear();
		System.out.println(a);

		
	}


	

}
