package p0922;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		StuAction s = new StuAction();
		int choice = 0;
		
		//파일가져오기.
		s.stuFOpen();
		s.StuOutput();   //실행하자마자 나오게 하고싶을때
				
		loop:while(true) {
			System.out.println("================");
			System.out.println("[학생성적처리 프로그램]");
			System.out.println("================");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적삭제");
			System.out.println("5. 학생이름정렬");
			System.out.println("6. 합계점수정렬(높은)");
			System.out.println("7. 합계점수정렬(낮은)");
			System.out.println("8. 파일가져오기");
			System.out.println("9. 파일저장하기");
			System.out.println("10.학생등수처리");
			System.out.println("0. 프로그램종료");
			System.out.println("================");
			choice = scan.nextInt();
			//String strCh = JOptionPane.showInputDialog("원하는 번호를 입력하세요");
			//choice = Integer.parseInt(strCh);
			System.out.println();
			
			switch(choice) {
			case 1:          //학생성적입력
				s.StuInput();
				break;
				
			case 2:          //학생성적출력
				s.StuOutput();
				break;
				
			case 3:          //학생성적수정
				s.stuUpdate();
				break;
				
			case 4:          //학생성적삭제
				s.stuDelete();
				break;
			
			case 5:          //학생이름정렬
				s.stuNameSort();
				break;
				
			case 6:          //합계점수정렬(높은)
				s.stuTotalHighSort();
				break;
				
			case 7:          //합계점수정렬(낮은)
				s.stuTotalLowSort();
				break;
				
			case 8:          //파일가져오기
				s.stuFOpen();
				break;
				
			case 9:          //파일저장하기
				s.stuFSave();
				break;
				
			case 10:          //파일저장하기
				s.stuRank();
				break;
				
			case 0:
				System.out.println("[프로그램 종료]");
				System.out.println();
				break loop;
			}//switch
			
		}//while
		
	}//main

}//class
