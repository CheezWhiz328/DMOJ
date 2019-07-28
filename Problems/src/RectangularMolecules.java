import java.util.Scanner;

public class RectangularMolecules {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		for(int i=0; i<4; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(arr[0]<arr[1] && arr[0]<arr[3] && arr[2]<arr[1] && arr[2]<arr[3] || arr[0]>arr[1] && arr[0]>arr[3] && arr[2]>arr[1] && arr[2]>arr[3]) {
			System.out.println("trans");
		}else {
			System.out.println("cis");
		}
	}
}
