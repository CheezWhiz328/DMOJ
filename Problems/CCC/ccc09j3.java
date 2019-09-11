import java.util.Scanner;

public class ccc09j3 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		a+= 2400;
		System.out.println((a) % 2400+" in Ottawa");
		System.out.println((a - 300) % 2400 +" in Victoria");
		System.out.println((a - 200) % 2400 +" in Edmonton");
		System.out.println((a - 100) % 2400 +" in Winnipeg");
		System.out.println((a) % 2400+" in Toronto");
		System.out.println((a + 100) % 2400 +" in Halifax");
		
		if((a%100)>=30) {
			System.out.println((a + 170) % 2400 +" in St. John's");
		}else {
			System.out.println((a + 130) % 2400 +" in St. John's");
		}
	}
}