import java.util.Scanner;

public class phantom1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int i=0; i<N; i++){
			int count = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int j=a; j<b; j++){
				int product = 0;
				for(int k=2; k<=Math.sqrt(j); k++){
					if(j%k==0){
						product++;
						break;
					}
				}
				if(product!=1&&j>1){
					count++;
				}
			}
			System.out.println(count);
		}
	
	}
}