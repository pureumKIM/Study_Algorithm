package ThreadTest2;

import java.util.Random;

public class VoteThread implements Runnable{

	int targetNum = 100;
	int sum =0;
	Random random = new Random();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		
		while(true){
			sum = sum + random.nextInt(10);
			sb.delete(0, sb.toString().length());//싹 지워서 초기화 해주는 과정
			if(sum>=targetNum){
				sum =100;
				for(int i=0; i<sum; i++){
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName()+" 개표율 : "+sum+"\t"+sb);
				break;
			} else{
				for(int i=0; i<sum; i++){
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName()+" 개표율 : "+sum+"\t"+sb);
			}
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
