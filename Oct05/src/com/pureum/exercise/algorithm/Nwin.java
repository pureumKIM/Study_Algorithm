package com.pureum.exercise.algorithm;

public class Nwin {
	public static void main(String[] args) {
		int result = nwin(2,10);
		System.out.println(result);
	}
	public static int nwin(int x, int n) {
		// TODO Auto-generated method stub
		if(n==0) return 1;
		else{
			return x*nwin(x,n-1);
		}
	}
}
