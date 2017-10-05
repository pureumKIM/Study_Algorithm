package ThreadTest2;

public class MainClass {
	public static void main(String[] args) {
		VoteThread vt1 = new VoteThread();
		VoteThread vt2 = new VoteThread();
		VoteThread vt3 = new VoteThread();
		
		Thread location1 = new Thread(vt1,"loction1");
		Thread location2 = new Thread(vt2,"loction2");
		Thread location3 = new Thread(vt3,"loction3");
		
		location1.start();
		location2.start();
		location3.start();
	}
}
