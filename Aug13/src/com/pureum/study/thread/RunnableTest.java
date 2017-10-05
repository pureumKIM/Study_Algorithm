package com.pureum.study.thread;

public class RunnableTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<=10; i++){
			System.out.println("재미있는 자바 : "+i);
		}
	}

}
