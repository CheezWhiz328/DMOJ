import java.util.Scanner;

public class ccc06s2 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String plaintext = sc.nextLine();
		String ciphertext = sc.nextLine();
		String S3 = sc.nextLine();
		char[][] map = new char [2][plaintext.length()];
		for(int i=0; i<plaintext.length(); i++){
			map[0][i] = ciphertext.charAt(i);
			map[1][i] = plaintext.charAt(i);
		}	
		for(int i=0; i<S3.length(); i++){
			boolean flag = true;
			for(int j=0; j<plaintext.length(); j++){			
				if(map[0][j]==S3.charAt(i)){
					System.out.print(map[1][j]);
					flag = !flag;
					break;
				}
			}if(flag){
				System.out.print(".");
			}else{
				
			}
		}
		
		
		
	}
}