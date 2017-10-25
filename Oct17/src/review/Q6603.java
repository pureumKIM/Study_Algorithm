package review;

import java.util.Scanner;

public class Q6603 {
	public static int num;
	public static int[] numbers;
	public static boolean[] include;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			num = sc.nextInt();
			if(num==0) break;
			numbers = new int[num];
			for (int i = 0; i < numbers.length; i++) {
				numbers[i]=sc.nextInt();
			}
			include = new boolean[num];
			lotto(0);
			System.out.println();
		}
	}
	public static void lotto(int level) {
		int n = num;
		if(level==n){
			int cnt=0;
			for (int i = 0; i < include.length; i++) {
				if(include[i]==true){
					cnt++;
				}
			}
			if(cnt==6){
				for (int j = 0; j < include.length; j++) {	
					if(include[j]==true){
						System.out.print(numbers[j]+" ");
					}
				}
				System.out.println();
			}

		}else{
			include[level]=true;
			lotto(level+1);
			include[level]=false;	
			lotto(level+1);
		}
	}
}
