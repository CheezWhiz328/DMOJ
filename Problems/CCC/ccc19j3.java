import java.util.Scanner;

public class ccc19j3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String[] S = new String[a];
		for (int i = 0; i < a; i++) {
			S[i] = sc.next();
		}
		int count;
		for (int i = 0; i < a; i++) {
			count = 0;
			for (int j = 0; j < S[i].length(); j++) {
				count++;
				if (j != S[i].length() - 1) {
					if (S[i].charAt(j) == S[i].charAt(j + 1)) {

					} else {
						System.out.print(count + " " + S[i].charAt(j) + " ");
						count = 0;
					}
				}else {
					if(S[i].charAt(j)==S[i].charAt(j-1)) {
						System.out.print(count + " " + S[i].charAt(j) + " ");
					}else {
						System.out.print("1 "+S[i].charAt(j));
					}
				}

			}
			System.out.println();
		}
	}
}
