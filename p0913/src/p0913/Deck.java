package p0913;

public class Deck {
	
	String[] shape = {"Heart", "Spade", "Diamond", "Clover"};
	Card[] c = new Card[52];
	
	Deck() {
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(shape[i/13], i%13+1);
		}//for
	}//Deck
	
	
	//특정번호 카드 가져오기.
	Card pick(int no) {
		if (no>52) {
			System.out.println("숫자를 잘못입력하셨습니다.");
			return c[no%52];
		}//if
		return c[no];    //c - 주소값
	}//pick
	
	
	//램덤으로 카드 가져오기.
	Card pick() {
		int random = (int)(Math.random()*52);
		return c [random];
	}//pick
	void shuffle() {
		Card temp;
		for(int i=0;i<1000;i++) {
			int random = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[random];
			c[random] =temp;
					
		}
	}//void
	
	
	//모든카드출력메서드
	void CardPrint() {
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}//class
