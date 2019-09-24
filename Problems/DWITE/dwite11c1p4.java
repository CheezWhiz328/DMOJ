import java.util.Scanner;

public class dwite11c1p4 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			int a = sc.nextInt();
			int count=0;
			for(int j=0; j<a+1; j++) {
				String k = Integer.toString(j);
				for(int l=0; l<k.length(); l++) {
					if(k.charAt(l)=='0') {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}