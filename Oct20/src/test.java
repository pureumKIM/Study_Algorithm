
public class test {
	public static void main(String[] args) {
		int two =15;
		int three = 12;
		String str =Integer.toBinaryString(three);
		char[] ch = str.toCharArray();
		System.out.print(ch[0]);
		System.out.print(ch[1]);
		System.out.print(ch[2]);
		System.out.print(ch[3]);
		System.out.println(two&three);
	}
}
