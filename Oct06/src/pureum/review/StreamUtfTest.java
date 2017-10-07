package pureum.review;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamUtfTest {
	public static void main(String[] args) {
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			is = new FileInputStream("C:\\Users\\Kimpureum\\Desktop\\pu.txt");
			dis = new DataInputStream(is);
			String str = dis.readUTF();
			
			os = new FileOutputStream("C:\\Users\\Kimpureum\\Desktop\\df.txt");
			dos = new DataOutputStream(os);
			dos.writeUTF(str);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
