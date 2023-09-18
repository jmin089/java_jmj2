package p0918_학생성적;

import java.util.Scanner;

public class stuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();
		int stuCount = 1;
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		
		loop:while(true) {
			int choice = stuAction.mainPrint();
			
			switch(choice) {
			case 1:
				stuCount = stuAction.stuInput(stuCount);				
				break;
			
			case 2 : 
				stuAction.stuOutput();
				break;
			
			case 3 : 
				
				
				break;
			}//switch(choice)
	    
		}//loop:while

	}//main

}//class
