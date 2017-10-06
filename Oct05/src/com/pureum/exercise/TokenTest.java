package com.pureum.exercise;

import java.util.StringTokenizer;

public class TokenTest {
	public static void main(String[] args) {
		String str1 ="오늘 하루도 방긋";
		String str2 ="2017/10/5";
		StringTokenizer st1 = new StringTokenizer(str1);
		StringTokenizer st2 = new StringTokenizer(str2,"/");
		while(st1.hasMoreTokens()){
			System.out.println(st1.nextToken());
		}
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}
	}
}
