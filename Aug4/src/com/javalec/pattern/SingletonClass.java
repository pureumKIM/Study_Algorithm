package com.javalec.pattern;

public class SingletonClass {
	
	private static SingletonClass SINGLE_CLASS_INSTANCE = new SingletonClass();
	int i = 10;
	
	public SingletonClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonClass getSingletonClass(){
		if(SINGLE_CLASS_INSTANCE == null){
			SINGLE_CLASS_INSTANCE = new SingletonClass();
		}
		return SINGLE_CLASS_INSTANCE;
	}
	
	public int getI(){
		return i;
	}
	
	public void setI(int i){
		this.i=i;
	}
}
