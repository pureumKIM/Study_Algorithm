package com.javalec.exercise;

public class MultiArrayTest2 {
	public static void main(String[] args) {
		int mul2[][] = new int[4][];
		mul2[0] = new int [1];
		mul2[1] = new int [2];
		mul2[2] = new int [3];
		mul2[3] = new int [4];
		
		int i,j,k=0;
		for(i=0; i<mul2.length;i++){
			for(j=0; j<mul2[i].length;j++){
				mul2[i][j] = k;
				k++;
			}
		}
		
		for(i=0; i<mul2.length;i++){
			for(j=0; j<mul2[i].length;j++){
				System.out.print(mul2[i][j]);
			}
			System.out.println("");
		}
	}
}
