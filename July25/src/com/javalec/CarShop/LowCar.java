package com.javalec.CarShop;

public class LowCar extends StarCar{
	private int tax=1000;
	
	public LowCar(String color, String tire, int displacement, String handle) {
		// TODO Auto-generated constructor stub
		super(color,tire,displacement,handle);
	}
	
	@Override
	public void getSpec() {
		// TODO Auto-generated method stub
		System.out.println("칼라는"+color);
		System.out.println("타이어는"+tire);
		System.out.println("배기량은"+displacement);
		System.out.println("핸들은"+handle);
		
		if(displacement>2000) tax = 2000;
		System.out.println("세금은"+tax);
	}

}
