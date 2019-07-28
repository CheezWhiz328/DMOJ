import java.util.Scanner;

public class AddUpApples {

	static void printArray(int p[], int n) {
		System.out.print(p.length + "=");
		for (int i = n - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(p[i]);
			} else {
				System.out.print(p[i] + "+");
			}
		}
		System.out.println();
	}

	static void printAllUniqueParts(int n) {
		int count = 0;
		int[] p = new int[n];
		int k = 0;
		p[k] = n;
		while (true) {
			count++;
			if (k > 0) {
				printArray(p, k + 1);
			}

			int rem_val = 0;
			while (k >= 0 && p[k] == 1) {
				rem_val += p[k];
				k--;
			}
			if (k < 0) {
				System.out.print("total=" + (count - 1));
				return;
			}

			p[k]--;
			rem_val++;

			while (rem_val > p[k]) {
				p[k + 1] = p[k];
				rem_val = rem_val - p[k];
				k++;
			}

			p[k + 1] = rem_val;
			k++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printAllUniqueParts(n);

	}
}