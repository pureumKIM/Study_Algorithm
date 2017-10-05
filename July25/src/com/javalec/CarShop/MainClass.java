package com.javalec.CarShop;

public class MainClass {
	public static void main(String[] args) {
		StarCar c1 = new LowCar(CarSpec.C1,CarSpec.T1,CarSpec.D1,CarSpec.H1);
		StarCar c2 = new HighCar(CarSpec.C2,CarSpec.T2,CarSpec.D2,CarSpec.H2);
		
		c1.getSpec();
		System.out.println("---------------------------------");
		c2.getSpec();
		
	}
}
