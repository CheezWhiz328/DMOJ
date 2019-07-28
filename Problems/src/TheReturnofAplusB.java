import java.util.Scanner;

public class TheReturnofAplusB {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.nextLine());
		int[] b = new int[a];
		for (int i = 0; i < a; i++) {
			String s = sc.next();
			String s1 = sc.next();
			b[i] = s.charAt(0)+s1.charAt(0);
		}for(int i=0; i<a; i++) {
			System.out.println(b[i]);
		}

	}
}