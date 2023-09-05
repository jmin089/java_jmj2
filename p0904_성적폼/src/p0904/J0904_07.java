package p0904;

import java.util.Scanner;

public class J0904_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1부터 10까지의 랜덤숫자를 1개 생성후 출력하시오.
		int random = (int)(Math.random()*10)+1;
		//3개 숫자를 입력받아, 정답을 맞추는 프로그램을 구형하시오.
		int num1 = 0, num2 = 0, num3 = 0;
		int n1=0;
		int n2=0;
		int n3=0;
		
		//1개 입력받아 맞는 확인 정답, 오답 
		//3개의 입력값을 출력. 입력번호 : 1,9,7
		//1번째
		System.out.println("1번째 숫자를 입력하세요.");
		num1 = scan.nextInt();
		
		if(num1==random) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
		//2번째
		System.out.println("2번째 숫자를 입력하세요.");
		num2 = scan.nextInt();
		
		if(num2==random) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
		//3번째
		System.out.println("3번째 숫자를 입력하세요.");
		num3 = scan.nextInt();
		
		if(num3==random) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
		//입력한 숫자 출력
		System.out.printf("입력번호 : %d, %d, %d \n",num1, num2, num3);
		
		//정답번호 : 5
		System.out.println("정답번호 : "+random);
		
//		-----------------------------------------------------------
		
		//랜덤숫자 1-100까지 5개의 랜덤숫자를 생성해서 변수에 출력하시오. 숫자 중복가능
//		
//		int j = (int)(Math.random()*100)+1;
//		int j1 = (int)(Math.random()*100)+1;
//		int j2 = (int)(Math.random()*100)+1;
//		int j3 = (int)(Math.random()*100)+1;
//		int j4 = (int)(Math.random()*100)+1;
//		
//		System.out.println(j);
//		System.out.println(j1);
//		System.out.println(j2);
//		System.out.println(j3);
//		System.out.println(j4);
		
	}

}
