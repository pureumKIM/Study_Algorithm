package com.javalec.pattern;

public class SecondClass {
	public SecondClass() {
		// TODO Auto-generated constructor stub
		SingletonClass singletonClass = SingletonClass.getSignletonClass();
		System.out.println("SecondClass");
		System.out.println("i ="+singletonClass.getI());
	}
}
