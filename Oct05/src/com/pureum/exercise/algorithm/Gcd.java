package com.pureum.exercise.algorithm;

public class Gcd {
	public static void main(String[] args) {
		System.out.println(gcd(12,39));
	}
	public static int gcd(int m, int n) {
		// TODO Auto-generated method stub
		if(m<n){
			int temp = m;
			m=n;
			n=temp;
		}
		if(m%n==0) return n;
		else{
			return gcd(n,m%n);
		}
	}
}
