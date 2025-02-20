package com.durga;

public class Singleton {
	
	//Static member to hold the single instance
//	private static volatile Singleton instance = new Singleton();
	
	
	//Making the constructor private so that it cannot be called from outside
	private Singleton() {
		System.out.println("Singleton is initialized");
	}
	
//	//Static method to get the single instance
//	public static Singleton getInstance() {
//		//Lazy initialization - not thread safe
//		if(instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
	
//	//Thread Synchronized method to get the single instance
//	public static synchronized Singleton getInstance() {
//		if(instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
	
//	//Eager initialization
//	public static Singleton getInstance() {
//		return instance;
//	}
	
//	//Double checked locking
//	public static Singleton getInstance() {
//		if(instance == null) {
//			synchronized (Singleton.class) {
//				if(instance == null) {
//					instance = new Singleton();
//				}
//			}
//		}
//		return instance;
//	}
	
	private static class SingletonHelper {
		private static final Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonHelper.instance;
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}

}

class Main {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		obj1.sayHello();
		obj2.sayHello();
		System.out.println(obj1 + " " + obj2);
	}
}
