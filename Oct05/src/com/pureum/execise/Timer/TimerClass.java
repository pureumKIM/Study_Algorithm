package com.pureum.execise.Timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerClass{
	public TimerClass() throws InterruptedException  {
		// TODO Auto-generated constructor stub
		Timer time = new Timer();

		TimerTask w1 = new Worker1();
		TimerTask w2 = new Worker2();
		
		time.schedule(w1, 2000);
		time.schedule(w2, 8000);
		
		Thread.sleep(11000);
		System.out.println("끝");
	}

}
