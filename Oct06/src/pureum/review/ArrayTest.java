package pureum.review;

import java.util.ArrayList;

public class ArrayTest {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("하하");
		arr.add("호호");
		arr.add("히히");
		arr.add("랄라");
		System.out.println(arr.toString());
		arr.set(2, "룰루");
		System.out.println(arr.toString());
		arr.remove(0);
		System.out.println(arr.toString());
		System.out.println(arr.size());
		arr.clear();
		System.out.println(arr.size());
		System.out.println(arr.toString());
	}
}
