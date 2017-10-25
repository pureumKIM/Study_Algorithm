package review;

import java.util.Scanner;

public class kakao1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr1 = new int[num];
		int[] arr2 = new int[num];
		for (int i = 0; i < num; i++) {
			arr1[i]=sc.nextInt();
		}
		for (int j = 0; j < num; j++) {
			arr2[j]=sc.nextInt();
		}
		compare(arr1,arr2);
	}
	public static void compare(int[] arr1,int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			convert(arr1[i]|arr2[i]);
		}
	}
	public static void convert(int arr) {
		char[] ch = Integer.toBinaryString(arr).toCharArray();
		for(char c : ch){
			if(c=='1'){
				System.out.print("#");
			}else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
