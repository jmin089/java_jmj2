package p0919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class J0919_11 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("c:/aaa/3.txt");
			BufferedReader b = new BufferedReader(fr);
			while(true) {
				String line = b.readLine();
				if(line==null) break;
				System.out.println(line);
			}
			b.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}//main

}//class
