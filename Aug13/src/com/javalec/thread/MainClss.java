package com.javalec.thread;

public class MainClss {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		Thread t = new Thread(tt,"A");
		t.start();
		
		System.out.println(Thread.currentThread().getName());
	}
}
