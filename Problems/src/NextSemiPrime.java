import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NextSemiPrime {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(st.nextToken());
			while(true) {
				a++;
				int b = a;
				int count = 0;
				if(b%2==0) {
					while(b%2==0) {
						b = b/2;
						count++;
						if(count>2) {
							break;
						}
					}
				}
				
				for (int j = 3;count<2 && j*j <= b; j += 2) {
					if (b % j == 0) {
						while(b%j==0) {
							b /= j;
							count++;
						}
					}
				}if(b>1) {
					count++;
				}
				if(count==2) {
					System.out.println(a);
					break;
				}
			}
		}
	}
}