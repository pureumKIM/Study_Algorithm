package com.pureum.exercise;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		long startNum = System.currentTimeMillis();
		Random random = new Random();
		int j = random.nextInt(100);
		System.out.println(j);
		long endNum = System.currentTimeMillis();
		
		long startNum2 = System.currentTimeMillis();
		double h = Math.random();
		System.out.println((int)(h*10));
		long endNum2 = System.currentTimeMillis();
		
		System.out.println("랜덤클래스 :"+(endNum-startNum));
		System.out.println("Math : "+(endNum2-startNum2) );
	}
}
