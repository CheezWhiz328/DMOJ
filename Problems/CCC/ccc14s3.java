import java.util.Scanner;
import java.util.Stack;

public class ccc14s3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			Stack<Integer> cars = new Stack<Integer>();
			Stack<Integer> branch = new Stack<Integer>();
			for (int j = 0; j < a; j++) {
				cars.push(sc.nextInt());
			}
			boolean done = false;
			boolean possible = true;
			int pos = 1;
			while (!done) {
				if (!cars.isEmpty() && cars.peek() == pos) {
					cars.pop();
					pos++;
				} else if (!branch.isEmpty() && branch.peek() == pos) {
					branch.pop();
					pos++;
				} else if (cars.isEmpty() && branch.isEmpty()) {
					done = true;
				} else if (cars.isEmpty() && !branch.isEmpty() && branch.peek() != pos) {
					done = true;
					possible = false;
				} else {
					branch.push(cars.pop());
				}
			}

			if (possible) {
				System.out.println("Y");// for yum
			} else {
				System.out.println("N");
			}
		}
	}
}
