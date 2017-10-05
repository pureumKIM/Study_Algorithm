package com.javalec.Api_2;

public class MainClass3 {
	public static void main(String[] args) {
		Integer integer = new Integer(10);
		int i =integer.intValue();
		System.out.println(i);
		
		//String을 int로  바꾸어주는 것 기억하기!
		String str = "123";
		int j = Integer.parseInt(str);
		System.out.println(j);
	}
}
