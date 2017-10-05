package com.javalec.pattern2;

public class FirstClass {
	public FirstClass() {
		// TODO Auto-generated constructor stub
		SingletonClass sing = SingletonClass.getSingletonClass();
		System.out.println("FirstClass");
		System.out.println("i:"+sing.i);
		sing.setI(200);
		System.out.println("i:"+sing.i);
	}
}
