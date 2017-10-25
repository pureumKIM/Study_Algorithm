
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class Q7576 {
	public static int n,m;
	public static int map[][];
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
		//연결리스트 생성
		LinkedList<element> to = new LinkedList<>();
		//익은 토마토 담기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j]==1){
					to.add(new element(i,j));
				}
			}
		}
		//실행시키는 함수
		for(element e : to){
			bfs(e.x,e.y);
		}
		
		System.out.println(getMaxDate());
		
	}
	private static void bfs(int a, int b) {//익히는 함수
		int i, x, y, nx, ny;
		int[] dx = {1,0,0,-1};
		int[] dy = {0,-1,1,0};
		Queue<element> q = new LinkedList<>();
		q.offer(new element(a,b));//제일먼저 익은부분중 첫번째 넣고
		
		//익어나가는것 계속해서 넣을 거임.
		while(!q.isEmpty()){//q 비어있지 않으면 수행하라.
			x=q.peek().x; y=q.poll().y;//의문이야..
			
			for (i = 0; i < 4; i++) {
				nx = x + dx[i];
				ny = y + dy[i];
				if(canSpread(x,y,nx,ny)){//확장가능한가?
					map[nx][ny]=map[x][y]+1;//하루 더 걸린 것이니까.
					q.offer(new element(nx,ny));//다음 꺼 넣기.
				}
			}
			
		}
		
	}
	//유효한지 검사
	private static boolean canSpread(int x, int y, int nx, int ny) {
		//영역 벗어나지 않는지
		boolean isInRange = (0<=nx&& nx<n)&&(0<=ny&&ny<m);
		//토마토가 안익었거나 이미 걸린 날짜보다 빨리 익는지
		return isInRange && (map[nx][ny]==0||map[x][y]+1<map[nx][ny]);
	}
	
	//count함수
	private static int getMaxDate() {
		int max=-1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j]==0)return -1;
				else if(max<map[i][j]){
					max=map[i][j];
				}
			}
		}
		return max-1;//처음 1부터 시작
	}
}
class element{
	int x;
	int y;
	element(int x, int y){
		this.x = x;
		this.y = y;
	}
}
