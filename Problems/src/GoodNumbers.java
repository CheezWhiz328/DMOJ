import java.util.Scanner;

public class GoodNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int k = (int) Math.ceil(Math.sqrt(b));
			if (b == 2) {
				count++;
			} else if (b == 1||b%2==0) {
				
			} else {
				boolean prime = true;
				for (int j = 3; j < k+1; j += 2) {
					if (b % j == 0) {
						prime = false;
						break;
					}
				}
				if (prime) {
					String c=Integer.toString(b);
					int digit_count = 0;
					for(int l=0; l<c.length(); l++) {
						digit_count+=c.charAt(l)-48;
					}if(digit_count==2) {
						count++;
					}else if(digit_count%2==0) {
						
					}else {
						for(int x=3; x<Math.sqrt(digit_count)+1; x+=2) {
							if(digit_count%x==0) {
								prime=false;
								break;
							}
						}if(prime) {
							count++;
						}
					}
					
				}
			}

		}
		System.out.println(count);
	}
}
