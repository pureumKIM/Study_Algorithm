package com.javalec.exercise;

public class MultiArrayTest {
	public static void main(String[] args) {
		int mul[][] = new int[4][5];
		int i,j,k=1;
		for(i=0; i<4; i++){
			for(j=0; j<5;j++){
				mul[i][j]=k;
				k++;
			}
		}
		
		for(i=0; i<4; i++){
			for(j=0; j<5;j++){
				System.out.print(mul[i][j]);
			}
			System.out.println("");
		}
	}
}
