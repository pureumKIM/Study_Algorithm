package com.javalec.API;

public class StringBuffer {
	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("김푸");
		a.append("름");
		System.out.println(a);
		a.insert(1, "kim");
		System.out.println(a);
		a.delete(1, 4);
		System.out.println(a);
		a.deleteCharAt(2);
		System.out.println(a);
	}
}
