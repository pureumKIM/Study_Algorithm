package com.java.review;

class Box{
	private int width;
	private int height;
	private int depth;
	private int vol;
	
	public Box(int w, int h, int d) {
		// TODO Auto-generated constructor stub
	width = w;
	height = h;
	depth =d;
	volume();
	}
	private void volume(){
		 vol = width*height*depth;
	}
	public int getVoluem(){
		return vol;
	}
}

public class BoxTest {
public static void main(String[] args) {
	Box b = new Box(2,3,4);
	
	System.out.println(b.getVoluem());
}
}
