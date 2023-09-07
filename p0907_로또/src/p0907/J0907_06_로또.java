package p0907;

import java.util.Arrays;
import java.util.Scanner;

public class J0907_06_로또 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 순서 ============================================================
		// 1. 선언
		// 2. 로또번호 순차입력
		// 3. 로또번호 섞기
		// 4. 6개 로또번호 추출
		// 5. 직접입력
		// 6. 당첨번호출력
		// 7. 직접입력한 번호출력
		// 8. 당첨개수
				
		// 선언 ============================================================
		int[] lotto = new int[45];
		int[] myNo = new int[6];
		int[] winNo = new int[6];
		int temp = 0, count = 0;
		
		// 로또번호 순차입력 ===================================================
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		
		// 로또번호 섞기 ======================================================
		for(int i=0;i<300;i++) {
			int random = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
		
		// 6개 로또번호 추출 ===================================================
		for(int i=0;i<6;i++) {
			winNo[i] = lotto[i];
		}
		//Arrays.sort(winNo);      //낮은숫자부터 정렬
		
		System.out.println(Arrays.toString(winNo));
		System.out.println("--------------------");
		System.out.println("      로또 번호");
		System.out.println("--------------------");
		// 직접입력 ==========================================================
		
		for(int i=0;i<6;i++) {
			System.out.println("로또번호를 입력하세요.");
			myNo[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("--------------------");
		System.out.println("      당첨 확인");
		System.out.println("--------------------");
		
		// 당첨번호출력, 직접입력한 번호출력, 당첨개수 =================================
		// 당첨번호 ==========================================================
		System.out.println("★ 당첨번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",winNo[i]);
		}
		System.out.println();
		
		// 직접입력 ==========================================================
		System.out.println("★ 직접입력번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",myNo[i]);
		}
		System.out.println();
		
		// 당첨개수 ==========================================================
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(winNo[i]==myNo[j]) {
					count++;
					break;                             //j만 끝!
				}//if
			}
		}
		
		System.out.println("※ 당첨개수 : "+count);
		
	}//main

}//class
