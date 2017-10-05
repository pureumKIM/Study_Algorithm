package com.pureum.singletonEx;

public class FirstClass {
	public FirstClass() {
		// TODO Auto-generated constructor stub
		Singleton singleton = Singleton.getSingleton();
		System.out.println("===FirstClass===");
		System.out.println("i:"+singleton.getI());
		singleton.setI(200);
		System.out.println("i:"+singleton.getI());
	}
}
