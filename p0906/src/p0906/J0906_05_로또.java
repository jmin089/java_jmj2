package p0906;

import java.util.Arrays;
import java.util.Scanner;

public class J0906_05_로또 {

	public static void main(String[] args) {
		// 선언 부분 ===================================================================
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];                           //전체번호
		int[] winLotto = new int[6];                         //당첨번호
		int[] myNum = new int[6];                            //내 번호
		
		// 1~45 번호 입력 ==============================================================

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}//for
		
		// 번호 섞기 ===================================================================
		
		for(int i=0;i<200;i++) {
			int random = (int)(Math.random()*45);            //0~44
			int temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}//for
		
		// 당첨번호 입력 ================================================================
		
		for(int i=0;i<6;i++) {
			winLotto[i] = lotto[i];                         //당첨번호
		}//for
		
		// 당첨번호 정렬 ================================================================
		
		Arrays.sort(winLotto);                               //순차정렬 - 낮은 숫자가 처음에 옴.
		
		// 내번호 입력 ==================================================================
		
		for(int i=0;i<6;i++) {
			System.out.println("로또번호를 입력하세요(1~45)");
			myNum[i] = scan.nextInt();
		}
		
		// 내번호정렬 ===================================================================
		
		Arrays.sort(myNum);                                 //순차정렬 - 낮은 숫자가 처음에 옴.

		// 번호 출력 ===================================================================
		
		System.out.println("--------------------------------");
		System.out.println("          로또 105호차 번호          ");
		System.out.println("--------------------------------");
		
		// 나의번호 출력 =================================================================
		
		System.out.print("◆ 나의입력번호: ");
		for(int i=0;i<myNum.length;i++) {
			System.out.print(myNum[i]+"  ");
		}
		System.out.println();
		
		// 당첨번호 출력 =================================================================
		
		System.out.print("★ 당첨 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(winLotto[i]+"  ");
		}//for
		
		System.out.println();
		
		// 당첨된 개수확인.(나중에 하기로함.)

	}// main

}// class
