package p0921;

import java.util.ArrayList;
import java.util.Vector;

public class J0921_05 {

	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList();
		list.add(new Card(1,"Spade"));   //list.add(Object o);
		list.add(new Card(2,"Spade"));
		list.add(new Card(3,"Spade"));
		list.add(new Card(4,"Spade"));
		list.add(new Card(1,"Spade"));
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i).getKind());
			System.out.println(list.get(i).getNumber());
			//<>지네릭스 사용시
			//System.out.println(list.get(i).getNumber()+","+list.get(i).getKind());
			//<>지네릭스 미사용시
			//Card c = (Card)list.get(i);
			//System.out.println(c.getNumber()+","+c.getKind());
		}
		
//		//두가지가 같지만 ArrayList를 많이 사용.
//		ArrayList list = new ArrayList();   //싱글쓰레드 지원
//		//Vector list2 = new Vector();        //멀티쓰레드 지원
//		
//		//6개 list는 중복가능, 순서가 있음   4개 set은 중복불가능, 순서가 없음
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(1);
//		list.add(2);
//		list.add(5);
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
	}//main

}//class
