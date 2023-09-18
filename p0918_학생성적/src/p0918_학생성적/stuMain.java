package p0918_학생성적;

import java.util.Scanner;

public class stuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();
		int stuCount = 1;
		
		loop:while(true) {
			int choice = stuAction.mainPrint();
			
			switch(choice) {
			case 1:
				stuCount = stuAction.stuInput(stuCount);				
				break;
			
			}//switch(choice)
	    
		}//loop:while

	}//main

}//class
