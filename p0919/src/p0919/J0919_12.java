package p0919;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class J0919_12 {

	public static void main(String[] args) {
		// outstream 저장
		try {
			OutputStream os = new FileOutputStream("c:/aaa/4.txt");
			String str = "Hello, World!!";
			byte[] bytes = str.getBytes();   //getBytes():문자열을 byte단위로 분리
			for(byte b : bytes) {
			os.write(b);
		    }
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일을 저장합니다.");
		
	}//mian

}//class

