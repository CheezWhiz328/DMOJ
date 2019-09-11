import java.util.Scanner;

public class ccc02s2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a%b;
		
		if(c==0){
			System.out.println(a/b);
		}else{
			int gcf = 0;
			for(int i=1; i<=b/2; i++){
				if(b%i==0&&c%i==0){
					gcf = i;
				}
			}
			
			int j = b/gcf;
			int k = c/gcf;
			if(a<b){
				System.out.println(k+"/"+j);
			}else{
				System.out.println((int)Math.floor(a/b)+" "+k+"/"+j);
			}
		}
		
		
	}
}