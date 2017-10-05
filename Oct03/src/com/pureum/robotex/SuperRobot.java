package com.pureum.robotex;

import com.pureum.robotex.inter.CheapMissile;
import com.pureum.robotex.inter.FlyYes;
import com.pureum.robotex.inter.KnifeWood;

public class SuperRobot extends Robot {
	public SuperRobot() {
		fly = new FlyYes();
		missile = new CheapMissile();
		knife = new KnifeWood();
	}
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("SuperRobot의 외형으로는 팔, 다리, 몸통입니다.");
	}
}
