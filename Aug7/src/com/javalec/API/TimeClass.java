package com.javalec.API;

public class TimeClass {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		
		String str = "A";
		long startNum = System.currentTimeMillis();
		for(int i =0; i< 50000; i++){
			str = str + "A";
		}
		long endNum = System.currentTimeMillis();
		System.out.println("경과시간"+(endNum-startNum));
		
		StringBuilder str1 = new StringBuilder("A");
		long startNum1 = System.currentTimeMillis();
		for(int i =0; i< 50000; i++){
			str1 = str1.append("A");
		}
		long endNum1 = System.currentTimeMillis();
		
		System.out.println("경과시간"+(endNum1-startNum1));
	}
}
