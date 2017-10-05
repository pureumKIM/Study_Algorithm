package com.javalec.exercise;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] num = new int[10];
		System.out.println("배열의 길이는 "+num.length);
		double hap =0;
		for(int i=0;i<num.length;i++){
			num[i]=i+1;
		}
		for(int j=0;j<num.length;j++){
			hap += num[j];
		}
		System.out.println("배열의 합, 1~10까지의 합은"+hap);
		System.out.println("평균은"+(hap/num.length));
	}
}
