package p0905;

public class J0905_09 {
	
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
//		while(true) {    //무한반복
//			System.out.println("i : "+i);
//			System.out.println("sum : "+sum);
//			if(sum>200) {
//				break;
//			}
//			i++;
//			sum = sum + i;
//		}
		sum = 0;
		for(i=1;i<=100;i++) {
			System.out.println("i : "+i);
			System.out.println("sum : "+sum);
			sum = sum + i;
			if(sum>200) {
				break;
			}
		}
		
//		--------------------------------------------------

//		int i = -10;
//		do {
//			System.out.println(i);
//		}while(i>0);
		
//		--------------------------------------------------
		
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		}

	}//main

}//class
