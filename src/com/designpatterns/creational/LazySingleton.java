package com.designpatterns.creational;


//Lazy Singleton class

public final class LazySingleton {
	
	private static volatile LazySingleton instance = null;
	
	private LazySingleton() {
		
	}
	
	public static LazySingleton getInstance() {
		if(instance==null) {
			synchronized(LazySingleton.class) {
				instance = new LazySingleton();
				System.out.println("Object is created");
			}
			
		}
		return instance;
	}
	
	public static void printName() {
		System.out.println("I am lazy");
	}

}
