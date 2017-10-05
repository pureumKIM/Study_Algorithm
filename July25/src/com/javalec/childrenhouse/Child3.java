package com.javalec.childrenhouse;

public class Child3 extends LunchMenu {
	public Child3(int rice, int gogi, int banana, int amond, int milk ) {
		// TODO Auto-generated constructor stub
		super(rice,gogi,banana,amond,milk);
	}


	@Override
	public int calculating() {
		// TODO Auto-generated method stub
		return rice+gogi+amond+milk;
	}

}
