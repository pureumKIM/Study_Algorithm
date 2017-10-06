package com.pureum.exercise.singleton;

public class FirstClass {
	public FirstClass() {
		// TODO Auto-generated constructor stub
		Singleton sing = Singleton.getSingleton();
		System.out.println(sing.getI());
		sing.setI(200);
		System.out.println(sing.getI());
	}
}
