package com.javalec.thread;

public class MainClassN {
	public static void main(String[] args) {
		NThread nt = new NThread();
		
		Thread t0 = new Thread(nt,"A");
		Thread t1 = new Thread(nt,"B");
		
		t0.start();
		t1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
	}
}
