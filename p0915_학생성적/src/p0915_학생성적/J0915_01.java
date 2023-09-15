package p0915_학생성적;

import java.util.Scanner;

public class J0915_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[하이마켓 쇼핑몰 로그인]");
		String id = "aaa";
		String pw = "1111";
		String name = "홍길동";
		
		Buyer b1 = new Buyer(id,name);
		int choice = 0;
		loop:while(true) {
			System.out.println("[하이마켓 가전 쇼핑몰]");
			System.out.println("1. TV");
			System.out.println("2. 컴퓨터");
			System.out.println("3. 오디오");
			System.out.println("4. 세탁기");
			System.out.println("5. 현재잔액조회");
			System.out.println("6. 총구매목록");
			System.out.println("7. 금액충전");
			System.out.println("0. 프로그램종료");
			System.out.println("================");
			System.out.println("구매를 원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1 :
				productBuy("Tv",b1);
				break;
				
			case 2 :
				productBuy("컴퓨터",b1);
				break;
				
			case 3 :
				productBuy("오디오",b1);
				break;
				
			case 4 :
				productBuy("세탁기",b1);
				break;
				
			case 5 :
				System.out.println("[잔액조회]");
				System.out.println("=========");
				System.out.printf("%s님 현재잔액 : %,d원 \n",name, b1.money);
				System.out.println();
				break;
				
			case 6 :	
				System.out.println("[상품구매목록]");
				System.out.println("=========");
				for(int i=0;i<b1.list.size();i++) {
					Product p = (Product)b1.list.get(i);
					if(i==0) {
						System.out.printf("%s",p.name);
						continue;
					}
					System.out.printf(" ,%s",p.name);
				}
				System.out.println();
				System.out.println("=========");
				System.out.println();
				break;
			
			case 7 :
				System.out.println("[금액충전]");
				System.out.println("=========");
				System.out.println("충전하려는 금액을 입력하세요.");
				int coin = scan.nextInt();
				b1.money += coin;
				System.out.println("=========");
				System.out.printf("충전금액 : %,d원 \n",coin);
				System.out.printf("충전후잔액 : %,d원 \n",b1.money);
				System.out.println("=========");
				System.out.println();
				break; 
				
			case 0 :
				System.out.println("[ 프로그램종료 ]");
				System.out.println("================");
				System.out.println("프로그램을종료합니다!!");
				System.out.println();
				break loop;
				
				
			}
		}//while
		
	}//main

	static void productBuy(String pName, Buyer b1) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("[%s 구매]\n",pName);
		System.out.println("결제를 진행할까요?(1.예 2.아니요)");
		int choice = scan.nextInt();
		if(choice==1) {
			int check = 0;
			if(pName.equals("Tv"))
				check = b1.buy(new Tv());
			else if(pName.equals("컴퓨터"))
				check = b1.buy(new Computer());
			else if(pName.equals("오디오"))
				check = b1.buy(new Audio());
			else if(pName.equals("세탁기"))
				check = b1.buy(new Washing());
			
			if(check==0) return;
			System.out.printf("%s를 구매하셨습니다.\n",pName);
			System.out.printf("구매후 잔액 : %,d \n",b1.money);
		}else {
			System.out.printf("%s구매를 취소하셨습니다.\n",pName);
			System.out.println();
		}//if
		
	}//static
	
}//class
