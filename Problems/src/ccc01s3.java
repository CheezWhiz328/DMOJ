import java.util.*;
import java.io.*;

public class ccc01s3 {
	static boolean grid[][] = new boolean[26][26];

	static boolean bfs(int a, int b) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(0);
		boolean vis[][] = new boolean[26][26];
		while (!queue.isEmpty()) {
			int cur = queue.poll();
			for (int i = 0; i < 26; i++) {
				if (grid[cur][i]&& !vis[cur][i]) {
					vis[cur][i] = true;
					queue.add(i);
				}
			}
		}
//		for (int i = 0; i < 26; i++) {
//			for (int j = 0; j < 26; j++) {
//				if (vis[i][j])
//					System.out.println((char) (i + 'A') + "" + (char) (j + 'A'));
//			}
//		}
//		System.exit(0);
		for(int i=0; i<26; i++) {
			if(vis[1][i]) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int a[] = new int[500];
		int b[] = new int[500];
		int ind = 0;
		while (true) {
			String s = sc.next();
			if (s.equals("**")) {
				break;
			}
			grid[s.charAt(0) - 'A'][s.charAt(1) - 'A'] = true;
			grid[s.charAt(1) - 'A'][s.charAt(0) - 'A'] = true;
			a[ind] = s.charAt(0) - 'A';
			b[ind] = s.charAt(1) - 'A';
			ind++;
		}
		int count = 0;
		for (int i = 0; i < ind; i++) {
//			System.out.println(a[i]+" "+b[i]);
			grid[a[i]][b[i]] = false;
			grid[b[i]][a[i]] = false;

			if (!bfs(0, 1)) {
				count++;
				System.out.println((char) (a[i] + 'A') + "" + (char) (b[i] + 'A'));
			}
			grid[a[i]][b[i]] = true;
			grid[b[i]][a[i]] = true;
		}
		System.out.println("There are " + count + " disconnecting roads.");
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
