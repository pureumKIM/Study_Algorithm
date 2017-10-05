package com.javalec.API;

import java.util.Calendar;//임포트 해줘야 사용 가능 ^^

public class MainClass {
	public static void main(String[] args) {
		

	Calendar a = Calendar.getInstance();//싱글톤 방식
	int year = a.get(Calendar.YEAR);
	int month = a.get(Calendar.MONTH)+1;//0부터 시작하기에
	int day = a.get(Calendar.DAY_OF_MONTH);
	int hour = a.get(Calendar.HOUR_OF_DAY);
	int minute = a.get(Calendar.MINUTE);
	int second = a.get(Calendar.SECOND);
	
	System.out.println(year+"년"+month+"월"+day+"일");
	System.out.println(hour+"시"+minute+"분"+second+"초");
	}
}
