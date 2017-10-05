package com.javalec.thread;

public class ThreadTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		System.out.println("ThradTest");
		
		for(int i=0; i<10; i++){
			System.out.println(i);
			try{
			Thread.sleep(1000);
			}catch(Exception e){		
			}
		}
	}

}
