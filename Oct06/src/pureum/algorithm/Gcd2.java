package pureum.algorithm;

public class Gcd2 {
	public static void main(String[] args) {
		System.out.println(gcd2(12,42));
	}
	public static int gcd2(int m, int n) {
		if(n==0) return m;
		else{
			return gcd2(n,m%n);
		}
	}
}
