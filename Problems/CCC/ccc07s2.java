import java.util.Arrays;
import java.util.Scanner;

public class ccc07s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//https://dmoj.ca/problem/ccc07s2

		//n*3 2D array
		//n boxes
		int n = sc.nextInt();
		int[][] boxes = new int[n][3];
		for (int i=0; i<n; i++) {
			boxes[i][0] = sc.nextInt(); //side1
			boxes[i][1] = sc.nextInt(); //side2
			boxes[i][2] = sc.nextInt(); //side3
			Arrays.sort(boxes[i]);
		}

		int m = sc.nextInt();
		//input item

		for (int i=0; i<m; i++) {
			int[] item = new int[3]; //one item
			for (int c=0; c<3; c++) {
				item[c] = sc.nextInt();
			}
			Arrays.sort(item);

			//check every boxes
			int min = Integer.MAX_VALUE;
			for (int r=0; r<n; r++) {
				//box fit the item
				if (item[0]<=boxes[r][0] 
						&& item[1]<=boxes[r][1]
								&& item[2]<=boxes[r][2]) {
					int volume = boxes[r][0]*boxes[r][1]*boxes[r][2];
					if (volume<min) {
						min = volume;
					}			
				}
			}
			if (min==Integer.MAX_VALUE) {
				System.out.println("Item does not fit.");
			} else {
				System.out.println(min);
			}
		}
	}

}