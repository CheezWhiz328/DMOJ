import java.util.Scanner;

public class ccc04j2 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		for(int i=x;i<=y; i=i+60){
			System.out.println("All positions change in year "+i);
		}
		
	}
}