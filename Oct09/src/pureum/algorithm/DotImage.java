package pureum.algorithm;

import java.util.Scanner;

public class DotImage {
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
		int cnt=0;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(arr[i][j]==1){
					cnt++;
					check(i,j);
				}
			}
		}
		System.out.println(cnt);
	}
	public static boolean check(int x, int y) {
		if(x<0 || y<0 || x>=num || y>= num){
			return false;
		}else if(arr[x][y]==1){//이것을 빼먹으면 안됨
			arr[x][y]=2;
			check(x-1,y);
			check(x,y-1);
			check(x+1,y);
			check(x,y+1);
			return true;
		}else{
			return false;
		}
	}
}
