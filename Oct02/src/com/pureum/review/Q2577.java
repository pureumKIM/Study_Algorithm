package com.pureum.review;

import java.util.Scanner;

public class Q2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int result = num1*num2*num3;
		int[] number = new int[10];
		
		while(result != 0){
			int temp = result%10;
			number[temp] +=1;
			result/=10;
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
}
