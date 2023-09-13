package p0913;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class J0913_02_날짜시간 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//import를 사용하지 않으면 java.util.Scanner scan = new java.util.Scanner(System.in);
		int[] a = {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		String str = new String("a");    //java.lang패키지는 생략가능
		
		//날짜 객체 1
		Date today = new Date();
		System.out.println(today);

		//format설정 - yyyy/MM/dd
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(today));

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf2.format(today));
		
		//날짜 객체 2
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		System.out.println(sdf3.format(cal.getTime()));
		
		
	}//main

}//class
