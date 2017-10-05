package com.pureum.ThreadMoney;

public class Account {
	private int total =0;
	synchronized void deposit() {
		// TODO Auto-generated method stub
		total = total +1000;
	}
	int gettotal(){
		return total;
	}
}
