package com.javalec.childrenhouse;

public class MainClass {
	public static void main(String[] args) {

		// TODO Auto-generated constructor stub
		LunchMenu pu = new Child1(PriceTable.RICE,PriceTable.GOGI,PriceTable.BANANA,PriceTable.AMOND,PriceTable.MILK);
		LunchMenu ho = new Child3(PriceTable.RICE,PriceTable.GOGI,PriceTable.BANANA,PriceTable.AMOND,PriceTable.MILK);
		System.out.println(pu.calculating());
		System.out.println(ho.calculating());
	}


}
