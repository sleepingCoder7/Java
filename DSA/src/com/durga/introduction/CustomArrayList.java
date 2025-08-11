package com.durga.introduction;

import java.util.Arrays;

public class CustomArrayList {
	
	Object[] array;
	int size = 0;
	
	CustomArrayList(int size){
		array = new Object[size];
	}
	
	CustomArrayList(){
		array = new Object[10];
	}
	
	public void add(Object obj) {
		if(size >= array.length) {
			int newSize = array.length + (array.length / 2);
			
			/*
			 * Object[] temp = new Object[newSize]; 
			 * for (int i = 0; i < array.length; i++) {
			 * 	temp[i] = array[i]; 
			 * } 
			 * array = temp;
			 * 
			 * The above code can be more simplified as below
			 */
			
			array = Arrays.copyOf(array, newSize);
			
		}
		
		array[size] = obj;
		size++;
	}
	
	public void add(int index, Object obj) throws Exception {
		if(index > size || index < 0) {
			throw new Exception("Index not found");
		}
		
		if(size >= array.length) {
			int newSize = array.length + (array.length / 2);	//Increased the array size
			array = Arrays.copyOf(array, newSize);
		}
		
		for (int i = size; i > index; i--) {	//From 10,20,30,40,50 to 10,20,30,30,40,50
			array[i] = array[i-1];
		}
		
		array[index] = obj;
		size++;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < array.length; i++) {
			if(i == size - 1) {	
				s.append(array[i]);
				break;
			}else {
				s.append(array[i]+", ");
			}
		}
		s.append("]");
		return s.toString();
	}
	
	public Object get(int index) throws Exception {
		if(index >= size || index < 0) {
			throw new Exception("Index not found");
		}
		return array[index];
	}
	
	public int size() {
		return size;
	}
	
	public boolean contains(Object o) {
		return indexOf(o) >= 0;
	}
	
	public int indexOf(Object o) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == o) {
				return i;
			}
		}
		return -1;
	}
	
	public Object remove(int indexToBeDeleted) throws Exception {
		Object ob = get(indexToBeDeleted);
		int noOfShiftOperations = array.length - indexToBeDeleted - 1;
		if(noOfShiftOperations > 0) {
			System.arraycopy(array, indexToBeDeleted + 1, array, indexToBeDeleted, noOfShiftOperations);
		}
		array[--size] = null;
		
		return ob;
	}

}
