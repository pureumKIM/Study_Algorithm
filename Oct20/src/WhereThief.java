import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class WhereThief {
	public static int n,m,time;
	public static int[][] map;
	public static int[][] check;
	public static int one=15, two=12, three=3,four=9,five=5,six=6,seven=10;
	public static int[] mat1={1,1,1,1};
	public static int[] mat2={1,1,0,0};
	public static int[] mat3={0,0,1,1};
	public static int[] mat4={1,0,0,1};
	public static int[] mat5={0,1,0,1};
	public static int[] mat6={0,1,1,0};
	public static int[] mat7={1,0,1,0};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		map=new int[n][m];
		check=new int[n][m];
		time = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j]=sc.nextInt();
			}
		}
		whereThief(r,c);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(check[i][j]);
			}
			System.out.println();
		}
	}
	private static void whereThief(int a,int b) {
		int x,y,nx,ny;
		Queue<matrix> q = new LinkedList<>();
		q.offer(new matrix(a,b));
		while(!q.isEmpty()){
			x=q.peek().x;
			y=q.poll().y;
			int pipe=map[x][y];
			int mat[]=new int[4];
			int i =0;
			while(pipe>0){
				mat[i]=pipe%2;
				pipe/=2;
				i++;
			}

				if(mat[0]==1){//상
					nx=x+1;
					ny=y;
					if(canSpread(x,y,nx,ny)){
						check[nx][ny]=2;
						q.offer(new matrix(nx,ny));
					}
				}
				if(mat[1]==1){//하
					nx=x-1;
					ny=y;
					if(canSpread(x,y,nx,ny)){
						check[nx][ny]=2;
						q.offer(new matrix(nx,ny));
					}
				}
				if(mat[2]==1){//좌
					nx=x;
					ny=y-1;
					if(canSpread(x,y,nx,ny)){
						check[nx][ny]=2;
						q.offer(new matrix(nx,ny));
					}
				}
				if(mat[3]==1){//우
					nx=x;
					ny=y+1;
					if(canSpread(x,y,nx,ny)){
						check[nx][ny]=2;
						q.offer(new matrix(nx,ny));
					}
				}
		}
	}
	private static boolean canSpread(int x,int y,int nx, int ny) {
		boolean isIn = (0<=nx&&0<=ny&&nx<n&&ny<m);
		return isIn && (map[x][y]&map[nx][ny])!=0;
	}
}
class matrix{
	int x,y;
	public matrix(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
