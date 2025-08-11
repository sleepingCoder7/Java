package com.durga.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MainClass {
	
	public static void main(String[] args) {
		List<Integer> list = new Vector<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Thread1 t1 = new Thread1(list, "T1");
		Thread2 t2 = new Thread2(list, "T2");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(list);	
	}

}
