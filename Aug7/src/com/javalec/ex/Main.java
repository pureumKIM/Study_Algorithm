package com.javalec.ex;

public class Main {
	public static void main(String[] args) {
		int i=10;
		try{
		System.out.println(i);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("무조건 실행 합니다.");
		}
	}
}
