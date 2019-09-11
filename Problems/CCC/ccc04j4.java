import java.util.Scanner;

public class ccc04j4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Key = sc.nextLine();
		String S2 = sc.nextLine();
		String S3 = "";
		
		for(int i=0; i<S2.length(); i++){
			char c = S2.charAt(i);
			if(c>='A' && c<='Z'){				
				S3 = S3 +c;
			}
				
		}
		
		for(int i=0; i<S3.length(); i++){
			char c = S3.charAt(i);
			
			int index = i%Key.length();
			int shift = Key.charAt(index)-'A';
			char d = ((char)(S3.charAt(i)+shift));
			if(d>'Z'){
				d = (char)(d-26);
			}
			System.out.print(d);
		}
	}
}