package com.pureum.singletonEx;

public class Singleton {
	
	private static Singleton SINGLETON_INSTANCE = new Singleton();
	public int i =10;

	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	public static Singleton getSingleton() {
		// TODO Auto-generated method stub
		if(SINGLETON_INSTANCE == null){
			SINGLETON_INSTANCE = new Singleton();
		}
		return SINGLETON_INSTANCE;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
}
