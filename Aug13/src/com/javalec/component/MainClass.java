package com.javalec.component;

import java.awt.Dimension;

public class MainClass {
	public static void main(String[] args) {
		//버튼이 갖는 최소의 사이즈
		MakeBtn btn = new MakeBtn();
		btn.setSize(new Dimension(200,200));
		btn.setVisible(true);
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		btn.setVisible(false);//2초 보여주고 없애기
		btn.dispose();// 자원을 해제한다.
		
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.exit(0);
	}
}
