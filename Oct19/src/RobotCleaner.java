import java.util.Scanner;

public class RobotCleaner {
	public static int n,m,cnt=1;
	public static int[][] map;
	public static int[] dx = {-1,0,1,0};
	public static int[] dy = {0,1,0,-1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][m];
		int cx =sc.nextInt();
		int cy =sc.nextInt();
		int cd =sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j]=sc.nextInt();
			}
		}
		map[cx][cy]=2;
		robotCleaner(cx,cy,cd);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println(cnt);
	}
	private static void robotCleaner(int cx, int cy, int cd) {
		int nx, ny, nd=cd;//처음에 지금 방향을 받고
		
		for (int i = 0; i < 4; i++) {//네방향을 탐색하며 청소를 한다.
			if(cx<1||cy<1||cx>n-2||cy>m-2) continue;//외각이 모두 벽이다.
			nd = (nd+3)%4;//받은 방향에서 계속 변화를 주는 것.
			nx = cx+dx[nd];
			ny = cy+dy[nd];		
			if(map[nx][ny]==0){//청소할 곳이 있다면,
				map[nx][ny]=2;
				cnt++;
				robotCleaner(nx,ny,nd);//그 방향으로 이동하여 반복한다.
				return;
			}
		}
		//청소할 곳이 없어 후진
		nd = (cd+2)%4;
		nx = cx+dx[nd];
		ny = cy+dy[nd];
		if(map[nx][ny]==1){//벽이 아니라면
			return;
		}else{
			robotCleaner(nx,ny,cd);
		}
	}
}
