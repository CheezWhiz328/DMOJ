import java.io.*;
import java.util.*;

public class APaintingProblem {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int blue = 0;
		int i = K;
		while(--i>=0){
			boolean a = ((N >> i) & 1) == 1 ? true : false;
			boolean b = ((M >> i) & 1) == 1 ? true : false;
			if (a ^ b) {
				blue++;
			}

		}
		System.out.println(blue + " " + (K - blue));

	}
}