package p0912;

public class J0912_07 {

	public static void main(String[] args) {
		//좌표 (0,0),100,"원형"
		Circle c1 = new Circle();
		
		//좌표 (150,150),50,"원형"
		//Circle c2 = new Circle(new Point(150,150),50,"원형");
		Point point = new Point(100,50);         //위줄 한줄을 아래 두줄로 사용할수 있음.
		c1.draw();
		Circle c2 = new Circle(point,30,"원형");
		c2.draw();
		
		Point[] p = {
				new Point(100,100),
				new Point(140,50),
				new Point(200,100)
		};//점이 3개를 가지고 있는 배열
		
		Triangle t1 = new Triangle(p,"삼각형");
		t1.draw();
		Triangle t2 = new Triangle(new Point(10,10),
				new Point(20,20), new Point(100,100),"삼각형");
		t2.draw();
		
	}//main

}//class
