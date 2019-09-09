import java.util.Scanner;

public class waterloof2017a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int count = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				if (i == j) {

				} else {
					for (int k = j; k < 5; k++) {
						if (j == k) {

						} else {
							if (a[i] + a[j] > a[k] && a[j] + a[k] > a[i] && a[i] + a[k] > a[j]) {
								count++;
							}
						}
					}
				}
			}
		}
		
		System.out.println(count);

	}
}