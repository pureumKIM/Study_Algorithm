import java.util.Scanner;

public class DotImage {
	public static int num;
	private static int[][] map;
	private static int cnt=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();// 밖에서 선언했는데 또 선언하면 다른 변수로 안다..
		map = new int[num][num];// 위에 static 넘으로 함수 돌아가므로..값변경 불가
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(map[i][j]==1){
					check(i,j);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	private static boolean check(int x, int y) {
		if(x<0||y<0||x>=num||y>=num) return false;
		if(map[x][y]==1){
			map[x][y]=2;
			check(x-1,y);
			check(x,y-1);
			check(x+1,y);
			check(x,y+1);
			return true;
		}
		return false;
	}
}
