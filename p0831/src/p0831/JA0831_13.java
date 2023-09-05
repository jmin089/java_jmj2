package p0831;

public class JA0831_13 {

	public static void main(String[] args) {
		int a = 1;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		System.out.println(a);
		
		int b = 10;
		int c = 10;
		b--;
		b--;
		--b;
		--b;
		--b;
		b--;  //c = b--; 일경우 -> c:5 b:4
		c=b;
		//System.out.println(b);
		//System.out.println(c);

		boolean power = true;
		System.out.println(power);  //true
		power = !power;           
		System.out.println(power);  //talse
		power = !power;
		System.out.println(power);  //true
		
		char ch = 'A';   //65
		char ch2 = 'a';  //97
		System.out.println(ch+ch2);  //65+97=102
		System.out.printf("%c,%c \n",ch,ch2);
	}

}
