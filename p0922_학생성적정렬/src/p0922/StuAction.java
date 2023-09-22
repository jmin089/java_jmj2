package p0922;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StuAction {
	Scanner scan = new Scanner(System.in);
	ArrayList<StuScore> list = new ArrayList();
	
	//1.학생성적입력 메소드
	void StuInput() {
		while(true) {
			int count = list.size()+1;
			System.out.println("[[학생성적입력]]");
			System.out.println(count+"번째 학생이름을 입력하세요.(0.이전페이지 이동)");
			String name = scan.next();
			if(name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
			}
			System.out.println("국어성적을 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("영어성적을 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학성적을 입력하세요.");
			int math = scan.nextInt();
			list.add(new StuScore(name, kor, eng, math));
			System.out.println("학생성적이 저장되었습니다.");
		}//while
	}//StuInput
	
	//2.학생성적출력 메소드
	void StuOutput() {
		System.out.println("[[학생성적출력]]");
		System.out.printf("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("============================================================");
		for(int i=0;i<list.size();i++) {
			StuScore st = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					st.getStuNum(),st.getName(),st.getKor(),st.getEng(),
					st.getMath(),st.getTotal(),st.getAvg(),st.getRank());
		}
		System.out.println();
	}//StuOutput
	
	//3.학생성적수정 메소드
	void stuUpdate() {
		
	}
	
	//8.파일가져오기 메소드
	void stuFOpen() throws Exception {
		FileReader fr = new FileReader("c:/aaa/stu1.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			String[] data = line.split(",");    //,로 각 데이터값을 분리
			int stuNum = Integer.parseInt(data[0]);
			String name= data[1];
			int kor = Integer.parseInt(data[2]);
			int eng = Integer.parseInt(data[3]);
			int math = Integer.parseInt(data[4]);
			int total = Integer.parseInt(data[5]);
			double avg = Double.parseDouble(data[6]);
			int rank = Integer.parseInt(data[7]);
			list.add(new StuScore(stuNum,name,kor,eng,
					math,total,avg,rank));
		}
		br.close();
		System.out.println("저장된 파일을 가져왔습니다.");
		System.out.println();
	}//stuFOpen
	
	//9.파일저장하기 메소드
	void stuFSave() throws Exception {
		FileWriter fw = new FileWriter("c:/aaa/stu1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String strData = "";
		for(int  i=0;i<list.size();i++) {
			StuScore st = list.get(i);
			String line = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d",
					st.getStuNum(),st.getName(),st.getKor(),st.getEng(),
					st.getMath(),st.getTotal(),st.getAvg(),st.getRank());
			strData += line+"\r\n";   //1명의 학생성적을 String 변환후 strData추가 해줌.
			//System.out.println(line);
		}
		bw.write(strData);
		bw.close();
		System.out.println("학생성적을 파일에 저장했습니다.");
	}//stuFSave
	
	//5.학생이름정렬
	void stuNameSort() {
		Collections.sort(list,new Comparator<StuScore>() {
			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
	}
	
	//6.합계점수정렬 메소드(높은)
	void stuTotalHighSort() {
		Collections.sort(list,new Comparator<StuScore>() {
			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s2.getTotal()-s1.getTotal();
			}
		});
		System.out.println("정렬이 완료되었습니다.");
	}//stuTotalSort()
	
	//7.합계점수정렬 메소드(낮은)
	void stuTotalLowSort() {
		Collections.sort(list,new Comparator<StuScore>() {
			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s1.getTotal()-s2.getTotal();
			}
		});
		System.out.println("정렬이 완료되었습니다.");
	}//stuTotalSort()
	

}//class
