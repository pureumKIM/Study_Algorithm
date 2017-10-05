package com.javalec.Star;

public class star1 {
	public static void main(String[] args) {
		int num =5;
		for(int i=0; i<num; i++){
			for(int j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
