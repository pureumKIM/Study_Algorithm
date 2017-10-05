package com.pureum.study.thread;

public class TTMain {
	public static void main(String[] args) {
		TT t1 = new TT("쉬운 자바");
		TT t2 = new TT("어려운 자바");
		t1.start();
		t2.start();
		
	}
}
