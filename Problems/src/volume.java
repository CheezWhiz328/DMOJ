import java.util.Scanner;

public class volume {
	public static double funct(int r, int h) {
		System.out.println(r*r*h*Math.PI);
		System.out.println(((double)1/3)*Math.PI*r*2*h);
		System.out.println(((double)4/3)*Math.PI*r*r*r);
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int radius = sc.nextInt();
		int height = sc.nextInt();
		funct(radius,height);
	}
}
