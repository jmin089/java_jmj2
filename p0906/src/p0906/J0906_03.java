package p0906;

import java.util.Scanner;

public class J0906_03 {

	public static void main(String[] args) {
		//arrKor 5개짜리 배열 생성, 점수를 직접입력해서, 출력하세요.
		Scanner scan = new Scanner(System.in);
		String[] name = new String[10];
		int[] arrKor = new int[10];
		int[] arrEng = new int[10];
		int[] arrMath = new int[10];
		int[] total = new int[10];
		double[] avg = new double[10];
		int count = 0;
		
		for(int i=0;i<arrKor.length;i++) {
			System.out.println((i+1)+"번째 이름을 입력하세요.(중지하려면 : 0입력)");
			name[i] = scan.nextLine();                                //"0" String
			if(name[i].equals("0")) {
				System.out.println("입력을 중지합니다.");
				break;
			}
			System.out.println((i+1)+"번째 국어점수를 입력하세요.");
			arrKor[i] = scan.nextInt();
			System.out.println((i+1)+"번째 영어점수를 입력하세요.");
			arrEng[i] = scan.nextInt();
			System.out.println((i+1)+"번째 수학점수를 입력하세요.");
			arrMath[i] = scan.nextInt();
			scan.nextLine();
			total[i] = arrKor[i]+arrEng[i]+arrMath[i];                //합계입력
			avg[i] = total[i]/3.0;                                    //평균점수
			
			count++;
		}//for
		
		//======================================================================		
		
		System.out.println();
		System.out.println("[                       학생 성적표                       ]");
		System.out.printf("번호\t 이름\t 국어\t 영어\t 수학\t 합계\t 평균\n");
		System.out.println("--------------------------------------------------------");
		
		for(int i=0;i<count;i++) {
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\n",
					i+1,name[i],arrKor[i],arrEng[i],arrMath[i],total[i],avg[i]);
		}
		
//		System.out.printf("%s\t %d\t %d\n",name[0],arrKor[0],arrEng[0]);
//		System.out.printf("%s\t %d\t %d\n",name[1],arrKor[1],arrEng[1]);
//		System.out.printf("%s\t %d\t %d\n",name[2],arrKor[2],arrEng[2]);

//======================================================================		
		
//		System.out.print("이름은? ");
//		for(int i=0;i<name.length;i++) {
//			if(i==0) {
//				System.out.print(name[i]);
//				continue;
//			} 
//			System.out.print(","+name[i]);
//		}

//======================================================================		
		
//		System.out.println();
//		System.out.print("국어점수는 : ");
//		for(int i=0;i<arrKor.length;i++) {
//			if(i==0) {
//				System.out.print(arrKor[i]);
//				continue;
//			} 
//			System.out.print(","+arrKor[i]);
//		}

//======================================================================		
		
//		System.out.println();
//		System.out.print("영어점수는 : ");
//		
//		for(int i=0;i<arrEng.length;i++) {
//			if(i==0) {
//				System.out.print(arrEng[i]);
//				continue;			
//		    //}else {                                     //continue; 대신 사용 가능
//			//	System.out.print(","+arrKor[i]);
//			//}
//			}
//			System.out.print(","+arrEng[i]);
//		}
			
		
	}//main

}//class
