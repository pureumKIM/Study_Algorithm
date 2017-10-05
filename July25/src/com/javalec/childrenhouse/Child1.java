package com.javalec.childrenhouse;

public class Child1 extends LunchMenu {
	public Child1(int rice, int gogi, int banana, int amond, int milk ) {
		// TODO Auto-generated constructor stub
		super(rice,gogi,banana,amond,milk);
	}

	@Override
	public int calculating() {
		// TODO Auto-generated method stub
		return rice+gogi+banana;
	}
}
