package com.pureum.review;

import java.util.Scanner;

public class Q8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] ox = new String[num];
		int total = 0;
		for (int i = 0; i < ox.length; i++) {
			ox[i]=sc.next();
		}
		for (int i = 0; i < ox.length; i++) {
			char[] ch = ox[i].toCharArray();
			int score = 0;
			for (int j = 0; j < ch.length; j++) {
				if(ch[j]=='O'){
					if(score != 0)score++;
					else if(score ==0)score=1;
				}else if(ch[j] == 'X'){
					score=0;
				}
				total += score;
			}
			System.out.println(total);
			score=0;
			total=0;
		}

	}
}
