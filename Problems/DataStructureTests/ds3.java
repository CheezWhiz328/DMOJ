import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ds3 {
	public static int getGcd(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;
		return getGcd(b, a % b);
	}

	static int[] gcd = new int[400000], // stores gcd of segment
			min = new int[400000], // stores minimum in segment
			count = new int[400000]; // stores number of stuff equal to gcd in segment

	// stores where each segment begins and ends
	static int[] left = new int[400000], right = new int[400000];
	static int[] data = new int[100000];

	static void push_up(int segment) {
		gcd[segment] = getGcd(gcd[segment * 2], gcd[segment * 2 + 1]);
		min[segment] = Math.min(min[segment * 2], min[segment * 2 + 1]);

		count[segment] = 0;
		// if gcd of left is equal to gcd(left,right)
		// then add the count of left to the count of the parent
		if (gcd[segment * 2] == gcd[segment]) {
			count[segment] += count[segment * 2];
		}
		// same for right child
		if (gcd[segment * 2 + 1] == gcd[segment]) {
			count[segment] += count[segment * 2 + 1];
		}
	}

	static void build(int l, int r, int segment) {
		left[segment] = l;
		right[segment] = r;

		if (l + 1 == r) {
			gcd[segment] = data[l];
			min[segment] = data[l];
			count[segment] = 1;
			return;
		}

		int mid = (l + r) / 2;
		build(l, mid, segment * 2);
		build(mid, r, segment * 2 + 1);

		push_up(segment);
	}

	static int queryMin(int l, int r, int segment) {
		// ignore segment
		if (left[segment] >= r || right[segment] <= l)
			return Integer.MAX_VALUE;

		// segment completely inside range
		if (left[segment] >= l && right[segment] <= r)
			return min[segment];

		// segment partly inside range
		return Math.min(queryMin(l, r, segment * 2), queryMin(l, r, segment * 2 + 1));
	}

	static int queryGcd(int l, int r, int segment) {
		// ignore segment
		if (left[segment] >= r || right[segment] <= l)
			return 0;

		// segment completely inside range
		if (left[segment] >= l && right[segment] <= r)
			return gcd[segment];

		// segment partly inside range
		return getGcd(queryGcd(l, r, segment * 2), queryGcd(l, r, segment * 2 + 1));
	}

	private static class Pair {
		int gcd, count;

		public Pair(int g, int c) {
			gcd = g;
			count = c;
		}
	}

	static Pair combine(Pair left, Pair right) {
		int newGcd = getGcd(left.gcd, right.gcd);

		int newCount = 0;
		// if gcd of left is equal to gcd(left,right)
		// then add the count of left to the total
		if (left.gcd == newGcd) {
			newCount += left.count;
		}
		if (right.gcd == newGcd) {
			newCount += right.count;
		}
		return new Pair(newGcd, newCount);
	}

	static Pair queryEqualGcd(int l, int r, int segment) {
		// ignore segment
		if (left[segment] >= r || right[segment] <= l)
			return new Pair(0, 0);

		// segment completely inside range
		if (left[segment] >= l && right[segment] <= r)
			return new Pair(gcd[segment], count[segment]);

		// segment partly inside range
		return combine(queryEqualGcd(l, r, segment * 2), queryEqualGcd(l, r, segment * 2 + 1));
	}

	static void update(int position, int value, int segment) {
		// updated position is not inside current segment
		if (left[segment] > position || right[segment] <= position) {
			return;
		}

		// is segment of size 1
		if (left[segment] + 1 == right[segment]) {
			gcd[segment] = value;// directly update it's values
			min[segment] = value;
			return;
		}

		// check children
		update(position, value, segment * 2);
		update(position, value, segment * 2 + 1);

		// update itself
		push_up(segment);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// read input
		String[] tmp = br.readLine().split(" ");
		int n = Integer.parseInt(tmp[0]);
		int m = Integer.parseInt(tmp[1]);

		tmp = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			data[i] = Integer.parseInt(tmp[i]);
		}

		// build before processing updates and queries
		build(0, n, 1);

		for (int i = 0; i < m; i++) {
			tmp = br.readLine().split(" ");
			if (tmp[0].equals("M")) {
				int l = Integer.parseInt(tmp[1]) - 1;
				int r = Integer.parseInt(tmp[2]);

				System.out.println(queryMin(l, r, 1));

			} else if (tmp[0].equals("G")) {
				int l = Integer.parseInt(tmp[1]) - 1;
				int r = Integer.parseInt(tmp[2]);

				System.out.println(queryGcd(l, r, 1));

			} else if (tmp[0].equals("C")) {
				int x = Integer.parseInt(tmp[1]) - 1;
				int v = Integer.parseInt(tmp[2]);

				update(x, v, 1);
			} else if (tmp[0].equals("Q")) {
				int l = Integer.parseInt(tmp[1]) - 1;
				int r = Integer.parseInt(tmp[2]);

				System.out.println(queryEqualGcd(l, r, 1).count);

			}
		}
		br.close();
	}

}
