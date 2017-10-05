package com.javalec.Star;

public class star6 {
	public static void main(String[] args) {
		int num=5;
		for(int i=1; i<num*2;i++){
			if(i<=num){
				for(int j1=0; j1<num-i;j1++){
					System.out.print(" ");
				}
				for(int j2=0; j2<i; j2++){
					System.out.print("*");
				}
				System.out.println();
			}else{
				for(int j3=0; j3<i-num; j3++){
					System.out.print(" ");
				}
				for(int j4=0; j4<num-(i-num);j4++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
