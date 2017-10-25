package review;

import java.util.Scanner;

public class Q6378 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			char[] ch = sc.nextLine().toCharArray();
			if(ch[0]=='0') break;
			int sum=0;
			while(true){
				sum=0;
				for (int i = 0; i < ch.length; i++) {
					sum += ch[i]-'0';
				}
				if(sum>=10){
					ch = String.valueOf(sum).toCharArray();
				}
				else{
					break;
				}
			}
			System.out.println(sum);
		}

	}
}
