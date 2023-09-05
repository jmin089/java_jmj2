package p0905;

import java.util.Arrays;
import java.util.Scanner;

public class J0905_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] num = new int[10];                     //배열 10개 생성
		//1-100까지 랜덤숫자를 생성해서 맞추는 프로그램을 구현하시오.
		
		int random = (int)(Math.random()*100)+1;

		int i = 0;                    //초기식
		while(i<10) {
			System.out.println("숫자를 입력하세요.");
			int num1 = scan.nextInt();
			num[i] = num1;

		if(random==num1) {
			System.out.println("정답입니다.");
			break;
		}else if(random>num1) {
			System.out.println("입력한 숫자보다 큰수입니다.");
		}else {
			System.out.println("입력한 숫자보다 작은수입니다.");
		}
		
		if(i==9) {
			break;
		}
		i++;
		}//while
		
		System.out.println("입력한숫자 : ");
		
		for(int j=0;j<i;j++) {
			System.out.printf("%d ",num[j]);
		}
		
		System.out.println();
		System.out.println("랜덤 숫자 : "+random);

			
//		System.out.println(num);                     //주소값이 출력
//		System.out.println(Arrays.toString(num));    //배열의 모든값을 출력
	}//main

}//class
