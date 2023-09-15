package p0915_학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();  //전체 학생 성적 저장
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	
	//메인화면 출력부분
	int mainPrinnt() {  //void는 리턴할것이 없음. int로 변경하고 리턴
		System.out.println("=================");
		System.out.println(" [학생성적 프로그램]");
		System.out.println("=================");
		System.out.println("1.학생성적입력");
		System.out.println("2.학생성적출력");
		System.out.println("3.학생성적수정");
		System.out.println("4.학생성적삭제");
		System.out.println("5.학생성적검색");
		System.out.println("6.등수처리");
		System.out.println("0.프로그램 종료");
		System.out.println("=================");
		System.out.println("원하는 번호를 입력하세요.");
		int choice = scan.nextInt();
		return choice;
	}

	//1. 학생성적입력메소드
	int stuInput(int stuCount) {
		while(true) {
			System.out.println();
			System.out.println("[학생성적입력]");
			System.out.printf("%d 번째 학생 이름을 입력하세요.(0.이전페이지 이동)\n",stuCount);
			String name = scan.next();
			if(name.equals("0")) {  //이전페이지 이동
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
			//학생 성적 저장
			list.add(new Stuscore(name,kor,eng,math));
			System.out.printf("%d 번째 학생성적이 저장되었습니다.\n",stuCount);
			System.out.println();
			stuCount++;
		}//while
		return stuCount;
	}//stuInput
	
	//학생성적출력 메소드
	void stuOutput() {
		System.out.println();
		System.out.println("[학생성적출력]");
		System.out.println("============================================================");
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("============================================================");
		for(int i=0;i<list.size();i++) {
			Stuscore s = (Stuscore)list.get(i);
			//{"번호","이름","국어","영어","수학","합계","평균","등수"}
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
					s.getTotal(),s.getAvg(),s.getRank());
		}//for
		System.out.println("============================================================");
		System.out.println();
		
	}//stuOutput
	
}
