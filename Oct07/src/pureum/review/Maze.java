package pureum.review;

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
	
	private static final int EXACT_PATH = 3;
	private static final int POSSIBLE_PATH=2;
	
	public static boolean findPath(int x, int y) {
		if(x<0 || y<0 || x>=num || y>=num)
			return false;
		else if(maze[x][y] != 0){
			return false;
		}
		else if(x==num-1 && y==num-1){
			maze[x][y]= EXACT_PATH;
			return true;
		}else{
			maze[x][y]=EXACT_PATH;
			if(findPath(x-1,y)||findPath(x,y-1)||findPath(x+1,y)||findPath(x,y+1)){		
				return true;
			}else{
				maze[x][y]= POSSIBLE_PATH;
				return false;
			}
		}
	}
	public static void main(String[] args) {
		findPath(0,0);
		
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) {
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
	}
}
