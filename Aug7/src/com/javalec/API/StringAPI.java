package com.javalec.API;

public class StringAPI {
	public static void main(String[] args) {
		String a = "abcde";
		String b = "fg";
		String c = "FG";
		System.out.println(a.concat(b));
		System.out.println(a.substring(2));
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(c.toLowerCase());
		System.out.println(a.charAt(3));
		System.out.println(a.indexOf("d"));
		String ha = " ab df ef ";
		System.out.println(ha.trim());
		System.out.println(a.replace("b", "d"));
		System.out.println(a.replaceAll("ab","cd"));
		System.out.println(a);
	}
}
