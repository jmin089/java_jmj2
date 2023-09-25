package p0925;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction s = new StuAction();
		int choice = 0;
		
	loop:while(true) {
		System.out.println("=======================");
		System.out.println("      학생성적프로그램");
		System.out.println("=======================");
		System.out.println("1. 학생성적입력");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적삭제");
		System.out.println("5. 학생이름정렬");
		System.out.println("6. 학생성적정렬(높은)");
		System.out.println("7. 학생성적정력(낮은)");
		System.out.println("9. 파일가져오기");
		System.out.println("10.파일저장하기");
		System.out.println("0. 프로그램종료");
		System.out.println("=======================");
		choice = scan.nextInt();
		System.err.println();
		
		switch(choice) {
		case 1 :
			s.stuInput();
			break;
		
		case 2 :
			s.stuOutput();
			break;
			
		case 3 :
			s.stuUpDate();
			break;
	
		case 4 :
	
			break;
	
		case 5 :
	
			break;
	
		case 6 :
	
			break;
	
		case 7 :
	
			break;
			
		case 8 :
			
			break;
	
		case 9 :
	
			break;
	
		case 10 :
	
			break;
	
		case 0 :
			System.out.println("프로그램을 종료합니다.");
			System.out.println();
			break loop;	
		
		}//switch(choice)		
		
	}//loop:while

	}//main

}//class
