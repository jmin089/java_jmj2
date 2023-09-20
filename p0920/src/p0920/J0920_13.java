package p0920;

public class J0920_13 {

	public static void main(String[] args) {
		
		int no = 0;
		for(int i=0;i<10;i++) {
			no += i;
		}
		System.out.println(no);
		
		//2. String 객체 반복 - 반복횟수만큼 메모리공간 사용
		String str = "aaa";
		//String str2 = new String("aaa");   윗줄이랑 두개중 하나 사용.
		for(int i=0;i<10;i++) {
			str += ""+i; 
		}
		System.out.println(str);
		
		//3. StringBuffer 객체 반복 - 1개 메모리공간 사용
		StringBuffer sb = new StringBuffer("aaa");
		for(int i=0;i<10;i++) {
			sb.append(i);     //문자를 추가 - append 사용해야 한다.
		}
		System.out.println(sb);
	
		//4. StringBuffer 비교 (오버라이딩이 안되어 있어서 equals가 정의되어 있지 않음.)
		StringBuffer sb1 = new StringBuffer("abd");
		StringBuffer sb2 = new StringBuffer("abd");
		
		if(sb1.equals(sb2)) {
			System.out.println("sb1, sb2는 같음");
		}else {
		System.out.println("sb1, sb2는 다름");
		}
		//5. String 비교 (오버라딩이 되어 있어서 equals가 정의도어 있음.)
		String s1 = sb1.toString();   //StringBuffer객체를 String으로 변환해서 비교해야함.
		String s2 = sb2.toString();
		
		if(s1.equals(s2)) {
			System.out.println("sb1, sb2는 같음");
		}else {
		System.out.println("sb1, sb2는 다름");
		}
		
	}//main

}
