package p0906;

import java.util.Arrays;
import java.util.Scanner;

public class J0906_연습_로또 {

	public static void main(String[] args) {
		// 선언 부분 ===================================================================
		
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] ok = new int[6];
		int[] my = new int[6];
		
		// 1~45 번호 입력 ==============================================================
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		
		// 번호 섞기 ===================================================================
		
		for(int i=0;i<100;i++) {
			int random = (int)(Math.random()*45);
			int temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
		
		// 당첨번호 입력 ================================================================	
		
		for(int i=0;i<6;i++) {
			ok[i] = lotto[i];
		}
		
		// 당첨번호 정렬 ================================================================
		
		Arrays.sort(ok);
		
		// 내번호 입력 ==================================================================
		
		for(int i=0;i<6;i++) {
			System.out.println("로또번호를 입력하세요(1~45)");
			my[i] = sc.nextInt();
		}
		
		// 내번호정렬 ===================================================================
		
		Arrays.sort(my);
		
		// 번호 출력 ===================================================================
		
		System.out.println("------------------------");
		System.out.println("    로또 516회차 당첨번호    ");
		System.out.println("------------------------");
		
		// 나의번호 출력 =================================================================
		
		System.out.print("★나의 번호 : " );
		for(int i=0;i<my.length;i++) {
			System.out.print(my[i]+"  ");
		}
		System.out.println();                       //줄바꿈
		
		// 당첨번호 출력 =================================================================
		
		System.out.print("☆당첨 번호 : ");
		for(int i=0;i<ok.length;i++) {
			System.out.print(ok[i]+"  ");
		}
	
	}//main

}//class
