import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q2667 {
	public static int n;
	public static int[][] map;
	public static int cnt;
	public static int[] dx = {-1,0,1,0};
	public static int[] dy = {0,1,0,-1};
	
	public static void main(String[] args) {
		ArrayList<Integer> count = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			char[] ch = str.toCharArray();
			for (int j = 0; j <ch.length; j++) {
				map[i][j]=ch[j]-'0';
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(map[i][j]==1){
					cnt=0;
					if(checkNum(i,j)!=0)
					count.add(checkNum(i,j));
					else{
					count.add(1);
					}
				}
			}
		}
		System.out.println(count.size());
		Collections.sort(count);//정렬해줌
		for (int i = 0; i < count.size(); i++) {
			System.out.println(count.get(i));
		}
	}
	
	private static int checkNum(int x, int y) {
		int nx,ny;
		for (int i = 0; i < 4; i++) {	
			nx = x +dx[i];
			ny = y +dy[i];
			if(nx<0||ny<0||nx>=n||ny>=n) continue;
			if(map[nx][ny]==1){
				map[nx][ny]=2;
				cnt++;
				checkNum(nx,ny);
			}			
		}
		return cnt;
	}
}
