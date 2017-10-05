package com.pureum.ThreadReview;

public class DoubleThread extends Thread {
	public DoubleThread(String str) {
		// TODO Auto-generated constructor stub
		setName(str);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<3; i++){
			System.out.println(i+getName());
		}
		System.out.println("끝"+getName());
	}
}
