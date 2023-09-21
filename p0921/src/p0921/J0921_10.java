package p0921;

public class J0921_10 {

	public static void main(String[] args) {
		ColAction2 co2 = new ColAction2();
		
		Card[] card = co2.Insert();
		for(int i=0;i<card.length;i++) {
			System.out.println(card[i].getKind()+","+card[i].getNumber());
		}
		

	}//main

}//class
