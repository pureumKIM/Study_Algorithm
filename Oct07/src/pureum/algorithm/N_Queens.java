package pureum.algorithm;

public class N_Queens {
	 private int size;
	 private int[] cols;
	 public N_Queens(int size) {
		 this.size = size;
		 cols = new int[size];
	}
	 public static void main(String[] args) {
		N_Queens n_Queens = new N_Queens(4);
		n_Queens.whereQueen(0);
	}
	public void whereQueen(int level) {
		if(level==size){
			for (int i = 0; i < cols.length; i++) {
				System.out.print(cols[i]);
			}
			System.out.println("");
		}else{
			for (int i = 0; i < cols.length; i++) {
				cols[level]=i;
				if(isPossible(level)){
					whereQueen(level+1);
				}
			}
		}
	}
	public boolean isPossible(int level) {
		for (int i = 0; i < level; i++) {
			if(cols[i]==cols[level]|| level-i ==Math.abs(cols[i]-cols[level]))
					return false;
		}
		return true;
	}
}
