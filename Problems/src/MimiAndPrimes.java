import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class MimiAndPrimes {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		LinkedList<Long> prime = new LinkedList<Long>();

		String[] tmp = br.readLine().split(" ");
		Long b = Long.parseLong(tmp[0]);
		if (b == 1) {
			System.out.println("DNE");
			System.exit(0);
		}
		if (b % 2 == 0) {
			prime.add((long) 2);
		}

		for (long i = 3; Math.sqrt(i) < b; i += 2) {
			if (b % i == 0) {
				while (b % i == 0) {
					b /= i;
				}
				prime.add(i);
			}
		}

		for (int i = 1; i < a; i++) {
			long c = Long.parseLong(tmp[i]);
			if(b%c==0) {
				break;
			}

			if (c == 1) {
				System.out.println("DNE");
				System.exit(0);
			}
			int count = 0;
			for (int j = 0; j < prime.size(); j++) {
				if (c % prime.get(j - count) != 0) {
					prime.remove(j);
					j--;
				}
			}
			if (prime.isEmpty()) {
				System.out.println("DNE");
				System.exit(0);
			}
		}
		System.out.println(prime.get(prime.size() - 1));

	}
}