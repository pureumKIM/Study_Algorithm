package com.javalec.thread;

public class MainClass {
	public static void main(String[] args) {
		Th t = new Th();
		t.setName("B");
		t.start();
		
		System.out.println(Thread.currentThread().getName());
	}
	
}
