import java.util.Scanner;

public class geometry1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		for(int i=0; i<f; i++) {
			double a1 = sc.nextDouble();
			double a2 = sc.nextDouble();
			double b1 = sc.nextDouble();
			double b2 = sc.nextDouble();
			double c1 = sc.nextDouble();
			double c2 = sc.nextDouble();
			System.out.print(Math.abs(a1*(b2-c2)+b1*(c2-a2)+c1*(a2-b2))/2+" ");
			double perimeter = Math.sqrt((a1-b1)*(a1-b1)+(a2-b2)*(a2-b2)) + (Math.sqrt((b1-c1)*(b1-c1)+(b2-c2)*(b2-c2))) + Math.sqrt((a1-c1)*(a1-c1)+(a2-c2)*(a2-c2));

			System.out.print(perimeter);
			System.out.println();
		}
	}
}