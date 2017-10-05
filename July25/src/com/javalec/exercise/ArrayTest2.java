package com.javalec.exercise;

public class ArrayTest2 {
	public static void main(String[] args) {
		int [] age = {20,80,70,100,90};
		int max = age[0];
		
		for(int i=0; i<age.length;i++){
			if(age[i]>max){
				max = age[i];
			}
		}
		System.out.println("ÃÖ´ñ°ªÀº"+max);
	}
}
