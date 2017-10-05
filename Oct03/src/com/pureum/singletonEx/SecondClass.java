package com.pureum.singletonEx;

public class SecondClass {
	public SecondClass() {
		// TODO Auto-generated constructor stub
		Singleton singleton = Singleton.getSingleton();
		System.out.println("===SecondClass===");
		System.out.println("i:"+singleton.getI());
		singleton.setI(80);
		System.out.println("i:"+singleton.getI());
	}
}
