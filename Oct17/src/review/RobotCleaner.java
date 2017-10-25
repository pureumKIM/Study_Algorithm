package review;
import java.util.Scanner;

public class RobotCleaner {
	static int cnt=1;//처음꺼 청소고려
	static int N, M;
	static int[][] house;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		house = new int[N][M];
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int sd = sc.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				house[i][j]=sc.nextInt();
			}
		}
		house[sx][sy]=2;
		cleaner(sx,sy,sd);
		System.out.println(cnt);
	}
	public static void cleaner(int sx, int sy, int sd) {
		int cx, cy, cd = sd;
		for (int i = 0; i < 4; i++) {
			cd=(cd+3)%4;
			cx=sx+dx[cd];
			cy=sy+dy[cd];
			if(sx<1||sx>N-2||sy<1||sy>M-2)
				continue;
			if(house[cx][cy]==0){
				cnt++;
				house[cx][cy]=2;
				cleaner(cx,cy,cd);
				return;
			}
		}
		//후진 구현
		cd = (cd+2)%4;
		cx = sx +dx[cd];
		cy = sy +dy[cd];
		if(house[cx][cy]==1){
			return;
		}else{
			cleaner(cx,cy,sd);
		}

	}
}
