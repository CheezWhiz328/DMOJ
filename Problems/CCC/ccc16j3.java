import java.util.Scanner;

public class ccc16j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		int LhidPal = 0;
		for (int i = 0; i < S.length(); i++) {
			for (int j = i + 1; j <= S.length(); j++) {
				String A = S.substring(i,j);
				boolean flag = true;
				for(int ii=0; ii<A.length(); ii++) {
					if(A.charAt(ii)!=A.charAt(A.length()-1-ii)) {
						flag = false;
						break;
					}
				}if(flag&&LhidPal<A.length()) {
					LhidPal= A.length();
				}
				
			}
		}
		
		System.out.println(LhidPal);
	}
}