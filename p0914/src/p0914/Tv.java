package p0914;

public class Tv extends Product {
	
	String size;
	
	Tv() {
		name = "삼성TV";
		price = 1000000;
		bonusPoint = 10000;
		size = "70인치";
	}
	@Override
	public String toString() {
		return String.format("%s,%d,%d",name,price,bonusPoint);
	}

}
