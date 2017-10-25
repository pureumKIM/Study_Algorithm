import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2178 {
	public static int n,m;
	public static int[][] map;
	public static boolean[][] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		map=new int[n][m];
		visited = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			char[] ch = str.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				map[i][j]=ch[j]-'0';//주의 숫자로 바꿔줘야함..
			}
		}
		visited[0][0]=true;
		checkNum(0,0);
		System.out.println(map[n-1][m-1]);
	}
	private static void checkNum(int a, int b) {
		int x,y,nx, ny;
		int[] dx ={-1,0,1,0};
		int[] dy ={0,1,0,-1};
		Queue<Elements> q = new LinkedList<>();
		q.offer(new Elements(a,b));
		while(!q.isEmpty()) {
			x=q.peek().x;
			y=q.poll().y;
			for (int i = 0; i < 4; i++) {
				nx = x+dx[i];
				ny = y+dy[i];
				if(canSpread(x,y,nx,ny)&&map[nx][ny]!=0){
					map[nx][ny]=map[x][y]+1;
					visited[nx][ny]=true;
					q.offer(new Elements(nx,ny));
				}
			}
		}
	}
	private static boolean canSpread(int x, int y, int nx, int ny) {
		boolean isIn = (0<=nx&&0<=ny&&nx<n&&ny<m);
		return isIn &&(visited[nx][ny]==false);
	}
}
class Elements{
	int x,y;
	public Elements(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
