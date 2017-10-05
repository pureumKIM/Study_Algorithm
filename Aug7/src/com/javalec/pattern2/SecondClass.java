package com.javalec.pattern2;

public class SecondClass {
	public SecondClass() {
		// TODO Auto-generated constructor stub
		SingletonClass sing = SingletonClass.getSingletonClass();
		System.out.println("SecondClass");
		System.out.println(sing.getI());
		sing.setI(400);
		System.out.println("i:"+sing.getI());
	}
}
