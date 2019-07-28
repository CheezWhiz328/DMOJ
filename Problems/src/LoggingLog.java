import java.util.Scanner;

public class LoggingLog {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		for(int i=1; i<=a; i++) {
			int b = sc.nextInt();
			int count=0;
			for(int j=0; j<b; j++) {
				count+= sc.nextInt();
			}
			if(count==0) {
				System.out.println("Weekend");
			}else {
				System.out.println("Day "+i+":"+" "+count);
			}
		}
	}
}
