package com.puruem.rice;

public class Customer extends Thread {
	private RiceCup rc;
	public Customer(RiceCup blank) {
		// TODO Auto-generated constructor stub
		rc = blank;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int value =0;
		for(int i =0; i<10 ; i++){
			value =rc.get();
		}
	}
}
