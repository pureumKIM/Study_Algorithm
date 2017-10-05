package com.java.review;

import java.util.Scanner;

public class WhileReturn {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		while(num == i){
			if(i%num==0){
				System.out.println("입력한 값은 : "+i);
				return;
			}
			i++;
		}
	}
}
