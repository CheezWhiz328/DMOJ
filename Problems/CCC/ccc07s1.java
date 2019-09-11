import java.util.*;
public class ccc07s1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		for (int i=0; i<N; i++) {
			String S = sc.nextLine();
			String[] A = S.split(" ");
			int y = Integer.parseInt(A[0]);
			int m = Integer.parseInt(A[1]);
			int d = Integer.parseInt(A[2]);
			
			if (y<1989) {
				System.out.println("Yes");
			} else if (y>1989) {
				System.out.println("No");
			} else {
				if (m>2) {
					System.out.println("No");
				} else if (m<2) {
					System.out.println("Yes");
				} else {
					if (d>27) {
						System.out.println("No");
					} else {
						System.out.println("Yes");
					}
				}
			}
			
		}	
	}
}