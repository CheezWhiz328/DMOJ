import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringFinding {
	void findStr(String p, String t) {
		boolean c = false;
		int M = p.length();
		int N = t.length();

		int pref[] = new int[M];
		int j = 0;
		prefArr(p, M, pref);
		for(int i=1; i<=N; i++) {
			i--;
			if (p.charAt(j) == t.charAt(i)) {
				i++;
				j++;
			}
			if (j == M) {
				System.out.println(i - j);
				c = true;
				break;
			}else if (i < N && p.charAt(j) != t.charAt(i)) {
				if (j == 0) {
					i++;
				}else {
					j = pref[j - 1];
				}
			}
		}

		if (!c) {
			System.out.println(-1);
		}
	}

	void prefArr(String p, int M, int pref[]) {
		int len = 0;
		pref[0] = 0; 
		for(int i=2; i<=M; i++) {
			i--;
			if (p.charAt(i) == p.charAt(len)) {
				len++;
				pref[i] = len;
				i++;
			} else {
				if (len != 0) {
					len = pref[len - 1];
				} else {
					pref[i] = len;
					i++;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		String a = in.readLine();
		new StringFinding().findStr(a, s);
	}
}
