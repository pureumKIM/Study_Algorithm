package com.javalec.exercise2;

import java.util.ArrayList;

public class OutStudent {
	ArrayList<Student> outers;
	
	public OutStudent() {
		// TODO Auto-generated constructor stub
		outers = new ArrayList<Student>();
	}
	
	public void outenroll(String name, int grade){
		outers.add(new Student(name,grade));
	}
}
