package p0907;

import java.util.Arrays;

public class J0907_03 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};                //1,2,3,4,5
		int[] score = new int[5];               //0,0,0,0,0값이 들어가 있음.
		
//		score = num;                            //얕은복사, 주소복사만 복사
		
		//1.배열복사 방법 - for문 사용, 데이터값 전체를 다른 장소에 복사 ===============================================
		//for(int i=0;i<num.length;i++) {
		//	score[i] = num[i];
		//}
		
		//2. 배열복사 방법 - arraycopy 메소드 사용, 데이터값 전체를 다름 장소에 복사 ====================================
		//1)원본배열 2)위치 3)복사대상배열 4)위치 5)복사개수
		System.arraycopy(num, 1, score, 2, 2);
		num[0] = 20;
		
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(score));
		
		

	}//main

}//class
