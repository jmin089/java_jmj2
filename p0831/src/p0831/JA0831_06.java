package p0831;

public class JA0831_06 {

	public static void main(String[] args) {
		int x = 2147483647;
		int total = 0;
		total = x + 5;
		
		System.out.println(total);   //오버풀로우
		
		int a = 1000000;
		long b = 1000000L;
		System.out.println(a+b);
		System.out.println(a*b);     //오버플로우(int의 최대값(2147483647)을 넘으면 -로 변환
		                             //예) 2147483647+5=-2147483644
		
	}

}
