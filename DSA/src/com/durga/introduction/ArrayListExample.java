package com.durga.introduction;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) throws Exception {
		ArrayList l = new ArrayList(15);  //Default size of arrayList is 10
		List l1 = new ArrayList();
		l.add(10);
		l.add("Durga");
		l.add(new Employee());
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		l.add(90);
		
		CustomArrayList l2 = new CustomArrayList(5);
		l2.add(10);
		l2.add("Durga");
		l2.add(new Employee());
		l2.add(40);
		l2.add(50);
		l2.add(60);

		
		System.out.println(l);
		System.out.println(l.get(1));
		System.out.println(l.size());
		System.out.println(l.contains("Durga"));
		System.out.println(l.indexOf("Durga"));
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l2.get(1));
		System.out.println(l2.size());
		System.out.println(l2.contains("Durga"));
		System.out.println(l2.indexOf("Durga"));
		
	}

}
