package com.javalec.pattern;

public class FirstClass {
	public FirstClass() {
		// TODO Auto-generated constructor stub
		
		SingletonClass singletonClass = SingletonClass.getSignletonClass();
		System.out.println("FirstClass");
		System.out.println("i:"+singletonClass.i);
		singletonClass.setI(200);
		System.out.println("i:"+singletonClass.i);
	}
}
