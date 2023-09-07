package p0907;

import java.util.Scanner;

public class J0907_02_빙고 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//score[5][5] -> 1~25까지 숫자를 입력해서 2차원 형태로 출력하시오.
		int[][] num = new int[5][5];
		int n = 0; 
		int[] temp = new int[25];
		
		//1차원배열 temp 1~25까지 숫자를 입력하시오.
		for(int i=0;i<temp.length;i++) {
			temp[i] = i+1;
		}
		//번호섞기
		for(int i=0;i<200;i++) {
			int random = (int)(Math.random()*25);
			n = temp[0];
			temp[0] = temp[random];
			temp[random] = n;			
		}
// temp 배열 출력 =========================================================
		
//		for(int i=0;i<temp.length;i++) {
//			System.out.print(temp[i]+" ");
//		}
//		System.out.println();
		
// 2차원 배열에 temp배열 입력 ================================================
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				//num[i][j] = (5*i)+j+1;             //1~25까지 숫자 생성
				num[i][j] = temp[(5*i)+j];
			}
		}
// 2차원 출력 =============================================================
		
		while(true) {              //숫자 맞추기 게임 무한반복
			System.out.println("               [숫자맞추기 게임]");
			System.out.printf("  |\t 0 \t1 \t2 \t3 \t4 \n");
			System.out.println("-------------------------------------------");
			for(int i=0;i<num.length;i++) {
				System.out.print(i+" |\t");
				for(int j=0;j<num[i].length;j++) {
					System.out.print(num[i][j]+"\t");
				}
				System.out.println();
			}

//원하는 숫자를 입력 =========================================================
			
			System.out.println("-------------------------------------------");
			System.out.println("원하는 숫자를 입력하세요.");
			int number = scan.nextInt();
			
			//모든 좌표값과 number값을 비교
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(num[i][j]==number) {
						num[i][j]=0;
						break;
					}
				}
			}
			
// 좌표를 넣어서 해당값을 0으로 변경 =============================================			
//			System.out.println("-------------------------------------------");
//			System.out.println("좌표를 입력하세요.(행)");
//			int input1 = scan.nextInt();
//			System.out.println("좌표를 입력하세요.(열)");
//			int input2 = scan.nextInt();
//			
//			//좌표 위치값을 0으로 변경
//			num[input1][input2] = 0;
			
		}//while

	}//main

}//class
