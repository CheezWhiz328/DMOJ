import java.util.Scanner;

public class Physics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		long count = 0;
		double round = 0;
		for(int i=0; i<a; i++) {
			long b = sc.nextLong();
			count+=b;
			if(b%2==0) {
				round+=0.5;
			}else {
				round+=0.49999999999;
			}
		}
		
		if((count-round-0.5)%1==0 && (count+round-0.5)%1==0){
			if((count-round+0.5)%2==0){
				System.out.println((long)Math.ceil(count-round));
			}else{
				System.out.println((long)Math.floor(count-round));
			}if((count+round+0.5)%2==0){
				System.out.println((long)Math.ceil(count+round));
			}else{
				System.out.println((long)Math.floor(count+round));
			}
		}else if((count-round-0.5)%1!=0 && (count+round-0.5)%1==0) {
			System.out.println((long)Math.round(count-round));
			if((count+round+0.5)%2==0){
				System.out.println((long)Math.ceil(count+round));
			}else{
				System.out.println((long)Math.floor(count+round));
			}
		}else if((count-round-0.5)%1==0 && (count+round-0.5)%1!=0) {
			if((count-round+0.5)%2==0){
				System.out.println((long)Math.ceil(count-round));
			}else{
				System.out.println((long)Math.floor(count-round));
			}
			
			System.out.println((long)Math.round(count+round));
		}else {
			System.out.println((long)Math.round(count-round));
			System.out.println((long)Math.round(count+round));
		}
		
	}
}