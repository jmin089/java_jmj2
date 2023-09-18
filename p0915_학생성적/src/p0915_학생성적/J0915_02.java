package p0915_학생성적;

import java.util.Scanner;

public class J0915_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();
		int stuCount = 1;
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		
		
		//무한반복
		loop:while(true) {
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
				stuAction.stuUpdate();							
				break;
				
			case 4 :
				//4. 학생성적삭제메소드(StuAcion에 메소드 있음)
				stuAction.stuDelete();							
				break;
			
			case 5 :
				//5. 학생성적검색메소드(StuAcion에 메소드 있음)
				stuAction.stuSearch();											
				break;
				
			case 6 :
				//6. 등수처리
				System.out.println();
				System.out.println("[학생성적 등수처리]");
				System.out.printf("등수처리를 진행할까요?(0.이전페이지 이동)\n");
				System.out.println("1. 예");
				System.out.println("2. 아니오");
				System.out.println("0. 이전페이지 이동");
				choice = scan.nextInt();
				switch(choice) {
				case 1 : 
					for(int i=0;i<stuAction.list.size();i++) {
						int count = 1;
						Stuscore s = (Stuscore)stuAction.list.get(i);
						for(int j=0;j<stuAction.list.size();j++) {
						Stuscore s2 = (Stuscore)stuAction.list.get(j);
							if(s.getTotal()<s2.getTotal()) {
								count++;
							}//if
						
						}//for[j]
						s.setRank(count);  //등수처리
					}//for[i]
					System.out.println("등수처리가 완료되었습니다.");
					System.out.println();
				break;
				case 2 :
					System.out.println("등수처리가 취소되었습니다.");
					System.out.println();
				break;
				
				case 0 : 
					System.out.println("이전페이지로 이동합니다.");
					System.out.println();
				break;
				}//switch
				
				break;//case 6
				
			case 0 :
				//0. 종료
				System.out.println();
				System.out.println("[프로그램종료]");
				System.out.printf("프로그램을 종료합니다.\n");
				break loop;
				
				
			}//switch
			
		}//while
		
	}//main

}//class
