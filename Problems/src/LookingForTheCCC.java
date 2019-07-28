import java.util.Scanner;

public class LookingForTheCCC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		if(S.contains("CCC")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
