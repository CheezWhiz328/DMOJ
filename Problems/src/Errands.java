import java.util.ArrayList;
import java.util.Scanner;

public class Errands {
	public static void main(String args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();
		int C = sc.nextInt();
		for(int i=0; i<Q; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
		}
		ArrayList<Integer>[] map = new ArrayList[N];
		for(int i=0; i<map.length; i++) {
			map[i] = new ArrayList<Integer>();
		}
		int [] steps = new int[N];
		for(int i=0; i<M; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			map[u].add(u);
			map[v].add(v);
		}
	}

}
