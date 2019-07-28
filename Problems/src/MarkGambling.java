import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MarkGambling {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int a = Integer.parseInt(st.nextToken());
		double avg = 0;
		double[] marks = new double[a];

		String[] words = in.readLine().split(" ");
		for (int i = 0; i < a; i++) {
			double c = Double.parseDouble(words[i]);
			avg += c;
			marks[i] = c;
		}
		avg = avg / a;
		Arrays.sort(marks);

		if (a % 2 == 0 && marks[(a / 2) - 1] > avg || a % 2 == 1 && marks[a / 2] > avg) {
			System.out.println("Winnie should take the risk");
		} else {
			System.out.println("That's too risky");
		}

	}
}
