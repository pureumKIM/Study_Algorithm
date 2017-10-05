package com.javalec.superex;

public class ChildClass extends ParentsClass {
public ChildClass() {
	// TODO Auto-generated constructor stub
	System.out.println("찰드");
}
	@Override
	public void method1() {

		super.method1();
		
		System.out.println("ChildClass의 method1()입니다.");
	}
}
