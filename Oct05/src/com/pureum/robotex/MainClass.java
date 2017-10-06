package com.pureum.robotex;

public class MainClass {
	public static void main(String[] args) {
		Robot atom = new SuperRobot();
		atom.actionFly();
		atom.actionKnife();
		atom.actionMissile();
		Robot stand = new StandardRobot();
		stand.actionFly();//null값 가지고 있다.
	}
}
