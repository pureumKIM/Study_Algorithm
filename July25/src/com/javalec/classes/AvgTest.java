package com.javalec.classes;

public class AvgTest {
	public static void main(String[] args) {
		AvgTotal st1 = new AvgTotal();
		AvgTotal st2 = new AvgTotal();
		st1.name = "¹Î¼ö";
		st2.name = "Ã¶¼ö";
		String st1grade = st1.average(80, 70);
		String st2grade = st2.average(100, 50);
		int st2total = st2.total(100, 50);
		int st1total = st2.total(100, 50,70);
		System.out.println(st1grade);
		System.out.println(st2grade);
		System.out.println(st2total);
		System.out.println(st1total);
	}
}
