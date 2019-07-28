import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double sum = 0;
		for (int i = 0; i < a; i++) {
			double b = sc.nextDouble();
			sum += b;
		}
		sum=sum/a;
		if(a==1) {
			System.out.println((int)sum+".0");
		}else {
			int k = (int) ((sum*10)%10);
			System.out.println((int)sum+"."+k);
		}
	}
}