package com.pureum.exercise.algorithm;

public class Factorial {
	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println(result);
	}
	public static int factorial(int n) {
		// TODO Auto-generated method stub
		if(n==0) return 1;
		else{
			return n*factorial(n-1);
		}
	}
}
