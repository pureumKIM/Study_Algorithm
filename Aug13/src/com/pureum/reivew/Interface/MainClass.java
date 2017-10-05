package com.pureum.reivew.Interface;

public class MainClass {
	public static void main(String[] args) {
		FixedStack stack1 = new FixedStack(10);
		FixedStack stack2 = new FixedStack(5);
		for(int i=0; i<10; i++)
			stack1.push(i);
		for(int i=0; i<5; i++)
			stack2.push(i);
		
		System.out.println("스택 1 꺼내볼게요^^");
		for(int i=0; i< 10; i++)
			System.out.print(stack1.pop()+"\t");
		System.out.println();
		
		System.out.println("스택 2 꺼내볼게요^^");
		for(int i=0; i< 5; i++)
			System.out.print(stack2.pop()+"\t");
		System.out.println();
	}
}
