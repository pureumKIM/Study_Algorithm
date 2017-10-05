package com.pureum.study.thread;

class ThreadTest extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++){
			System.out.println("재미있는 자바 :"+i);
		}
	}
}
