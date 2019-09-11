import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc17j4 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tokens = in.readLine().split(" ");
		int minutes = Integer.parseInt(tokens[0]);
		int a = 1;
		int b = 2;
		int c = 0;
		int d = 0;
		int l = minutes/720;
		int count = l*31;
		if(minutes>720){
			minutes=minutes%720;
		}
		
		for(int i=0; i<=minutes; i++){
			if(a==0){
				if((d-c) == (c-b)){
					count++;
				}
			}
			else{
				if((d-c) == (c-b) && (c-b) == (b-a)){
					count++;
				}
			}d++;
			
			if(d == 10){
				d = 0;
				c++;
				if(c==6){
					c=0;
					b++;
					if(b == 10){
						a++;
						b=0;
					}
					else if(a == 1 && b == 3){
						a=0;
						b=1;
					}
				}
			} 
		}
		
		System.out.println(count);
		
	}

}