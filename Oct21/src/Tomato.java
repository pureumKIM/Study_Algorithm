import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato {
	public static int n,m;
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
		//익은 토마토 LinkedList에 저장
		LinkedList<Elements> e = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j]==1){
					e.offer(new Elements(i,j));
				}
			}
		}
		//익은 토마토 하나씩 함수로보내기
		for(Elements b : e){
			bfs(b.x,b.y);
		}
		System.out.println(checkMax());
	}
	
	//익히는 함수
	private static void bfs(int a, int b) {
		int x,y,nx,ny;
		int[] dx ={-1,0,1,0};
		int[] dy ={0,1,0,-1};
		Queue<Elements> q = new LinkedList<>();
		q.offer(new Elements(a,b));
		while(!q.isEmpty()){
			x=q.peek().x;
			y=q.poll().y; 
			for (int i = 0; i < 4; i++) {
				nx=x+dx[i];
				ny=y+dy[i];
				if(canSpread(x,y,nx,ny)){
					map[nx][ny]=map[x][y]+1;
					q.offer(new Elements(nx,ny));
				}
			}
		}
		
	}
	//canSpread함수	
	private static boolean canSpread(int x,int y,int nx,int ny) {
		boolean isIn = (0<=nx&&0<=ny&&nx<n&&ny<m);
		return isIn&&(map[nx][ny]==0||map[x][y]+1<map[nx][ny]);
	}
	private static int checkMax() {
		int max = -1;
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
//클래스
class Elements{
	int x,y;
	public Elements(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
