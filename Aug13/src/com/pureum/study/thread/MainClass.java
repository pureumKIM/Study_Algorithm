package com.pureum.study.thread;

public class MainClass {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		tt.start();
		
		RunnableTest rt = new RunnableTest();
		Thread t = new Thread(rt);
		t.start();
	}
}
