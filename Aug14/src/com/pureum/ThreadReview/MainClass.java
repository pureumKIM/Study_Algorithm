package com.pureum.ThreadReview;

public class MainClass {
	public static void main(String[] args) {
		DoubleThread t1 = new DoubleThread(" : 배우기 쉬운 자바");
		DoubleThread t2 = new DoubleThread(" : 배우기 어려운 자바");
		
		System.out.println("=============스레드 시작============");
		t1.start();
		t2.start();
		System.out.println("=============스레드 종료============");
	}
}
