package com.pureum.haksa;

import java.util.ArrayList;

public class ExpelStudent {
	ArrayList<Student> expels;
	public ExpelStudent() {
		// TODO Auto-generated constructor stub
		expels = new ArrayList<Student>();
	}
	
	public void addExpel(String name, int age, int grade) {
		// TODO Auto-generated method stub
		expels.add(new Student(name,age,grade));
	}
}
