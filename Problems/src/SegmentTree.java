import java.util.*;

public class SegmentTree {

	static int[] min = new int[400005];

	static void change(int left, int right, int index, int pos, int value) {

		if (left > pos || right < pos)
			return;
		if (left == right) {
			min[index] = value;
			return;
		}

		change(left, (left + right) / 2, index * 2, pos, value);

		change((left + right) / 2 + 1, right, index * 2 + 1, pos, value);

		min[index] = Math.min(min[index * 2], min[index * 2 + 1]);
	}

	static int query(int left, int right, int index, int query_left, int query_right) {

		if (query_left <= left && right <= query_right)
			return min[index];

		if (query_left > right || query_right < left)
			return (Integer.MIN_VALUE - 1);

		int lval = query(left, (left + right) / 2, index * 2, query_left, query_right);
		int rval = query((left + right) / 2 + 1, right, index * 2 + 1, query_left, query_right);
		return Math.min(lval, rval);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), q = sc.nextInt();
		int[] a = new int[100005];
		for (int l = 0; l < n; l++) {
			a[l] = sc.nextInt();
			change(0, n - 1, 1, l, a[l]);
		}

		for (int l = 0; l < q; l++) {
			char char_char_binks = sc.next().charAt(0);
			if (char_char_binks  == 'M') {
				int pos = sc.nextInt(), value = sc.nextInt();
				change(0, n - 1, 1, pos, value);
			}else {
				int query_left = sc.nextInt(), query_right = sc.nextInt();
				System.out.println(query(0, n - 1, 1, query_left, query_right));
			}
		}
	}

}