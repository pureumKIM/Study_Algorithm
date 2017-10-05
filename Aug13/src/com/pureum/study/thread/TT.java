package com.pureum.study.thread;

public class TT extends Thread {
	public TT(String str) {
		// TODO Auto-generated constructor stub
		setName(str);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++){
			System.out.println(i+getName());
		}
		System.out.println("끝"+getName());
	}
}
