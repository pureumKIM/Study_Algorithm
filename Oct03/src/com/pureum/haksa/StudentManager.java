package com.pureum.haksa;

import java.util.ArrayList;

public class StudentManager {
	ArrayList<Student> students = new ArrayList<Student>();
	ExpelStudent expelStudent = new ExpelStudent();
	public static void main(String[] args) {
		StudentManager sm = new StudentManager();
		sm.addStudents("푸름", 24, 5);
		sm.addStudents("잔디", 23, 4);
		sm.addStudents("민중", 19, 3);
		System.out.println(sm.students.get(0).getName());
		sm.students.get(0).update(1, "푸댕");
		System.out.println(sm.students.get(0).getName());
	}
	
	public void addStudents(String name, int age, int grade) {
		// TODO Auto-generated method stub
		students.add(new Student(name, age, grade));
	}
}
