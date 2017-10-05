package com.javalec.exercise2;

import java.util.ArrayList;

import com.javalec.exercise2.Student;

public class StudentManager {
	ArrayList<Student> students = new ArrayList<Student>();;
	OutStudent outer = new OutStudent();
	public static void main(String[] args) {
		StudentManager sm = new StudentManager();		
		sm.addenroll("Çª¸§", 100);
		sm.addenroll("ÀÜµğ", 700);
		System.out.println(sm.students.get(0).getName());
		System.out.println(sm.students.get(0).getGrade());
		System.out.println(sm.students.get(1).getName());
		
		sm.students.get(0).update(2,"500");
		System.out.println(sm.students.get(0).getGrade());
		
	}
	
	public void addenroll(String name, int grade){
		students.add(new Student(name, grade));
	}
}
