package pureum.algorithm;

public class MazeAgain {
		private static int n=8;
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
		private static final int POSSIBLE = 3;
		private static final int IMPOSSIBLE = 2;

		public static boolean findMazePath(int x, int y) {
			if(x<0||y<0||x>=n||y>=n)
				return false;//범위 초과시
			else if(maze[x][y] !=0){
				return false;//벽이라면 false
			}else if(x==n-1 && y==n-1){//출구좌표
				maze[x][y]=POSSIBLE;
				return true;
			}else{
				maze[x][y]=POSSIBLE;//아래 탐색방향에 따라 답이 다르게 나올수 있다.
				if(findMazePath(x-1,y)||findMazePath(x,y-1)||findMazePath(x+1,y)||findMazePath(x,y+1)){
					return true;
				}
				maze[x][y]=IMPOSSIBLE;
				return false;
			}
		}
		public static void main(String[] args) {
					findMazePath(0,0);
					for (int i = 0; i < maze.length; i++) {
						for (int j = 0; j < maze[i].length; j++) {
							System.out.print(maze[i][j]);
						}
						System.out.println();
					}
		}	
}
