import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A7576 {
	public static int m,n;
	public static int[][] map;
	public static void main(String[] args) {
		//입력받기
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		map = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j]=sc.nextInt();
			}
		}
		//익은 사과 연결리스트에 넣기
		LinkedList<Elements> to = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j]==1) to.add(new Elements(i,j));
			}
		}
		//익은 사과 익히기 함수 투입
		for(Elements e : to){
			bfs(e.x,e.y);
		}

		System.out.println(countMax());
	}
	//사과 익히는 부분(큐 사용)
	private static void bfs(int a, int b) {
		int i,x,y,nx,ny;
		int[] dx = {1,0,0,-1};
		int[] dy = {0,-1,1,0};
		Queue<Elements> q = new LinkedList<>();
		q.offer(new Elements(a,b));
		while(!q.isEmpty()){
			x=q.peek().x; y=q.poll().y;//?
			for (i = 0; i <4; i++) {
				nx = x+dx[i];
				ny = y+dy[i];
				if(canSpread(x,y,nx,ny)){
					map[nx][ny]=map[x][y]+1;
					q.offer(new Elements(nx,ny));
				}
			}
		}
	}
	//유효한지 검사하는 부분
	private static boolean canSpread(int x, int y, int nx, int ny) {
		boolean isIn = (0<=nx&&nx<n)&&(0<=ny&&ny<m);
		return isIn && (map[nx][ny]==0||map[x][y]+1<map[nx][ny]);
	}

	//갯수 새는 부분
	private static int countMax() {
		int max =-1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j]==0) return -1;
				if(max<map[i][j]){
					max=map[i][j];
				}
			}
		}
		return max-1;
	}
}
//클래스 하나(연결리스크랑 큐에 사용)
class Elements{
	int x,y;
	Elements(int x, int y){
		this.x = x;
		this.y = y;
	}
}
