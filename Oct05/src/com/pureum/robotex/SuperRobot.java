package com.pureum.robotex;

import com.pureum.robotex.inter.FastMissile;
import com.pureum.robotex.inter.FlyYes;
import com.pureum.robotex.inter.WoodKnife;

public class SuperRobot extends Robot {
	public SuperRobot() {
		// TODO Auto-generated constructor stub
		fly = new FlyYes();
		knife = new WoodKnife();
		missile = new FastMissile();
	}
	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("SuperRobot의 외형입니다.");
	}

}
