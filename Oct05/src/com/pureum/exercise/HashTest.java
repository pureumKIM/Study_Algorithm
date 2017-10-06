package com.pureum.exercise;

import java.util.HashMap;
import java.util.Iterator;

public class HashTest {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
		hashMap.put(0, "str1");
		hashMap.put(1, "str2");
		hashMap.put(2, "str3");
		hashMap.put(3, "str4");
		System.out.println(hashMap.toString());
		
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()){
			System.out.println(hashMap.get(iterator.next()));
		}
		
		
	}
}
