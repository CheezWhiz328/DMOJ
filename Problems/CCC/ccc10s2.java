import java.util.Scanner;

public class ccc10s2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String[] key = new String[k];
		String[] value = new String[k];

		for (int i=0; i<k; i++) {
			key[i] = sc.next();
			value[i] = sc.next();
		}

		String S = sc.next();
		while (true) {
			for (int i=0; i<k; i++) {
				if (S.startsWith(value[i])) {
					System.out.print(key[i]);
					S = S.substring(value[i].length());
					break;
				}
			}
			if (S.length()==0) break;
		}
	}
}