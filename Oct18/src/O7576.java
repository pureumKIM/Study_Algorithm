import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class O7576 {
	public static int m,n;
	public static int[][] map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		map  = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j]=sc.nextInt();
			}
		}
		LinkedList<Element2> to = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j]==1) to.add(new Element2(i,j));
			}
		}
		for(Element2 e : to){
			bfs(e.x,e.y);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println(countMax());
	}
	private static void bfs(int a, int b) {
		int x,y,nx,ny;
		int[] dx={-1,0,1,0};
		int[] dy={0,1,0,-1};
		Queue<Element2> q = new LinkedList<>();
		q.offer(new Element2(a,b));
		while(!q.isEmpty()){
			x=q.peek().x;//x값 꺼내서 보여주고!
			y=q.poll().y;//y값 꺼낸뒤 큐에서 삭제!
			for (int i = 0; i < 4; i++) {
				nx = x+dx[i];
				ny = y+dy[i];
				if(canSpread(x,y,nx,ny)){
					map[nx][ny]=map[x][y]+1;
					q.offer(new Element2(nx,ny));
				}
			}
		}	
	}
	private static boolean canSpread(int x, int y, int nx, int ny) {
		boolean isIn = (0<=nx&&nx<n)&&(0<=ny&&ny<m);
		return isIn && (map[nx][ny]==0||map[x][y]+1<map[nx][ny]);
	}
	private static int countMax() {
		int max = -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j]==0)return -1;
				if(max<map[i][j]) max=map[i][j];
			}
		}
		return max-1;
	}
}
class Element2{
	int x,y;
	Element2(int x, int y){
		this.x=x;
		this.y=y;
	}
}
