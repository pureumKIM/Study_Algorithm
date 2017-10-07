package pureum.review;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<Student>();
		
		hashSet.add(new Student("푸름",5));
		hashSet.add(new Student("잔디",4));
		hashSet.add(new Student("민중",3));
		
		System.out.println(hashSet.toString());
		Student s1 = new Student("푸름",5);
		hashSet.remove(s1);
		System.out.println(hashSet.toString());
	}
}
