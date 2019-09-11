import java.util.Scanner;

public class ccc96s3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("The bit patterns are");
			String s = "";
			for(int j=0; j<b; j++) {
				s+="1";
			}for(int j=b; j<a; j++) {
				s+="0";
			}
			

			while(true) {
				int x = s.lastIndexOf("10");
				if(x==-1) {
					System.out.println(s);
					break;
				}
				String c = s.substring(x+2);
				System.out.println(s);
				s = s.substring(0,x)+"01";
				for(int j=0; j<c.length(); j++) {
					s+=c.charAt(c.length()-j-1);
				}
						
			}


		}
	}
}