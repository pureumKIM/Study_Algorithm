package com.javalec.exercise;
class AA{
	void show(){
		System.out.println("할렐루야");
	}
}
class BB extends AA {
	void show(){
		super.show();
		System.out.println("5천원입니다.");
	}
}
public class Blind {
	public static void main(String[] args) {
		BB b = new BB();
		b.show();
	}
}
