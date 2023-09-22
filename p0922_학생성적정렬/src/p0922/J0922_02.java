package p0922;

public class J0922_02 {

	public static void main(String[] args) {
		
		Week w = Week.FRIDAY;    //객체선언 (아래 String이랑 같은말 w에 FRIDAY를 입력.)
		String w2 = "FRIDAY";
		
		String weekName = w.name();  //w참조변수 데이터 이름을 가져옴.
		System.out.println(weekName);
		System.out.println(w.name());
		System.out.println(w2);
		
//		String[] kind = {"Heart","HEART","heart","hEart"};
//		for(int i=0;i<kind.length;i++) {
//			if(kind[i].equals("Heart")) {
//				System.out.println("♡");
//			}
//		}
		
	}//main

}//class
