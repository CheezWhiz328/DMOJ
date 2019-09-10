import java.util.Arrays;
import java.util.Scanner;

public class coci07c4p2 {
	static void swap(char a[], int i, int j) {
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static void findNext(char a[], int n) {
		int i;
		for (i = n - 1; i > 0; i--) {
			if (a[i] > a[i - 1]) {
				break;
			}
		}
		if (i == 0) {
			System.out.println(i);
		} else {
			int b = a[i - 1], min = i;

			for (int j = i+1; j < n; j++) {
				if (a[j] > b && a[j] < a[min]) {
					min = j;
				}
			}

			swap(a, i - 1, min);
			Arrays.sort(a, i, n);
			for (i = 0; i < n; i++) {
				System.out.print(a[i]);
			}
		}
	}

	public static void main(String[] ags) {
		Scanner sc = new Scanner(System.in);
		char digits[] = sc.next().toCharArray();
		findNext(digits, digits.length);
	}
}
