package pureum.algorithm;

public class NQueens {	
		private int N;
		private int cols[];
		
		public NQueens(int N) {
			this.N = N;
			cols = new int[N];
		}
	public static void main(String[] args) {
		NQueens nQueens = new NQueens(4);
		nQueens.back_tracking(0);
	}
	public void back_tracking(int level){
		if(level == N){//모든 조건을 만족한다는 소리이므로 출력
			for (int i = 0; i < N; i++) {
				System.out.print(cols[i]);
			}
			System.out.println();
		}else{
			//level-1까지는 조건대로 되어있고, level에 퀸을 놓는 상황
			for (int i = 0; i < N; i++) {
				cols[level]=i;//i는 열을 의미한다.
				if(isPossible(level)){
					back_tracking(level+1);
				}
			}
		}
	}
	public boolean isPossible(int level){
		for (int i = 0; i < level; i++) {//같은 열에 있거나 대각선에 있으면 false
			if(cols[i]==cols[level]||level-i == Math.abs(cols[level]-cols[i])){
				return false;
			}
		}
		return true;
	}
}


