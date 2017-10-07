package pureum.algorithm;

public class MazeAgain2 {
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
			if(x<0||y<0||x>=n||y>=n){
				return false;
			}else if(x==n-1 && y ==n-1){
				maze[x][y]=POSSIBLE;
				return true;
			}else if(maze[x][y] !=0){
				return false;
			}else {
				maze[x][y]=POSSIBLE;
				if(findMazePath(x+1,y)||findMazePath(x,y+1)||findMazePath(x-1,y)||findMazePath(x,y-1)){
				return true;
				}
			}
				maze[x][y]=IMPOSSIBLE;
				return false;
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
