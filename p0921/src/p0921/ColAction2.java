package p0921;

public class ColAction2 {
	
	Card[] card = new Card[52];
	String[] shape = {"Spade", "Heart", "Diamond", "Clover"};
	
	void cardAll() {
		//52장의 카드를 생성해서
		for(int i=0;i<card.length;i++) {
			int number = i%13+1;
			String kind = shape[i/13];
			card[i] = new Card(number,kind);
		}
	}
	Card[] Insert() {
		cardAll();
		return card;
	}

}
