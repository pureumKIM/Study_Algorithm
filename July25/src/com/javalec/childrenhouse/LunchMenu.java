package com.javalec.childrenhouse;

public abstract class LunchMenu {
	public int rice;
	public int gogi;
	public int banana;
	public int amond;
	public int milk;
	public LunchMenu(int rice, int gogi, int banana, int amond, int milk) {
		// TODO Auto-generated constructor stub
		this.rice = rice;
		this.gogi = gogi;
		this.banana = banana;
		this.amond = amond;
		this.milk = milk;
	}
	public abstract int calculating();
}
