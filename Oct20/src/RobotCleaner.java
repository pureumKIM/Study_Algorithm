import java.util.Scanner;

public class RobotCleaner {
	public static int n,m;
	public static int[][] map;
	public static int[] dx ={-1,0,1,0};
	public static int[] dy ={0,1,0,-1};
	public static int cnt=0;
	public static void main(String[] args) {
		//입력받기
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][m];
		int cx = sc.nextInt();
		int cy = sc.nextInt();
		int cd = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j]=sc.nextInt();
			}
		}
		cnt=1;
		map[cx][cy]=2;//1이아닌 체크 : 2 값 잘 입력 테스트 케이스에 영향
		cleaner(cx,cy,cd);

		System.out.println(cnt);
	}
	private static void cleaner(int cx, int cy, int cd){
		int nx,ny,nd=cd;
		//청소기(왼쪽방향부터 샤샤)
		for (int i = 0; i < 4; i++) {
			nd=(nd+3)%4;
			nx = cx+dx[nd];
			ny = cy+dy[nd];
			if(nx<0||ny<0||nx>=n||ny>m) continue;
			if(map[nx][ny]==0){
				map[nx][ny]=2;
				cnt++;
				cleaner(nx,ny,nd);
				return;
			}
		}
		//청소기(후진구현)
		nd = (cd+2)%4;
		nx = cx+dx[nd];
		ny = cy+dy[nd];
		if(map[nx][ny]==1){
			return;
		}else{
			cleaner(nx,ny,cd);
		}
	}

}
