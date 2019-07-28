import java.io.*;
import java.util.Scanner;
//slow
public class TudorGetsAGoat {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		pw.println(a == b ? "Switch" : "Stay");
		pw.flush();

	}
}
