package p0913;

public class Buyer {
	
	String id = "aaa";
	String name = "hong";
	int money = 10000000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		money = money - p.price;
		bonusPoint += p.bonusPoint;
	}
	
//	//Tv를 구매했을때 사용하는 메소드
//	void buy(Tv t) {
//		money = money - t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	//Computer를 구매했을때 사용하는 메소드
//	void buy(Computer c) {
//		money = money - c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	//Audio를 구매했을때 사용하는 메소드
//	void buy(Audio a) {
//		money = money - a.price;
//		bonusPoint += a.bonusPoint;
//	}
	
	
}
