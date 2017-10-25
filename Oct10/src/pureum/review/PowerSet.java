package pureum.review;

public class PowerSet {
	static char[] ch ={'a','b','c','d','e'};
	static int n = ch.length;
	static boolean[] include = new boolean[n];
	public static void main(String[] args) {
		powerSet(0);
	}
	public static void powerSet(int level) {
		if(level==n){
			for (int i = 0; i < ch.length; i++) {
				if(include[i]==true){
					System.out.print(ch[i]+" ");
				}
			}
			System.out.println();
		}else{
			include[level]=false;
			powerSet(level+1);
			include[level]=true;
			powerSet(level+1);
		}
	}
}
