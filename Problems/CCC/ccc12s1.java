import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc12s1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());	
		System.out.println(((N-1)*(N-2)*(N-3))/6);
		
	}
}