import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FastExponents {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int a= Integer.parseInt(in.readLine());
		for(int i=0; i<a; i++) {
			long b = Long.parseLong(in.readLine());
			if((b&b-1)==0){
				System.out.println("T");
			}else {
				System.out.println("F");
			}
		}
		
	}
}
