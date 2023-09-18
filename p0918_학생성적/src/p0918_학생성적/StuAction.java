package p0918_학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	
	int mainPrint() {
		System.out.println("========================");
		System.out.println("     [학생성적 프로그램]");
		System.out.println("1. 학생성적 입력");
		System.out.println("2. 학생성적 출력");
		System.out.println("3. 학생성적 수정");
		System.out.println("4. 학생성적 삭제");
		System.out.println("5. 학생성적 검색");
		System.out.println("6. 학생성적 등수");
		System.out.println("0. 프로그램 종료");
		System.out.println("========================");
		System.out.println("원하는 번호를 입력하세요.");
		int choice = scan.nextInt();
		return choice;
	}//mainPrint
	
	int stuInput(int stuCount) {
		while(true) {
			System.out.println();
			System.out.println("[ 학생성적 입력 ]");
			System.out.printf("%d 번째 학생 이름을 입력하세요.(0.이전페이지이동\n",stuCount);
			String name = scan.next();
			if(name.equals("0")) {
				System.out.println(">>이전페이지로 이동합니다.");
				System.out.println();
				break;
			}//if
			System.out.println("국어점수를 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			int math = scan.nextInt();
			list.add(new StuScore(name,kor,eng,math));
			System.out.printf("%d 번째 학생성적이 저장되었습니다.\n",stuCount);
			System.out.println();
			stuCount++;						
		}//while
		return stuCount;
	}//stuInput
	
	void stuOutput() {
		System.out.println();
		System.out.println("[ 학생성적 출력 ]");
		System.out.println("============================================================");
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("============================================================");
		for(int i=0;i<list.size();i++) {
			StuScore s = (StuScore)list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getStuNo(),s.getName(),s.getKor(),s.getKor(),s.getEng(),s.getMath()
					,s.getTotal(),s.getAvg(),s.getRank());
		}
		System.out.println("============================================================");
		System.out.println();
	}//stuOutput
	
	void stuUpdate() {
		while(true) {
		System.out.println();
		System.out.println("[ 학생성적 수정 ]");
		System.out.println("찾고자 하는 학생이름을 입력하세요.");
		String name = scan.next();
		if(name.equals("0")) {
			System.out.println(">>이전페이지로 이동합니다.");
			System.out.println(); 
			break;
		}
		int count = -1;
		for(int i=0;i<list.size();i++) {
			StuScore s = (StuScore)list.get(i);
			if(name.equals(s.getName())) {
				count = i;
				System.out.printf("%s 학생을 찾았습니다.\n",name);
				System.out.println("[ 수정과목 선택 ]");
				System.out.println("1. 국어");
				System.out.println("2. 영어");
				System.out.println("3. 수학");
				System.out.println("========================");
				System.out.println("원하는 번호를 입력하세요.");
				int choice = scan.nextInt();
				
				switch(choice) {
				case 1 :
					System.out.println("[ 국어과목 수정 ]");
					System.out.println("========================");
					System.out.println("현재점수 : "+s.getKor());
					System.out.println("변경할 점수를입력하세요.");
					s.setKor(scan.nextInt());
					s.setTotal(s.getKor()+s.getEng()+s.getMath());
					s.setAvg(s.getTotal()/3.0);
					System.out.println("국어점수가 변경되었습니다.");
					System.out.println();
					break;
					
				case 2 :
					System.out.println("[ 영어과목 수정 ]");
					System.out.println("========================");
					System.out.println("현재점수 : "+s.getEng());
					System.out.println("변경할 점수를입력하세요.");
					s.setEng(scan.nextInt());
					s.setTotal(s.getKor()+s.getEng()+s.getMath());
					s.setAvg(s.getTotal()/3.0);
					System.out.println("영어점수가 변경되었습니다.");
					System.out.println();
					break;
					
				case 3 :
					System.out.println("[ 수학과목 수정 ]");
					System.out.println("========================");
					System.out.println("현재점수 : "+s.getMath());
					System.out.println("변경할 점수를입력하세요.");
					s.setMath(scan.nextInt());
					s.setTotal(s.getKor()+s.getEng()+s.getMath());
					s.setAvg(s.getTotal()/3.0);
					System.out.println("수학점수가 변경되었습니다.");
					System.out.println();
					break;
				}//switch
				
			}//if
			
		}//for
		
		if(count==-1) {
			System.out.printf("※※찾고자 하는 %s 학생이 없습니다.※※ 다시 입력하세요.\n",name);
			System.out.println();
		}//if
		
	}//while
	
	}//stuUpdate
		
	
}//class
