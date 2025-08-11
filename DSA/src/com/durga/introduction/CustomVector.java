package com.durga.introduction;

import java.util.Arrays;

public class CustomVector {
	
	private Object[] array;
	private int size = 0;
	
	public CustomVector(int size) {
		array = new Object[size];
	}
	
	public CustomVector() {
		array = new Object[10];
	}
	
	@Override
	public synchronized String toString() {
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
	
	public synchronized void add(Object obj) {
		if(size >= array.length) {
			int newSize = array.length + (array.length / 2);
			array = Arrays.copyOf(array, newSize);
		}
		array[size] = obj;
		size++;
	}
	
	public synchronized Object remove(int indexToBeDeleted) throws Exception {
		Object obj = get(indexToBeDeleted);
		int noOfShiftOperations = array.length - indexToBeDeleted - 1;
		if(noOfShiftOperations > 0) {
			System.arraycopy(array, indexToBeDeleted + 1, array, indexToBeDeleted, noOfShiftOperations);
		}
		array[--size] = null;
		
		return obj;
	}
	
	public synchronized Object get(int index) throws Exception {
		if(index >= size || index < 0) {
			throw new Exception("Index not found");
		}
		return array[index];
	}

	public synchronized int size() {
		return size;
	}
	
	public synchronized boolean contains(Object o) {
		return indexOf(o) >= 0;
	}

	public synchronized int indexOf(Object o) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == o) {
				return i;
			}
		}
		return -1;
	}
	
	public synchronized void add(int index, Object obj) throws Exception {
		if(index > size || index < 0) {
			throw new Exception("Index not found");
		}
		
		if(size >= array.length) {
			int newSize = array.length + (array.length / 2);
			array = Arrays.copyOf(array, newSize);
		}
		
		for (int i = size; i > index; i--) {
			array[i] = array[i-1];
		}
		
		array[index] = obj;
		size++;
	}
}
