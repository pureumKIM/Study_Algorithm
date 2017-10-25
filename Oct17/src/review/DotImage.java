package review;

import java.util.Scanner;

public class DotImage {
		public static int[][] map;
		public static int cnt =0;
		public static int num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		map = new int[num][num];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				map[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if(map[i][j]==1){
					cnt++;
					count(i,j);
				}
			}
		}
		System.out.println(cnt);
	}
	public static boolean count(int x, int y) {
		if(x<0||y<0||x>num-1||y>num-1)
			return false;
		else if(map[x][y]==1){
			map[x][y]=2;
			count(x-1,y);
			count(x,y-1);
			count(x+1,y);
			count(x,y+1);
			return true;
		}else{
			return false;
		}
	}
}
