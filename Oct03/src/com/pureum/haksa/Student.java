package com.pureum.haksa;

public class Student {
	private String name;
	private int age;
	private int grade;
	
	public Student(String name, int age, int grade) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public void update(int i, String info) {
		// TODO Auto-generated method stub
		switch (i) {
		case 1:
			setName(info);
			break;
		case 2:
			setAge(Integer.parseInt(info));
			break;
		case 3:
			setGrade(Integer.parseInt(info));
			break;

		default:
			break;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
