import java.util.Scanner;

public class ccc98s1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < a; i++) {
			String str = sc.nextLine();
			String[] hi = str.split(" ");
			for(int j=0; j<hi.length; j++) {
				if(hi[j].length()==4) {
					hi[j]= "****";
				}System.out.print(hi[j]+" ");
			}
			System.out.println();
			
		}
	}
}