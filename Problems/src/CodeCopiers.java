import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeCopiers {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean[] a = new boolean[N+1];
		for(int i=0; i<N; i++) {
			int b = Integer.parseInt(st.nextToken());
			a[b] = true;
		}
		
		int count = 0;
		for(int i=0; i<a.length; i++) {
			if(!a[i]) {
				count++;
			}
		}System.out.println(count);
		
	}
}
