package p0915_학생성적;

import java.util.Scanner;

public class J0915_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();
		int stuCount = 1;
		
		
		//무한반복
		while(true) {
			int choice = stuAction.mainPrinnt(); //void를 int로 바꾸고 리턴 변수명
			
			switch(choice) {
			case 1 :
				//1. 학생입력메소드(StuAcion에 메소드 있음)
				stuCount = stuAction.stuInput(stuCount);
				break;
			case 2 : 
				//1. 학생출력메소드(StuAcion에 메소드 있음)
				stuAction.stuOutput();
				break;
			case 3 :
				//3. 학생성적수정메소드(StuAcion에 메소드 있음)
				break;
			}//switch
			
		}//while
		
	}//main

}//class
