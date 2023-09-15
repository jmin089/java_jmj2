package p0915_학생성적;

import java.util.ArrayList;

public class Buyer {
	
	Buyer(){}
	Buyer(String id, String p) {
		this.id = id;
		this.pw = pw;
	}

	String id;
	String pw;
	int money = 10000000;
	int bonusPoint = 0;
	ArrayList list = new ArrayList();
	
	int buy(Product p) {
		if(money<p.price) {
			System.out.println("[알림]잔액이 부족하여 구매할수 없습니다.");
			System.out.println();
			return 0;
		}//if
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p);
		return 1;
	}//int buy
	

}
