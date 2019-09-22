import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class primefactor {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	
		
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		for(int i=1; i<=N; i++){
			String[] token = in.readLine().split(" ");
			int a =  Integer.parseInt(token[0]);
			int b = a;
			int Fnum = 1;
			while(b%2==0){
				System.out.print("2 ");
				b=b/2;
				Fnum = Fnum*2;
			}
			for(int j=2; j<=Math.sqrt(b); j++){
				boolean flag = false;
				if(b%j==0){
					for(int k=2; k<=Math.sqrt(j); k++){
						if(j%k==0){
							flag = true;
						}
					}
					if(!flag){
						System.out.print(j+" ");
						b = b/j;
						Fnum = Fnum*j;
						j=2;
					}
				}
			}System.out.print(a/Fnum);
			System.out.println();
		}
	}
}