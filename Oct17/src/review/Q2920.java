package review;

import java.util.Scanner;

public class Q2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] music = new int[8];
		for (int i = 0; i < music.length; i++) {
			music[i]=sc.nextInt();
		}
		int asc = 1;
		int des = 8;
		for (int i = 0; i < music.length-1; i++) {
			if(music[i]+1==music[i+1]){
				asc++;
			}else if(music[i]-1==music[i+1]){
				des--;
			}
		}
		if(asc==8){
			System.out.println("ascending");
		}else if(des==1){
			System.out.println("descending");
		}else{
			System.out.println("mixed");
		}
	}
}
