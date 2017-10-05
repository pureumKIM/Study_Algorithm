package com.javalec.ex;

public class MainClass {
	public static void main(String[] args) {
		int i=10;
		int j=0;
		
		System.out.println(i*j);
		try{
		System.out.println(i/j);//에러가 날 것같은 로직을 기술
		}catch(Exception e){				   //try{}안에서 문제가 발생했을 때 대처 방안 기술
			System.out.println(e.getMessage());//e.printStackTrace();
		}
		System.out.println(i+j);
		System.out.println(i-j);
		
		try{
			
		}catch(ArrayIndexOutOfBoundsException a){
			
		}catch(NumberFormatException n){
			
		}catch(Exception e){
			
		}
	}
}
