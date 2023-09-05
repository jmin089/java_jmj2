package p0831;

import java.util.Scanner;

public class MJ0831 {

	public static void main(String[] args) {
		//입력을 선언한거고.
		Scanner scan = new Scanner(System.in);
		
		// 이룸, 국어, 영어, 수학, 합계, 평균
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		System.out.println("이름은?");
		name = scan.next();
		System.out.println("국어점수는?");
		kor = scan.nextInt();
		System.out.println("영어점수는?");
		eng = scan.nextInt();
		System.out.println("수학점수는?");
		math = scan.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		
		System.out.printf("이름 : %s\n",name);
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d\n",kor, eng, math);
		System.out.printf("합계 : %d\n",total);
		System.out.printf("평균 : %.2f\n", avg);

	}

}
