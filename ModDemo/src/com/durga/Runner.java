package com.durga;

import com.durga.util.Calculator;

public class Runner {
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int result = c.add(4.5, 5.3);
		System.out.println(result);
	}

}
