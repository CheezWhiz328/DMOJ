import java.io.*;
import java.util.*;

public class dwite12c2p3 {
//	static long s(int n) {
//		if (n < 3) {
//			return 1;
//		}
//
//		return s(n - 2) + s(n - 3);
//	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		long ans[] = new long[76];
		
//		for (int i = 1; i <= 75; i++) {
//			ans[i] = s(i);
//			System.out.println("ans[" + i + "] = " + ans[i] + ";");
//		}
		
		ans[1] = 1;
		ans[2] = 1;
		ans[3] = 2;
		ans[4] = 2;
		ans[5] = 3;
		ans[6] = 4;
		ans[7] = 5;
		ans[8] = 7;
		ans[9] = 9;
		ans[10] = 12;
		ans[11] = 16;
		ans[12] = 21;
		ans[13] = 28;
		ans[14] = 37;
		ans[15] = 49;
		ans[16] = 65;
		ans[17] = 86;
		ans[18] = 114;
		ans[19] = 151;
		ans[20] = 200;
		ans[21] = 265;
		ans[22] = 351;
		ans[23] = 465;
		ans[24] = 616;
		ans[25] = 816;
		ans[26] = 1081;
		ans[27] = 1432;
		ans[28] = 1897;
		ans[29] = 2513;
		ans[30] = 3329;
		ans[31] = 4410;
		ans[32] = 5842;
		ans[33] = 7739;
		ans[34] = 10252;
		ans[35] = 13581;
		ans[36] = 17991;
		ans[37] = 23833;
		ans[38] = 31572;
		ans[39] = 41824;
		ans[40] = 55405;
		ans[41] = 73396;
		ans[42] = 97229;
		ans[43] = 128801;
		ans[44] = 170625;
		ans[45] = 226030;
		ans[46] = 299426;
		ans[47] = 396655;
		ans[48] = 525456;
		ans[49] = 696081;
		ans[50] = 922111;
		ans[51] = 1221537;
		ans[52] = 1618192;
		ans[53] = 2143648;
		ans[54] = 2839729;
		ans[55] = 3761840;
		ans[56] = 4983377;
		ans[57] = 6601569;
		ans[58] = 8745217;
		ans[59] = 11584946;
		ans[60] = 15346786;
		ans[61] = 20330163;
		ans[62] = 26931732;
		ans[63] = 35676949;
		ans[64] = 47261895;
		ans[65] = 62608681;
		ans[66] = 82938844;
		ans[67] = 109870576;
		ans[68] = 145547525;
		ans[69] = 192809420;
		ans[70] = 255418101;
		ans[71] = 338356945;
		ans[72] = 448227521;
		ans[73] = 593775046;
		ans[74] = 786584466;
		ans[75] = 1042002567;

		for (int i = 0; i < 5; i++) {
			System.out.println(ans[sc.nextInt()]);
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
