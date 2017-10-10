package pureum.algorithm;

import java.util.Scanner;

public class Maze {
	public static int num;
	private static int[][] maze;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();//밖에서 선언했는데 또 선언하면 다른 변수로 안다..
		maze= new int[num][num];//위에 static 넘으로 함수 돌아가므로..값변경 불가
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				maze[i][j]=sc.nextInt();
			}
		}
		findPath(0,0);
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
	}
	public static boolean findPath(int x, int y) {
		if(x<0 || y<0 || x>=num || y>=num){
			return false;
		}else if(maze[x][y]!=0){
			return false;
		}else if(x==num-1 && y==num-1){
			maze[x][y]=3;
			return true;
		}else{
			maze[x][y]=2;
			if(findPath(x-1,y)||findPath(x,y-1)||findPath(x+1,y)||findPath(x,y+1)){
				maze[x][y]=3;
				return true;
			}else{
				return false;
			}
		}
	}
}
