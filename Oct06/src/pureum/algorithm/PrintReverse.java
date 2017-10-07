package pureum.algorithm;

public class PrintReverse {
	public static void main(String[] args) {
		reverse("도레미파솔라시도");
	}
	public static void reverse(String str) {
		if(str.equals(""))
			return;
		else{
			reverse(str.substring(1));
			System.out.print(str.charAt(0));
			//charAt은 0번째 인덱스부터, substring 1부터 표시
		}
	}
}
