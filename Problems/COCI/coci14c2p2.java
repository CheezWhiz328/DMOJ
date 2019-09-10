import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class coci14c2p2 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(in.readLine());
		String[] S = new String[a];
		for(int i=0; i<a; i++) {
			S[i] = in.readLine();
		}
		String[] S1 = new String[a];
		for(int i=0; i<a-1; i++) {
			S1[i] = in.readLine();
		}
		
		S1[a-1] = "{";
		Arrays.sort(S);
		Arrays.sort(S1);
		
		for(int i=0; i<S.length; i++) {
			if(!S[i].equals(S1[i])) {
				System.out.println(S[i]);
				break;
			}
		}
	}
}