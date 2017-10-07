package pureum.review;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTest {
	public static void main(String[] args) {
		//객체 생성, 객체 메소드로부터 받아내는방법 2가지
		//객체 생성방법
		try {
			InputStream is = new FileInputStream("C:\\Users\\Kimpureum\\Desktop\\pu.txt");
			while(true){
				int i = is.read();
				System.out.println("데이터 : "+i);
				if(i==-1) break;
				//더이상 읽을게 없으면 -1 반환
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
