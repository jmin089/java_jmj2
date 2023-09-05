package p0831;

public class JA0831_07 {

	public static void main(String[] args) {
		double d = 1.6;
		int i = (int)d;    // int타입 강제형변환 - 정수부분만 입력(큰쪽(String)에서 작은쪽(char)으로 변환)
		System.out.println(i);
		
		int x = 10;
		double d2 = x;     // 자동형변환 생략가능(작은쪽(chat)에서 큰쪽(String)으로 변환)
		System.out.println(d2);
		
		//크기 순선 : char,byte,short -> int -> long -> float -> double -> String
		//double은 15자리까지만 정확하게 나옴. float은 7자리까지만 출력
		
		System.out.println(10/3.0);
		// 실수형값 %f, 정수형값 %d, 문자열값 %s
		System.out.printf("%.2f\t", 10/3.0);    // \n : 줄바꿈, \t : 사이띄움
		System.out.println("안녕하세요.");
		System.out.printf("%s \n", "홍길동입니다.");
		System.out.printf("%,09d \n", 100000);    // , 천단위표시 | 0 -> 남는자리 0으로 채움.
		System.out.printf("국어 : %d, 영어 : %d \n", 100,99);
	}

}
