package pureum.algorithm;

public class Nwin {
	public static void main(String[] args) {
		System.out.println(nwin(2,10));
	}
	public static int nwin(int x, int num) {
		if(num==0) return 1;
		else{
			return x * nwin(x,num-1);
		}
	}
}
