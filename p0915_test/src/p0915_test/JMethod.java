package p0915_test;

public class JMethod {
	
	JMethod(){} //기본생성자 : 객체(new)사용할때만 사용가능.
	
	//인스턴스메소드	
	int calculate(int n1, int n2) {
		//입력받은 2개의 숫자를 4칙연산
		//받아올때 매개변수로 받아와야함.(이름이 동일하지않아도 첫번째는 첫번째에 두번째는 두번째에 받아옴.)
		//단 받아오는 이름과 받는 이름이 다를때는 헷갈릴수 있음.
		int result = n1+n2;
		int result2 = n1-n2;
		int result3 = n1*n2;
		int result4 = n1/n2;
		
		return result+result2+result3+result4;
	}
		
	int cal(int n1, int n2, int n3, int n4) {
		int result = n1+n2+n3+n4;
		int result2 = n1*n2*n3*n4;
		
		return result+result2;
				
	}//cal
	
	int cal(int[] n) {
		int result = n[0]+n[1]+n[2]+n[3];
		int result2 = n[0]*n[1]*n[2]*n[3];
		
		return result+result2;
				
	}//cal

}//class
