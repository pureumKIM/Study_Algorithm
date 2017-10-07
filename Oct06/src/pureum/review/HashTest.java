package pureum.review;

import java.util.HashMap;
import java.util.Iterator;

public class HashTest {
	public static void main(String[] args) {
		HashMap<Integer, String> hash = new HashMap<Integer,String>();
		hash.put(0, "안녕");
		hash.put(1, "하세요");
		hash.put(2, "방가");
		hash.put(3, "워요");
		System.out.println(hash.toString());
		hash.remove(1);
		System.out.println(hash.toString());
		
		Iterator<Integer> iterator = hash.keySet().iterator();
		while(iterator.hasNext()){
			System.out.println(hash.get(iterator.next()));
		}
	}
}
