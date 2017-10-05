package com.pureum.midas;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
	    int[][] input = new int[num+2][num+2];
	    for (int i = 0; i < input.length; i++) {
		      for (int j = 0; j < input[i].length; j++) {
		        input[i][j] = 0;
		      }
		    }
	    for (int i = 1; i < num+1; i++) {
			for (int j = 1; j < num+1; j++) {
				input[i][j] = sc.nextInt();
			}
		}
 
	    for (int i = 0; i < input.length; i++) {
	    	for (int j = 0; j < input.length; j++) {
				if(input[i][j]==1){
					cnt++;
					for (int r = i; r < input.length-1; r++) {
						for (int k = j; k < input.length-1; k++) {
							low(input,r,k);
							right(input,r,k);
						}
					}

				}
			}
	    }
	    System.out.println(cnt);
	    
	}
	static void low(int[][] input,int i, int j) {
		// TODO Auto-generated method stub
		
			if(input[i+1][j] == input[i+1][j-1])left(input,i+1,j);
			if(input[i+1][j] == input[i+1][j+1])right(input,i+1,j+1);
			if(input[i+1][j] == input[i+2][j])low(input,i+2,j);
			if(input[i][j] == input[i+1][j])input[i+1][j]=0;
	}
	static void right(int[][] input,int i, int j) {
		// TODO Auto-generated method stub
		if(input[i][j+1] == input[i+1][j+1])low(input,i+1,j+1);
		if(input[i][j+1] == input[i][j+2])right(input,i,j+2);
		if(input[i][j] == input[i][j+1]) input[i][j+1]=0;
	}
	static void left(int[][] input,int i, int j) {
		// TODO Auto-generated method stub
		if(input[i][j-1] == input[i+1][j-1])low(input,i+1,j-1);
		if(input[i][j] == input[i][j-1]) input[i][j-1]=0;
	}
}
