import java.util.Scanner;

public class aNewChapter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int j = sc.nextInt();
		for(int i=0; i<j; i++) {
			int k = sc.nextInt();
			if(i%2==k%2) {
				count++;
			}
		}System.out.println(count);
	}
}
