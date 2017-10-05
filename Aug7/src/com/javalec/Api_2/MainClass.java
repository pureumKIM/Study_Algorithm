package com.javalec.Api_2;

import java.util.Random;

public class MainClass {
	public static void main(String[] args) {
		
		double d = Math.random();
		System.out.println(d);
		
		int di = (int)(d*100);//100까지 정수형 구할때! 형변환도
		System.out.println(di);
		
		Random random = new Random();
		int i = random.nextInt(100);
		System.out.println(i);
	}
}
