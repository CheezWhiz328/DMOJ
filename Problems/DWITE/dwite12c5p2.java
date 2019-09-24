import java.util.Scanner;

public class dwite12c5p2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int j = 0; j < 5; j++) {
			String s = sc.nextLine();
			int max = 0;
			for (int i = 1; i < s.length(); i++) {
				if (s.substring(0, i).equals(s.substring(s.length() - i, s.length()))) {
					
					max = i;
				}
				
			}
			s += s.substring(max, s.length());
			System.out.println(s);
		}
	}
}