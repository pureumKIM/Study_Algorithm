package pureum.review;

public class ReverseCharacter {
	public static void main(String[] args) {
		reverse("HAPPYTOGETHER");
	}
	public static void reverse(String str) {
		if(str.equals(""))
			return;
		else{
			reverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
}
