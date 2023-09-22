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
				while(true) {
					System.out.println("[[학생성적수정]]");
					System.out.println("수정할 학생이름을 입력하세요.(0.이전페이지 이동)");
					String inputName = scan.next();
					if(inputName.equals("0")) {
						System.out.println("이전페이지로 이동합니다.");
						System.out.println();
						break;
					}
					System.out.println("입력된 이름으로 검색중......");
					//list 안에 이름이 모두 있음.
					int i = 0;      //검색되었을때 위치점을 저장하는 변수
					int count = 0;  //찾는 학생이 있는지 확인하는 변수
					for(i=0;i<s.list.size();i++) {
						StuScore st = s.list.get(i);
						if(inputName.equals(st.getName())) {
							System.out.println("입력된 이름으로 학생이 검색되었습니다.");
							count = 1;
							break;   //for빠져나감.
						}//if						
					}//for
					
					if(count==0) {   //검색된 이름이 없으면 실행
						System.out.println("학생이 검색되지 않았습니다. 다시 입력하세요.");
						continue;    //switch빠져나감.
					}//if
					
					System.out.println("=================");
					System.out.println("1.국어점수");
					System.out.println("2.영어점수");
					System.out.println("3.수학점수");
					System.out.println("=================");
					System.out.println("원하는 번호를 입력하세요.");
					choice = scan.nextInt();
					switch(choice) {
					case 1:
						System.out.println("[[국어점수수정]]");
						System.out.println("=================");
						System.out.println("○ 현재 국어점수 : "+s.list.get(i).getKor());
						System.out.println("변경한 국어점수를 입력하세요.");
						//int kor = scan.nextInt();
						//s.list.get(i).setKor(kor);
						s.list.get(i).setKor(scan.nextInt()); //위 2줄을 1줄로 요약
						s.list.get(i).setTotal(s.list.get(i).getKor()+s.list.get(i).getEng()
								+s.list.get(i).getMath());
						s.list.get(i).setAvg(s.list.get(i).getTotal()/3.0);
						System.out.println("=================");
						System.out.println(s.list.get(i).getKor() + "점으로 국어점수가 수정되었습니다.");
						System.out.println();
						break;
					case 2:
						System.out.println("[[영어점수수정]]");
						System.out.println("=================");
						System.out.println("○ 현재 영어점수 : "+s.list.get(i).getEng());
						System.out.println("변경한 영어점수를 입력하세요.");
						s.list.get(i).setEng(scan.nextInt());
						s.list.get(i).setTotal(s.list.get(i).getKor()+s.list.get(i).getEng()
								+s.list.get(i).getMath());
						s.list.get(i).setAvg(s.list.get(i).getTotal()/3.0);
						System.out.println("=================");
						System.out.println(s.list.get(i).getEng() + "점으로 영어점수가 수정되었습니다.");
						System.out.println();
						break;
					case 3:
						System.out.println("[[수학점수수정]]");
						System.out.println("=================");
						System.out.println("○ 현재 수학점수 : "+s.list.get(i).getMath());
						System.out.println("변경한 수학점수를 입력하세요.");
						s.list.get(i).setMath(scan.nextInt());
						s.list.get(i).setTotal(s.list.get(i).getKor()+s.list.get(i).getEng()
								+s.list.get(i).getMath());
						s.list.get(i).setAvg(s.list.get(i).getTotal()/3.0);
						System.out.println("=================");
						System.out.println(s.list.get(i).getMath() + "점으로 수학점수가 수정되었습니다.");
						System.out.println();
						break;
					}//switch
					
				}//while
				break;
				
			case 4:          //학생성적삭제
				
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
				
			case 0:
				System.out.println("[프로그램 종료]");
				System.out.println();
				break loop;
			}//switch
			
		}//while
		
	}//main

}//class
