package com.pureum.review;

import java.util.Scanner;

public class kakao1Again2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr1 = new int[num];
		int[] arr2 = new int[num];
		for (int i = 0; i < num; i++) {
			arr1[i]=sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			arr2[i]=sc.nextInt();
		}
		String[] map = solution(num,arr1,arr2);
		
		for (int i = 0; i < map.length; i++) {
			System.out.println(map[i]);
		}
	}
	static String[] solution(int num, int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		String[] result = new String[num];
		for (int i = 0; i < num; i++) {
			result[i] = convert(arr1[i]|arr2[i]);
		}
		return result;
	}
	static String convert(int num) {
		// TODO Auto-generated method stub
		StringBuilder sb =new StringBuilder();
		char[] ch = Integer.toBinaryString(num).toCharArray();
		for(char c : ch){
			if(c=='1') sb.append("#");
			else if(c=='0') sb.append(" ");
		}
		return sb.toString();
	}
}
