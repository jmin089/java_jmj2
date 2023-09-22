package p0922;

import java.util.ArrayList;
import java.util.HashMap;

public class J0922_03 {

	public static void main(String[] args) {
		int n1 = 1000;
		int n2 = 125;
		int a = 1;
		
//		String color = "white";
//		int door = 5;
		
		String[] color = {"white","red","blue"};
		int[] door = {5,4,5};
		
		String[] name = {"홍길동","유관순","이순신"};
		int[] kor = {100,90,80};
		int[] eng = {90,80,70};
		int[] math = {80,70,60};
	
		//매개변수6개 -> 리턴 map타입으로 받음.
		JAction j = new JAction();   //객체선언
		//j.cal(color, door);     //매개변수로 값을 넘겨줄수 있음.(매개변수)
		HashMap<String, Object> map = j.cal(color, door, name, kor, eng, math);     //매개변수로 값을 넘겨줄수 있음.(매개변수)
		ArrayList<Car> list = (ArrayList<Car>) map.get("list");
		for(int i=0;i<list.size();i++) {
			Car c = (Car)list.get(i);
			System.out.printf("%s,%d\n",c.getColor(),c.getDoor());
		}
		
		ArrayList<StuScore> list2 = (ArrayList<StuScore>) map.get("list2");
		for(int i=0;i<list2.size();i++) {
			StuScore s = (StuScore)list2.get(i);
			System.out.printf("%s,%d,%d,%d\n",s.getName(),s.getKor(),
					s.getEng(),s.getMath());
		}
		
		//매개변수2개 -> 리턴 list타입으로 받음.
//		JAction j = new JAction();   //객체선언
//		//j.cal(color, door);     //매개변수로 값을 넘겨줄수 있음.(매개변수)
//		ArrayList<Car> list = j.cal(color, door);
//		for(int i=0;i<list.size();i++) {
//			Car c = (Car)list.get(i);
//			System.out.printf("%s,%d\n",c.getColor(),c.getDoor());
//		}
		
		//n1,n2를 JAtion cal()로 보내서
		//곱한 결과값을 리턴해서 출력
		
		//매개변수2개 -> 리턴 객체타입으로 받음.
//		JAction j = new JAction();   //객체선언
//		//j.cal(color, door);     //매개변수로 값을 넘겨줄수 있음.(매개변수)
//		Car c = j.cal(color, door);     //매개변수로 값을 넘겨줄수 있음.(매개변수)
//		System.out.printf("%s,%d\n",c.getColor(),c.getDoor());
		
		
		//매개변수2개 -> 리턴 배열타입으로 받음.
//		JAction j = new JAction();   //객체선언
//		//j.cal(n1,n2);     //매개변수로 값을 넘겨줄수 있음.(매개변수)
//		int[] result = j.cal(n1,n2);
//		for(int i=0;i<result.length;i++) {
//			System.out.println(result[i]);
//		}
		
		
		//매개변수2개 -> 리턴 int타입으로 받음.
//		JAction j = new JAction();   //객체선언
//		//j.cal(n1,n2);     //매개변수로 값을 넘겨줄수 있음.(매개변수)
//		int result = j.cal(n1,n2);     //리턴타입으로 받아옴.
//		System.out.println("결과값 : "+result);
		

	}//main

}//class
