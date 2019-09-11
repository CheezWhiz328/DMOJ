import java.util.Scanner;

public class ccc08j2 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String S = "ABCDE";
		
		while(true){
			int b = sc.nextInt();
			int d = sc.nextInt();
			if(b==4&&d==1){
				for(int i=0; i<5; i++){
					System.out.print(S.charAt(i)+" ");
				}
				break;
			}
			
			for(int i=0; i<d; i++){
				if(b==1){
					S = S.substring(1, 5)+S.substring(0,1);
				}else if(b==2){
					S = S.substring(4, 5)+S.substring(0,5);
				}else{
					S = S.substring(1, 2)+S.substring(0,1)+S.substring(2, 5);
				}
			}
			
		}
		
	}
}