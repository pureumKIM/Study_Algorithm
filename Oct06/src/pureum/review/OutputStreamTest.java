package pureum.review;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamTest {
	public static void main(String[] args) {
		OutputStream os =null;
		try {
			os = new FileOutputStream("C:\\Users\\Kimpureum\\Desktop\\haha.txt");
			String str = "날씨가 아주 좋네요.";
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally{
			try {
				if(os != null) os.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
