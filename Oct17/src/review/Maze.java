package review;

public class Maze {
	private static int num =8;
	private static int[][] maze={
			{0,0,0,0,0,0,0,1},
			{0,1,1,0,1,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,0,0,1,1,0,0},
			{0,1,1,1,0,0,1,1},
			{0,1,0,0,0,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,1,1,0,1,0,0}
	};
	public static void main(String[] args) {
		findPath(0,0);
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <num; j++) {
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
	}
	public static boolean findPath(int x, int y) {
		int n = maze.length;
		if(x<0||y<0||x>n-1||y>n-1)
			return false;
		else if(x==n-1 && y==n-1){
			maze[x][y]=3;
			return true;
		}else if(maze[x][y]!=0)//1이면 false가 아니라 0이 아니면 false;
			return false;//벽이거나 이미 체크 되었거나.
		else{
			maze[x][y]=2;
			if(findPath(x-1,y)||findPath(x,y-1)||findPath(x+1,y)||findPath(x,y+1)){
				maze[x][y]=3;
				return true;
			}
			return false;
		}
	}
}
