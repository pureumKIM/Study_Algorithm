package com.pureum.ThreadMoney;

public class Customer extends Thread{
	Account same_a;
	public Customer(Account a,String s) {
		// TODO Auto-generated constructor stub
		same_a=a;
		setName(s);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<200; i++){
			System.out.println(getName()+" : "+i+"번째");
			same_a.deposit();
			if(same_a.gettotal() >= 50000) break;
		}
	}
}
