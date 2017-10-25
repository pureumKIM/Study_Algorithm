package review;

import java.util.Scanner;

public class Q8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] ox = new String[num];
		for (int i = 0; i < ox.length; i++) {
			ox[i]=sc.next();
		}
		for (int i = 0; i < ox.length; i++) {
			count(ox[i]);
		}
	}
	public static void count(String str) {
		char[] ch = str.toCharArray();
		int score = 0;
		int sum =0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='O'){
				score++;
			}else{
				score=0;
			}
			sum += score;
		}
		System.out.println(sum);
	}
}
