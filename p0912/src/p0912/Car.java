package p0912;

public class Car {
	
	String color;
	String gearType;
	int door;
	
	Car(){
		this("whit","auto",5);  //다른생성자 호출시 this() 문장에 첫줄에 작성
	}
	
	Car(Car c) {
		this(c.color, c.gearType, c.door);  //this() -> 다른 생성자 호출
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;        //this.를 안붙이면 지역변수로 돌아감.
		this.gearType = gearType;  //this.를 붙이면 인스컨스변수로 돌아감.
		this.door = door;
	}

}
