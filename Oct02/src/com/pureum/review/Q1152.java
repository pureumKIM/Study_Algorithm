package com.pureum.review;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arrS = str.split(" ");
		int cnt = 0;
		
		for (int i = 0; i < arrS.length; i++) {
			if(!arrS[i].equals("")){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
