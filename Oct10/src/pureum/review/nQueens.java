package pureum.review;

public class nQueens {
	static int n=4;
	static int cols[] = new int[n];
	public static void main(String[] args) {
		whereQueens(0);
	}
	public static void whereQueens(int level) {
		if(level==n){
			for (int i = 0; i < cols.length; i++) {
				System.out.print(cols[i]+" ");
			}
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
		for (int i = 0; i < level; i++) {//i++에 dead code라고 표시되는이유
			if(cols[i]==cols[level] || level-i==Math.abs(cols[i]-cols[level]))
			return false;//if 바로뒤에 ;이거달면  if절 수행하고 false를 내놓는게 아니라 에러
		}
		return true;
	}
}
