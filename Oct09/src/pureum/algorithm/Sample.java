package pureum.algorithm;

import java.util.Scanner;

public class Sample {
	static int num;
	static int arr[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		arr= new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	}
}
