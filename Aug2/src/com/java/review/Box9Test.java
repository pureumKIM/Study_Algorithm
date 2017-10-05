package com.java.review;
class Box9{
	private int w;
	private int h;
	private int d;
	public double num;
	private static double id;
	
	public static double getId(){
		int i =1;
		id = id +i;
		return id;
	}
}

public class Box9Test {
	public static void main(String[] args) {
		Box9 a = new Box9();
		a.num = Box9.getId();
		System.out.println(a.num);
		System.out.println("다음번호는"+Box9.getId());
	}
}
