import java.util.*;
import java.io.*;

public class ecoo15r1p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		for (int t = 0; t < 10; t++) {
			int arr[] = new int[8];
			while (true) {
				String a = sc.nextLine();
				if (a.equals("end of box")) {
					break;
				}

				if (a.equals("orange")) {
					arr[0]++;
				}
				if (a.equals("blue")) {
					arr[1]++;
				}
				if (a.equals("green")) {
					arr[2]++;
				}
				if (a.equals("yellow")) {
					arr[3]++;
				}
				if (a.equals("pink")) {
					arr[4]++;
				}
				if (a.equals("violet")) {
					arr[5]++;
				}
				if (a.equals("brown")) {
					arr[6]++;
				}
				if (a.equals("red")) {
					arr[7]++;
				}
			}

			int count = 0;
			for (int i = 0; i < 7; i++) {
				count += 13 * Math.ceil(arr[i] / 7d);
			}
			count += 16 * arr[7];
			System.out.println(count);
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