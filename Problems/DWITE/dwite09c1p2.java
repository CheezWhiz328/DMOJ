import java.util.Arrays;
import java.util.Scanner;

public class dwite09c1p2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int q = 0; q < 5; q++) {
			String word = sc.nextLine();
			int n = word.length();
			int factorial = 1;
			for (int i = 1; i <= word.length(); i++) {
				factorial *= i;
			}
			String[] order = new String[factorial];
			dwite09c1p2 scramble = new dwite09c1p2();
			scramble.mix(word, 0, n - 1, order, n);
		}
	}

	private int count = 0;
	private boolean flag = true;
	private void mix(String word, int y, int z, String[] hi, int k) {
		for (int i = word.length() - 1; i > 1; i--) {
			k *= i;
		}
		if (y == z) {
			hi[count] = word;
			count++;
		} else
			for (int i = y; i < z + 1; i++) {
				word = swap(word, y, i);
				mix(word, y + 1, z, hi, word.length());
				word = swap(word, y, i);
			}
		if (count == k&&flag) {
			flag=false;
			Arrays.sort(hi);
			for (int i = 0; i < k; i++) {
				System.out.println(hi[i]);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char[] charArray = a.toCharArray();
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}