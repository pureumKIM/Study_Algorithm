package com.javalec.exercise;
class A{
	int i;
	int j;
	void setij(int x, int y){
		i=x;
		j=y;
	}
}

class B extends A {
	int total;
	void hap(){
		total = i +j;
	}
}
public class Ha {
	public static void main(String[] args) {
		B a = new B();
		a.setij(3, 4);
		a.hap();
		System.out.println(a.total);
	}
}
