package p0920;

public class J0920_15 {

	public static void main(String[] args) {
		int a = -5;
		System.out.println(Math.abs(a));
		
		System.out.println("==================");
		double b = 12.912;
		System.out.println(Math.ceil(b));    //소수점 첫째자리 올림.
		System.out.println(Math.floor(b));   //소수점 첫째자리 버림.
		System.out.println(Math.round(b));   //반올림 (리턴값이 long 임. 소수점이 없음.
		
		System.out.println("==================");
		int no1 = 10;
		int no2 = 15;
		int no3 = 13;
		
		System.out.println(Math.max(no1, no2));   //최대값추출
		System.out.println(Math.min(no1, no2));   //최소값추출
		
		//no1,no2,no3 최대값과 최소값을 출력하시오.

		System.out.println(Math.max(Math.max(no1, no2),no3));   //최대값추출
		System.out.println(Math.min(Math.min(no1, no2),no3));   //최소값추출
		
		//no1,no2,no3 적은숫자 순으로 출려하시오. 10,13,15
		
		
		
	}

}
