package com.pureum.review;

public class kakao1 {
	public static void main(String[] args) {
		int num =5;
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		
		String[] map = solution(num,arr1,arr2);

		for (int i = 0; i < num; i++) {
			System.out.println(map[i]);
		}
	}
	static String[] solution(int num, int[] arr1, int[] arr2){
		String[] result = new String[num];
		for (int i = 0; i < num; i++) {
			result[i] = convert(arr1[i]|arr2[i]);
		}
		return result;
	}
	static String convert(int num) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		char[] ch = Integer.toBinaryString(num).toCharArray();
		for(char c : ch){
			if(c == '1') sb.append("#");
			if(c == '0') sb.append(" ");
		}
		return sb.toString();
		
	}

}
