import java.util.Scanner;

public class TheMostImportantSkillInBiology {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double b[][] = new double[a][2];
		for(int i=0; i<a; i++) {
			for(int j=0; j<2; j++) {
				b[i][j] = sc.nextDouble();
			}	
		}
		double area=0;
		int j = a - 1;
		for (int i = 0; i < a; i++) {
			area += (b[j][0] + b[i][0]) * (b[j][1] - b[i][1]);
			j = i;
		}
		System.out.println((int)(Math.ceil(Math.abs(area/2))));
	}

}