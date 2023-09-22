package p0922;

import java.util.ArrayList;

public class J0922_01 {

	public static void main(String[] args) {
		ArrayList<StuScore> list = new ArrayList(); //<>:지네릭스
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		
		list.add(new StuScore("홍길동",100,100,100));
		list.add(new StuScore("유관순",90,90,91));
		list.add(new StuScore("이순신",88,83,80));
		//list.add(new Car("red",5));  불가능
		
		System.out.println("                      [성적처리 프로그램]");
		System.out.println("===========================================================");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],title[5],
				title[6],title[7]);
		System.out.println("===========================================================");
		
		for(int i=0;i<list.size();i++) {
			StuScore s = list.get(i);  //지네릭스하면 형변화 가능
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getStuNum(),
					s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),
					s.getAvg(),s.getRank());
		}

	}//main

}//class
