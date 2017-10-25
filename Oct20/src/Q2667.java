import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2667 {
	public static int n;
	public static int[][] map;
	public static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			char[] ch = str.toCharArray();
			for (int j = 0; j < n; j++) {
				map[i][j]=ch[j]-'0';
			}
		}
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(map[i][j]==1){
					cnt=0;
					if(checkNum(i,j)==0){
						result.add(1);
					}else{
						result.add(checkNum(i,j));	
					}
				}
			}
		}
		Collections.sort(result);
		System.out.println(result.size());
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	private static int checkNum(int a, int b) {
		int x, y, nx,ny;
		int[] dx={-1,0,1,0};
		int[] dy={0,1,0,-1};
		Queue<Elements> q = new LinkedList<>();
		q.offer(new Elements(a,b));
		while(!q.isEmpty()){
			x=q.peek().x;
			y=q.poll().y;
			for (int i = 0; i < 4; i++) {
				nx=x+dx[i];
				ny=y+dy[i];
				if(canSpread(x,y,nx,ny)){
					map[nx][ny]=2;
					cnt++;
					q.offer(new Elements(nx,ny));
				}
			}
		}
		return cnt;
	}
	private static boolean canSpread(int x, int y, int nx, int ny) {
		boolean isIn = (0<=nx&&0<=ny&&nx<n&&ny<n);
		return isIn&&(map[nx][ny]==1);
	}
}
