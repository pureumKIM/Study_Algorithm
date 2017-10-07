package pureum.review;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class InOutStreamTest {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("C:\\Users\\Kimpureum\\Desktop\\pu.txt");
			os = new FileOutputStream("C:\\Users\\Kimpureum\\Desktop\\pu_copy.txt");
			while(true){
				int i = is.read();
				if(i == -1) break;
				os.write(i);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			if(is != null){
				try {
					is.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			if(os != null){
				try {
					os.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		
	}
}
