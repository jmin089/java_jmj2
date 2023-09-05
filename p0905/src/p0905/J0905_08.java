package p0905;

import java.util.Scanner;

public class J0905_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//랜덤숫자생성 1-100
		int random = (int)(Math.random()*100)+1;
		//System.out.println("임시 : "+random);
		System.out.println("[ 숫자 맞추기 게임 ]");
		//숫자 맞추기
		while(true) {
			System.out.println("1-100사이의 숫자를 입력하세요.");
			int num = scan.nextInt();
			if(random==num) {
				System.out.println("정답입니다.");
				break;
			}else if(random>num) {
				System.out.println("입력한 숫자보다 큰수입니다.!!");
			}else {
				System.out.println("입력한 숫자보다 작은수입니다.!!");
			}
		}
		System.out.println("랜덤숫자 : "+random);
		
//whiel문 무한반복		
//		int i =0;
//		while(true) {
//			System.out.println(i);
//			i++;
//		}
		
//for문 무한반복	
//		int i = 0;
//		for(;;) {
//			System.out.println(i);
//		}

//for문 무한반복	
//		int i = 0;
//		for(i=0;;i++) {
//		System.out.println(i);
//		}

	}//main

}//class
