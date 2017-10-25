package review;

import java.util.Arrays;
import java.util.Scanner;

public class Q10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toString().toCharArray();
		int[] alpha = new int[26];
		for (int i = 0; i < alpha.length; i++) {
			alpha[i]=-1;
		}
		int cnt=0;
		for (int i = 0; i < ch.length; i++) {
			if(alpha[ch[i]-97]==-1)
			alpha[ch[i]-97]=cnt;
			cnt++;
		}
		for (int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i]+" ");
		}
	}
}
