package p0908;

import java.util.Arrays;
import java.util.Scanner;

public class J0908_01_로또퀴즈 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] winNo = new int[6];
		int[] myNo = new int[6];
		int[] myWinNo = new int[6];
		int temp = 0, count = 0;
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		
		for(int i=0;i<200;i++) {
			int random = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
		
		for(int i=0;i<6;i++) {
			winNo[i] = lotto[i];
		}
		System.out.println(Arrays.toString(winNo));
		System.out.println("--------------------");
		System.out.println("------- 로또번호 -------");
		System.out.println("--------------------");
		
		for(int i=0;i<6;i++) {
			System.out.println("로또번호를 입력하세요.");
			myNo[i] = scan.nextInt();
		}
			System.out.println();
			System.out.println("--------------------------");
			System.out.println("------    당첨 확인    ------");
			System.out.println("--------------------------");
		
		System.out.print("★ 당첨번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",winNo[i]);
		}
		System.out.println();
		
		System.out.print("◆ 입력번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",myNo[i]);
		}
		System.out.println();
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(winNo[i]==myNo[j]) {
					myWinNo[count] = winNo[i];
					count++;
					break;
				}
			}
		}
		System.out.println("◆ 당첨개수 : "+count);
		
		System.out.print("★ 맞춘번호 : ");
		for(int i=0;i<count;i++) {
			System.out.printf("%d ",myWinNo[i]);
		}


	}//main

}//class
