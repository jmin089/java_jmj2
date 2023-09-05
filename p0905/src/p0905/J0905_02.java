package p0905;

public class J0905_02 {

	public static void main(String[] args) {
		//1부터 10까지의 순번과 합을 출력하시오.
		int i = 0;   //순번
		int sum = 0; //합계
		
		for(i=1;i<=100;i++) {
			sum = sum + i;
			System.out.printf("순번 : %d, ",i);
			System.out.println("합계 : "+sum);
			if(sum>=200) {
				break;                            //for문 끝낸다.
			}
		}
		System.out.printf("정담 : %d, %d \n",i,sum);
		System.out.printf("이전단계 : %d, %d \n",i-1,sum-i);
	}

}
