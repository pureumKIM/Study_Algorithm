package com.javalec.Star;

public class star4 {
	public static void main(String[] args) {
		int num = 5;
		for(int i=0; i<num; i++){
			for(int j=0; j<i; j++){
				System.out.print(" ");
			}
			for(int k=0; k<num-i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
