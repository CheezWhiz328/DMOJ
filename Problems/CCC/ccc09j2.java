import java.util.Scanner;

public class ccc09j2 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		int troutP = sc.nextInt();
		int pikeP = sc.nextInt();
		int pickerelP = sc.nextInt();
		int totalP = sc.nextInt();
		
		int maxTrout = totalP/troutP;
		int maxPike = totalP/pikeP;
		int maxPickerel = totalP/pickerelP;
		
		for(int i=0; i<=maxTrout; i++){
			for(int j=0; j<=maxPike; j++){
				for(int k=0; k<=maxPickerel; k++){
					if(i+j+k!=0&&i*troutP+j*pikeP+k*pickerelP<=totalP){
						count++;
						System.out.println(i+" Brown Trout, "+j+" Northern Pike, "+k+" Yellow Pickerel");
					}
					
				}
			}
		}
		
		System.out.println("Number of ways to catch fish: "+count);
			
	}
}