import java.util.Scanner;

public class MimiandVideoGames {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), a = sc.nextInt(), R = sc.nextInt();
		System.out.println(Math.min(R/a, N));
	}
}
