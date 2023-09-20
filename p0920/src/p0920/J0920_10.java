package p0920;

public class J0920_10 {

	public static void main(String[] args) {
		String str = "swim,golf,book,run,game";
		//배열에 담아서 출력하시오.
		String[] hobby = str.split(",");
		for(int i=0;i<hobby.length;i++) {
			System.out.println(hobby[i]);
		}
		
		String str1 = "수영/골프/독서/조깅/게임";
		String[] hobby1 = str1.split("/");
		for(String h1:hobby1) {
			System.out.println(h1);
		}
		
		String str2 = "수영 골프 독서 조깅 게임";
		String[] hobby2 = str2.split(" ");
		for(String h2:hobby2) {
			System.out.println(h2);
		}
		
		String str3 = "자바-파이썬-C-자바스크립트-리엑트";
		String[] subjext = str3.split("-");
		for(String h3:subjext) {
			System.out.println(h3);
		}

	}//mian

}//class
