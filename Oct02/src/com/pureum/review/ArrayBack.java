package com.pureum.review;

import java.util.Scanner;

public class ArrayBack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=6;
		int[] arr = new int[num];
		int temp;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		temp = arr[num-1];
		for (int i = num-1; i > 0 ; i--) {
			arr[i] = arr[i-1];
		}
		arr[0]=temp;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}
