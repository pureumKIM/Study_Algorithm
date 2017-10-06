package com.pureum.robotex;

import com.pureum.robotex.inter.IFly;
import com.pureum.robotex.inter.IKnife;
import com.pureum.robotex.inter.IMissile;

public abstract class Robot {
	IFly fly;
	IMissile missile;
	IKnife knife;
	
	public abstract void shape();
	public void canWalk() {
		// TODO Auto-generated method stub
		System.out.println("걸을 수 있습니다.");
	}
	public void canRun() {
		// TODO Auto-generated method stub
		System.out.println("뛸 수 있습니다.");
	}
	
	public void actionFly() {
		// TODO Auto-generated method stub
		this.fly.howFly();
	}
	public void actionMissile() {
		// TODO Auto-generated method stub
		this.missile.whatMissile();
	}
	public void actionKnife() {
		// TODO Auto-generated method stub
		this.knife.whatKnife();
	}
	
}
