package com.javalec.exercise;

public class MultiArrayTest3 {
	public static void main(String[] args) {
		int [][][] three = new int[3][4][5];
		int i,j,k,count=11;
		for(i=0; i<three.length;i++){
			for(j=0;j<three[i].length;j++){
				for(k=0;k<three[i][j].length;k++){
					three[i][j][k] = count;
					count++;
				}
			}
		}
		
		for(i=0; i<three.length;i++){
			System.out.println((i+1)+"번째 2차원 배열입니다.");
			for(j=0;j<three[i].length;j++){
				for(k=0;k<three[i][j].length;k++){
					System.out.print(three[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
