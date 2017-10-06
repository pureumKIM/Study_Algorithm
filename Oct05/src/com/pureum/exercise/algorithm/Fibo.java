package com.pureum.exercise.algorithm;

public class Fibo {
	public static void main(String[] args) {
		System.out.println(fibo(8));
	}
	public static int fibo(int n) {
		// TODO Auto-generated method stub
		if(n<2) return n;
		else{
			return fibo(n-1)+fibo(n-2);
		}
	}
}
