package com.javalec.Timeertask;

import java.util.Timer;
import java.util.TimerTask;

public class TimerEx {
	public TimerEx() throws InterruptedException {
		// TODO Auto-generated constructor stub
		System.out.println("^^시작합니다.");
		Timer timer = new Timer(true);//끝내기 위해
		TimerTask t1 = new TimerTask1();
		TimerTask t2 = new TimerTask2();
		
		timer.schedule(t1, 2000);
		timer.schedule(t2, 10000);
		
		Thread.sleep(11000);
		System.out.println("끝");
	}
}
