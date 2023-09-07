package p0907;

import java.util.Arrays;
import java.util.Scanner;

public class J0907_09_로또복사 {

	public static void main(String[] args) {
		// 순서 ============================================================
		Scanner scan = new Scanner(System.in);
		// 1. 선언 =========================================================
		int[] lotto = new int[45];
		int temp = 0, count = 0;
		int[] ok = new int[6];
		int[] my = new int[6];
		// 2. 로또번호 순차입력 ================================================
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		// 3. 로또번호 섞기 ===================================================
		for(int i=0;i<200;i++) {
			int random = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
		// 4. 6개 로또번호 추출 ===============================================
		for(int i=0;i<6;i++) {
			ok[i] = lotto[i];
		}
		System.out.println(Arrays.toString(ok));
		System.out.println("-----------------");
		System.out.println("------로또번호------");
		System.out.println("-----------------");
			
		// 5. 직접입력 =======================================================
		for(int i=0;i<6;i++) {
			System.out.println("번호를 입력하세요.");
			my[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("-----------------");
		System.out.println("------당첨번호------");
		System.out.println("-----------------");
		
		// 6. 당첨번호출력 ====================================================
		System.out.println("★당첨번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",ok[i]);
		}
		System.out.println();
		
		// 7. 직접입력한 번호출력 ===============================================
		System.out.println("◆입력번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",my[i]);
		}
		System.out.println();
		
		// 8. 당첨개수 =======================================================
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(ok[i]==my[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("※당첨개수:"+count);
	}

}
