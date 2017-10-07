package pureum.algorithm;

public class PrintCharacter {
	public static void main(String[] args) {
		print("안녕하실라우라우");
	}
	public static void print(String str) {
		if(str.equals(""))return;
		else{
			System.out.print(str.charAt(0));
			print(str.substring(1));
		}
	}
}
