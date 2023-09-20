package p0920;

public class Student {
	
	Student(){}
	Student(int stuNum){
		this.stuNum = stuNum;
	}
	//새로운 객체 생성
	Student(Student s){
		this.stuNum = s.getStuNum();
	}
	
	private int stuNum;

	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		stuNum = stuNum;
	}
	
	public boolean equals(Object obj) {
		boolean temp = false;
		Student s2 =(Student)obj;
		if(this.stuNum==s2.getStuNum()) {
			temp=true;
		}
		return temp;
	}

	
}
