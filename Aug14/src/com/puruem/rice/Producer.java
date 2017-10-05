package com.puruem.rice;

public class Producer extends Thread {
	private RiceCup rc;
	public Producer(RiceCup blank) {
		// TODO Auto-generated constructor stub
		rc = blank;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<10; i++){
			rc.put(i);
		}
	}
}
