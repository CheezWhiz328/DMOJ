import java.util.Scanner;

public class NewStudents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double tot = 0;
		for(int i=0; i<a; i++) {
			tot+= sc.nextDouble();
		}
		int s = sc.nextInt();
		for(int i=0; i<s; i++) {
			tot+=sc.nextDouble();
			System.out.println(tot/(a+i+1));
		}
	}
}
