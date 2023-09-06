package p0906;

import java.util.Scanner;

public class J0906_연습_성적폼 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		int[] arrKor = new int[10];
		int[] arrEng = new int[10];
		int[] arrMath = new int[10];
		int[] total = new int[10];
		double[] avg = new double[10];
		int count = 0;
		
		//===============================================================
		
		loop1:while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 종   료");
			System.out.println("----------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int co = sc.nextInt();
			sc.nextLine();

		//===============================================================
		
		switch(co) {
		case 1 :
			System.out.println("[[ 성적입력 선택 ]]");
			System.out.println("---------------");
			
			for(int i=count;i<arrKor.length;i++) {
				System.out.println((i+1)+"번째 이름을 입력하세요.(중지하려면 : 0)");
				name[i] = sc.nextLine();
				if(name[i].equals("0")) {
					System.out.println("입력을 중지합니다.");
					break;
				}//if
				System.out.println((i+1)+"번째 국어점수를 입력하세요.");
				arrKor[i] = sc.nextInt();
				System.out.println((i+1)+"번째 영어점수를 입력하세요.");
				arrEng[i] = sc.nextInt();
				System.out.println((i+1)+"번째 수학점수를 입력하세요.");
				arrMath[i] = sc.nextInt();
				sc.nextLine();
				total[i] = arrKor[i]+arrEng[i]+arrMath[i];
				avg[i] = total[i]/3.0;
				
				count++;
				
			}//for
			System.out.println();
			break;
			
		//===============================================================
		
		case 2 :
			System.out.println("[[ 성적출력 선택 ]]");
		    System.out.println("---------------");
		    
		    System.out.println();
		    System.out.println("[학생 성적표]");
		    System.out.print("번호\t 이름\t 국어\t 영어\t 수학\t 합계\t 평균\n");
		    System.out.println("--------------------------------------");
		    
		    for(int i=0;i<count;i++) {
		    	System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\n",
		    			i+1,name[i],arrKor[i],arrEng[i],arrMath[i],total[i],avg[i]);
		    }
		    System.out.println();
		    break;
		
		 //===============================================================  
		    
		}//switch
		
		}//while
		
	}//main

}//class
