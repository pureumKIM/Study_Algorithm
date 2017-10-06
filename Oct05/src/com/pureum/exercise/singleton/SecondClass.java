package com.pureum.exercise.singleton;

public class SecondClass {
	public SecondClass() {
		// TODO Auto-generated constructor stub
		Singleton sing = Singleton.getSingleton();
		System.out.println(sing.getI());
		sing.setI(8000);
		System.out.println(sing.getI());
	}	
}
