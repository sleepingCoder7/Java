package com.durga.introduction;

public class NeedForCollectionFramework {
	
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		
		Employee[] emp = new Employee[100];
		//What if we have 1000 employees
		//Every time we have to create a new array when a new employee joins the company
		//Index has to specified everytime while creating a new array
		//It cannot grow dynamically as the size is fixed
		//To overcome this problem Collection framework has been introduced
	}

}
