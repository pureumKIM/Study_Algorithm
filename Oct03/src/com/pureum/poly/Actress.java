package com.pureum.poly;

public class Actress implements Teacher, Cook, FireFiter {

	@Override
	public void PutOffFire() {
		// TODO Auto-generated method stub
		System.out.println("불을 끌 수 있습니다.");
	}

	@Override
	public void makePizza() {
		// TODO Auto-generated method stub
		System.out.println("피자를 만들 수 있습니다.");
	}

	@Override
	public void makePasta() {
		// TODO Auto-generated method stub
		System.out.println("파스타를 만들 수 있습니다.");
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("학생을 가르칩니다.");
	}

}
