package review;

public class nQueens {
	public static int n = 4;
	public static int[] cols = new int[n];
	public static void main(String[] args) {
		whereQueens(0);
	}
	public static void whereQueens(int level) {
		if(level==n){
			for (int i = 0; i < cols.length; i++) {
				System.out.print(cols[i]+" ");
			}
			System.out.println();
		}else{
			for (int i = 0; i < cols.length; i++) {
				cols[level]=i;
				if(isPossible(level)){
					whereQueens(level+1);
				}
			}
		}
	}
	public static boolean isPossible(int level) {
		for (int i = 0; i < level; i++) {
			if(cols[i]==cols[level]||level-i==Math.abs(cols[level]-cols[i])){
				return false;//&&가 아니라 OR로^^
			}
		}
		return true;
	}
}
