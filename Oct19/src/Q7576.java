import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q7576 {
	public static int n,m;
	public static int[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		map = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j]=sc.nextInt();
			}
		}
		LinkedList<Elements> to = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j]==1) to.add(new Elements(i,j));
			}
		}
		for(Elements e : to){
			bfs(e.x, e.y);
		}
		System.out.println(countMax());
	}
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
				nx = x+dx[i];
				ny = y+dy[i];
				if(canSpread(x,y,nx,ny)){
					map[nx][ny]=map[x][y]+1;
					q.offer(new Elements(nx, ny));
				}
			}
		}
	}
	private static boolean canSpread(int x, int y, int nx, int ny) {
		boolean isIn = (0<=nx&&0<=ny&&nx<n&&ny<m);
		return isIn&&(map[nx][ny]==0||map[x][y]+1<map[nx][ny]);
	}
	private static int countMax() {
		int max=-1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j]==0)return -1;
				if(max<map[i][j]){
					max=map[i][j];
				}
			}
		}
		return max-1;
	}
}
class Elements{
	int x,y;
	public Elements(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
