package com.javalec.Star;

public class star5 {
	public static void main(String[] args) {
		int num=5;
		
		for(int i=1; i<num*2; i++){
			if(i<=num){
				for(int j=0; j<i; j++){
					System.out.print("*");
				}
				
			}else{
				for(int k=0; k<num-(i-num);k++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
