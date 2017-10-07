package pureum.algorithm;

public class LengthTest {
	public static void main(String[] args) {
		System.out.println(length("안녕하세요"));
	}
	public static int length(String str) {
		//글자이기 때문에 ==이 아니라 equals를 활용한다.
		if(str.equals("")) return 0;
		else{
			return 1+length(str.substring(1));
		}
	}
}
