import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MimiAndChristmasCake {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean p[] = new boolean[100100 + 1];
		for (int i = 0; i < 100100; i++)
			p[i] = true;

		for (int p1 = 2; p1 * p1 <= 100100; p1++) {
			if (p[p1] == true) {
				for (int i = p1 * p1; i <= 100100; i += p1)
					p[i] = false;
			}
		}
		p[1]=false;


		
		int a = Integer.parseInt(br.readLine());
		int c = 0;
		String[] tmp = br.readLine().split(" ");
		for(int i=0; i<a; i++) {
			int b =Integer.parseInt(tmp[i]);
			if(p[b]) {
				c++;
			}
		}
		System.out.println(c);
	}
}