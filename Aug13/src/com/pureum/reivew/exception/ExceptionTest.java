package com.pureum.reivew.exception;

import java.io.*;


public class ExceptionTest {
	public static void main(String[] args) {
		try{
		FileReader file = new FileReader("C:\\Users\\Kimpureum\\Desktop\\pupu.txt");
		int i;
		while((i=file.read()) != -1)
			System.out.print((char)i);
		file.close();
		}catch(Exception e){
			System.out.println("예외 처리 루틴 : "+e+"파일 존재 하지 않는다.");
		}
	}
}
