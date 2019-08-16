import java.util.*;
import java.io.*;

public class MolecularOrNonMolecular {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			String arr[] = sc.nextLine().split(" ");
			boolean y = true;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals("Cl") || arr[j].equals("Br") || arr[j].equals("Xe") || arr[j].equals("Kr")
						|| arr[j].equals("Si") || arr[j].equals("As") || arr[j].equals("Rn") || arr[j].equals("Ne")
						|| arr[j].equals("He") || arr[j].equals("H") || arr[j].equals("C") || arr[j].equals("N")
						|| arr[j].equals("O") || arr[j].equals("F") || arr[j].equals("P") || arr[j].equals("S")
						|| arr[j].equals("I")) {
				} else {
					y = false;
					break;
				}
			}
			System.out.println(y ? "Molecular!" : "Not molecular!");
		}
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
