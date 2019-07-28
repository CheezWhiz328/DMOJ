import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RoundingErrors {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int a = Integer.parseInt(st.nextToken());
		int Rup=0;
		int Rdown=0;
		for(int i=0; i<a; i++) {
            String[] words=in.readLine().split(" ");
            double b=Double.parseDouble(words[0]);
			if(b%1>=0.5) {
				Rup++;
			}else {
				Rdown++;
			}
		}System.out.println(Rup);
		System.out.println(Rdown);
	}
}
