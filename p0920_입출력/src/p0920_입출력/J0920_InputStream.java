package p0920_입출력;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class J0920_InputStream {

	public static void main(String[] args) {
		
		//파일에서 읽어올때 사용
		
		//byte 단위로 가져옴.
		byte[] b = new byte[1024];
		try {
			FileInputStream fis = new FileInputStream("c:/aaa/11.txt");
			fis.read(b);       //파일 읽어오기.
				System.out.println(new String(b));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//1byte 단위로 가져옴.
		//File f = new File("c:/aaa/11.txt");  //File 파일을생성하기 위한 객체
//		try {
//			FileInputStream fis = new FileInputStream("c:/aaa/11.txt");
//			int read = 0;
//			while((read = fis.read()) != -1) {   //읽은 파일이 있으면
//				System.out.println((char)read);  //2byte -> 한글지원이 안됨.
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}//main

}//class
