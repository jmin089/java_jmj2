package p0912;

public class J0912_01 {

	public static void main(String[] args) {
		Time t = new Time();
		Data1 d1 = new Data1();
		Data2 d2 = new Data2();   //Data2 기본생성자
		Data2 d22 = new Data2(10);//Data2 매개변수가 있는 생성자
		
		Car c1 = new Car();
		System.out.println(c1.color);
		
		Car c2 = new Car("red","auto",5);
		System.out.println(c2.color);
		System.out.println(c2.gearType);

	}//main

}//class
