package pureum.review;

public class Gcd {
	public static void main(String[] args) {
		System.out.println(gcd(18,27));
	}
	public static int gcd(int m, int n) {
		if(m<n){
			int tmp;
			tmp=m;
			m=n;
			n=tmp;
		}
		if(m%n==0)
			return n;
		else{
			return gcd(n,m%n);
		}
	}
}
