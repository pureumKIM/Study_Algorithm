package review;

import java.util.Scanner;

public class A1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int cnt=0;
		String[] word = str.split(" ");
		for (int i = 0; i < word.length; i++) {
			if(!word[i].equals("")){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
