package com.puruem.rice;

public class MainClass {
	public static void main(String[] args) {
		RiceCup rice = new RiceCup();
		Producer p1 = new Producer(rice);
		Customer c1 = new Customer(rice);
		p1.start();
		c1.start();
	}
}
