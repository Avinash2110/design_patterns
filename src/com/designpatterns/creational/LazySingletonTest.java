package com.designpatterns.creational;

public class LazySingletonTest {
	
	public static void main(String args[]) {
		LazySingleton lz = LazySingleton.getInstance();
		lz.printName();
		LazySingleton lz1 = LazySingleton.getInstance();
		lz1.printName();
	}

}
