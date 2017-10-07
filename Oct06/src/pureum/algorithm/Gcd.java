package pureum.algorithm;

public class Gcd {
	public static void main(String[] args) {
		System.out.println(gcd(12,42));
	}
	public static int gcd(int m, int n) {
		if(m<n){
			int temp;
			temp = n;
			n=m;
			m=temp;
		}
		if(m%n==0) return n;
		else{
			return gcd(n,m%n);
		}
	}
}
