package review;

import java.util.Scanner;

public class RobotCleaner2 {
	public static int n,m;
	public static int[][] map;
	public static int[] dx ={-1,0,1,0};
	public static int[] dy ={0,1,0,-1};
	public static int cnt=1;//일단 청소하고 시작.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][m];
		int x = sc.nextInt();
		int y = sc.nextInt();
		int d = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j]=sc.nextInt();
			}
		}
		map[x][y]=2;
		cleaner(x,y,d);
		System.out.println(cnt);
	}
	public static void cleaner(int x, int y, int d) {
		int cx, cy, cd=d;
		for (int i = 0; i <4; i++) {
			if(x<1||y<1||x>n-2||y>m-2)
				continue;//다시 검사 하시오
			//cd= cd+3으로 해야하지 cd= d+3하면 안됨.
			cd = (cd+3)%4;//왼쪽방향으로 돌면서 청소시작
			cx = x+dx[cd];
			cy = y+dy[cd];
			if(map[cx][cy]==0){
				map[cx][cy]=2;
				cnt++;
				cleaner(cx,cy,cd);
				return;
			}
		}
		//후진 시작
		cd = (d+2)%4;
		cx = x+dx[cd];
		cy = y+dy[cd];
		if(map[cx][cy]!=1){
			cleaner(cx,cy,d);//방향은 변하지 않는다.
		}else{
			return;
		}
	}
}
