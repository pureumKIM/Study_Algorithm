package com.pureum.reivew.Interface;

public class FixedStack implements IStack{
	private int stack[];
	private int tos;
	
	public FixedStack(int size) {
		// TODO Auto-generated constructor stub
		stack = new int[size];
		tos = -1;
	}
	
	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		if(tos == stack.length-1)
			System.out.println("스택이 꽉참");
		else
			stack[++tos] = item;//화살표 즉시 +1 한후 들어온 값 대입
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(tos < 0){
			System.out.println("스택이 비어있음.");
			return 0;
		}
		else return stack[tos--];//하나 꺼내주고 화살표 한칸아래로 이동
	}

}
