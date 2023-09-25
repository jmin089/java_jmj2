package p0925;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	Scanner scan = new Scanner(System.in);
	ArrayList<StuScore> list = new ArrayList();

	void stuInput() {
		while(true) {
			int count = list.size()+1;
			System.out.println("[학생성적입력]");
			System.out.println(count+"번째 학생이름을 입력하세요.(0.이전페이지로 이동)");
			String name = scan.next();
			if(name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
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
			System.out.println("학생성적이 저장되었습니다.");
			}//while
	}//stuInput
	
	void stuOutput() {
		System.out.println("[학생성적출력]");
		System.out.println("=============================================================");
		System.out.printf("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("=============================================================");
		for(int i=0;i<list.size();i++) {
			StuScore st = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					st.getStuNum(),st.getName(),st.getKor(),st.getEng(),
					st.getMath(),st.getTotal(),st.getAvg(),st.getRank());
		}
		System.out.println();
	}//stuOutput.
	
	void stuUpDate() {
		while(true) {
			System.out.println("[학생성적수정]");
			System.out.println("수정할 학생이름을 입력하세요.(0.이전페이지로 이동)");
			String inName = scan.next();
			if(inName.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
			}
			System.out.println("입력된 이름으로 검색중입니다.");
			int i = 0;
			int count = 0;
			for(i=0;i<list.size();i++) {
				StuScore st = list.get(i);
				if(inName.equals(st.getName())) {
					System.out.println("입력된 이름으로 학생이 검색되었습니다.");
					count = 1;
					break;
				}//if
			}//for
			if(count==0) {
				System.out.println("입력된 이름으로 학생이 검색되지 않았습니다. 다시 입력하세요.");
				continue;
			}//if
			System.out.println("=======================");
			System.out.println("1.국어점수");
			System.out.println("2.영어점수");
			System.out.println("3.수학점수");
			System.out.println("=======================");
			System.out.println("원하는 번호를 입력하세요.");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("국어점수수정");
				System.out.println("=======================");
				System.out.println("현재국어점수 : "+list.get(i).getKor());
				System.out.println("변경할 국어점수를 입력하세요.");
				list.get(i).setKor(scan.nextInt());
				list.get(i).setTotal(list.get(i).getKor()+list.get(i).
						getEng()+list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal()/3.0);
				System.out.println("=======================");
				System.out.println(list.get(i).getKor()+"점으로 국어점수를 수정했습니다.");
				System.out.println();
				break;
			
			case 2:
				System.out.println("영어점수수정");
				System.out.println("=======================");
				System.out.println("현재영어점수 : "+list.get(i).getEng());
				System.out.println("변경할 영어점수를 입력하세요.");
				list.get(i).setEng(scan.nextInt());
				list.get(i).setTotal(list.get(i).getKor()+list.get(i).
						getEng()+list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal()/3.0);
				System.out.println("=======================");
				System.out.println(list.get(i).getEng()+"점으로 영어점수를 수정했습니다.");
				System.out.println();
				break;
				
			case 3:
				System.out.println("수학점수수정");
				System.out.println("=======================");
				System.out.println("현재수학점수 : "+list.get(i).getMath());
				System.out.println("변경할 수학점수를 입력하세요.");
				list.get(i).setMath(scan.nextInt());
				list.get(i).setTotal(list.get(i).getKor()+list.get(i).
						getEng()+list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal()/3.0);
				System.out.println("=======================");
				System.out.println(list.get(i).getMath()+"점으로 수학점수를 수정했습니다.");
				System.out.println();
				break;		
			}//switch
			}//while
	}
	
}//class
