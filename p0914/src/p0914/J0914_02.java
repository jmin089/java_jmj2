package p0914;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class J0914_02 {

	public static void main(String[] args) {
		
		//원하는 타입으로 여러타입을 만들수 있음.
		Date d = new Date(); //객체선언
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss"); //동일하여 날짜는대문자 시간(분)은소문자
		System.out.println(sdf.format(d));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf2.format(d));
		SimpleDateFormat sdf3 = new SimpleDateFormat("yy-MM-dd hh시 mm분 ss초");
		System.out.println(sdf3.format(d));
				
		//Calendar c = new calendar(); //에러 객체선언
		//하나의 타입으로만 지정되어 하나의 타입으로만 만들수 있음.
		Calendar cal = Calendar.getInstance(); //싱글톤(하나의 객체를 사용하는거) 패턴
		System.out.println(cal.getTime());
		
	}//main

}//class
