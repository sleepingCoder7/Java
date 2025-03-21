package com.durga;

@FunctionalInterface
interface Square{
	int calculate(int x);
}

public class FunctionalInterface1 {
	
	public static void main(String[] args) {
		int a = 5;
		
		Square s = (int x) -> x * x;
		
		int ans = s.calculate(a);
		
		System.out.println(ans);
		
		//before Java 8
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("New thread created");
			}
		}).start();
		
		/* 
		 * Functional interfaces introduced in Java 8 
		 * 1) Runnable interface - This only contains run() method
		 * 2) Comparable interface - This only contains compareTo() method
		 * 3) ActionListener interface - This only contains actionPerformed() method
		 * 4) Callable interface - This only contains the call() method
		 * 
		 * 
		 * 
		 * */
		
	}

}
