package com.javalec.exercise2;

public class Student {
	private String name;
	private int grade;
	
	public Student(String name, int grade) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.grade = grade;
	}
	
	public void update(int i, String info){
		switch(i){
		case 1:
			setName(info);
			break;
		case 2:
			setGrade(Integer.parseInt(info));
			break;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
