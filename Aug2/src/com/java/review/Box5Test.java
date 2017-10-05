package com.java.review;

class Box5{
	int width;
	int height;
	int depth;
	public Box5(){
		this(1,1,1);
	}
	public Box5(int w){
		this(w,1,1);
	}
	public Box5(int w, int h){
		this(w,h,1);
	}
	public Box5(int w,int h, int d){
		width = w;
		height = h;
		depth = d;
	}
}


public class Box5Test {
	public static void main(String[] args) {
		Box5 a = new Box5();
		Box5 b = new Box5(2);
		Box5 c = new Box5(2,3);
		Box5 d = new Box5(2,3,4);
	}
}
