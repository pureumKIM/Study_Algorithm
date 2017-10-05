package com.puruem.rice;

public class RiceCup {
	private int rice;
	private boolean available = false;
	
	public synchronized void put(int value) {
		// TODO Auto-generated method stub
		while(available == true){
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		rice = value;
		System.out.println("생산자가 생산함 :"+rice);
		notify();
		available = true;
	}
	
	public synchronized int get() {
		// TODO Auto-generated method stub
		while(available == false){
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("소비자가 소비함 : "+rice);
		notify();
		available = false;
		return rice;
	}
}
