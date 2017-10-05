package com.pureum.ThreadMoney;

public class MainClass {
	public static void main(String[] args) throws Exception {
		Account same_account = new Account();
		Customer donator1 = new Customer(same_account, "1번쨰 기부자");
		Customer donator2 = new Customer(same_account, "2번쨰 기부자");
		Customer donator3 = new Customer(same_account, "3번쨰 기부자");
		Customer donator4 = new Customer(same_account, "4번쨰 기부자");
		Customer donator5 = new Customer(same_account, "5번쨰 기부자");
		donator1.start();
		donator2.start();
		donator3.start();
		donator4.start();
		donator5.start();
		donator1.join();
		donator2.join();
		donator3.join();
		donator4.join();
		donator5.join();
		System.out.println("총 기부액은"+same_account.gettotal());
	}
}
