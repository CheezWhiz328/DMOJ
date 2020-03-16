import java.io.*;
import java.util.*;

public class dwite07c4p2 {
	static class edge implements Comparable<edge> {
		String dis;
		int w;

		edge(int w1, String dis1) {
			dis = dis1;
			w = w1;
		}

		public int compareTo(edge o) {
			return  - (w - o.w);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = 5;
		while (t-- > 0) {
			edge[] arr = new edge[5];
			for (int i = 0; i < 5; i++) {
				arr[i] = new edge(sc.nextInt(), sc.nextLine().substring(1));
			}
			Arrays.sort(arr);
			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i].dis);
			}

		}
	}

}
