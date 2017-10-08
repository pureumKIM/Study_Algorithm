package pureum.algorithm;

public class PowerSet {
	private static char[] data = {'a','b','c','d','e'};
	private static int n = data.length;
	private static boolean[] include= new boolean[n];
	
	public static void powerSet(int k) {
		if(k==n){
			for (int i = 0; i < n; i++) {
				if(include[i]){
					System.out.print(data[i]+" ");
				}
			}
			System.out.println();
		}else{
			include[k]=false;
			powerSet(k+1);
			include[k]=true;
			powerSet(k+1);
		}
	}
	public static void main(String[] args) {
		powerSet(0);
	}
}
