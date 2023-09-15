package p0915_test;

import java.util.Scanner;

public class Jtest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();  //객체선언
		int stuCount = 1;         //1번부터 시작
		
	//무한반복
		while(true) {
			int choice = stuAction.mainPrint();
		
			switch(choice) {
			case 1 :
				stuCount = stuAction.stuInput(stuCount);
				break;
				
			case 2 :
				stuAction.stuOutput();
				break;
				
			
			}//switch
			
	 	}//while
		
	}//main

}//class
