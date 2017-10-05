package com.pureum.robotex;

import com.pureum.robotex.inter.IFly;
import com.pureum.robotex.inter.IKnife;
import com.pureum.robotex.inter.IMissile;

public abstract class Robot {
	IFly fly;
	IMissile missile;
	IKnife knife;
	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public void canWalk() {
		// TODO Auto-generated method stub
		System.out.println("걸을 수 있습니다.");
	}
	public void canRun() {
		// TODO Auto-generated method stub
		System.out.println("뛸 수 있습니다.");
	}
	public abstract void shape();
	
	public void setFly(IFly fly) {
		this.fly = fly;
	}
	public void setMissile(IMissile missile) {
		this.missile = missile;
	}
	public void setKnife(IKnife knife) {
		this.knife = knife;
	}
	public void actionFly() {
		// TODO Auto-generated method stub
		this.fly.whatFly();
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
