package com.pureum.exercise.algorithm;

public class Gcd2 {
	public static void main(String[] args) {
		System.out.println(gcd(12,39));
	}
	public static int gcd(int m, int n) {
		// TODO Auto-generated method stub
		if(n==0) return m;
		else{
			return gcd(n,m%n);
		}
	}
}
