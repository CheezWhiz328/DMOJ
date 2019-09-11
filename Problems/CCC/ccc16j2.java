import java.util.Scanner;

public class ccc16j2 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int[][] magic = new int[4][4];
		
		boolean flag = true;
		for(int row=0; row<4; row++){
			for(int col=0; col<4; col++){
				magic[row][col] = sc.nextInt();
			}	
		}
		
		int rowSum = magic[0][0]+magic[0][1]+magic[0][2]+magic[0][3];
		
		for(int row=0; row<4; row++){
			int rowT=0;
			int colT=0;
			for(int col=0; col<4; col++){
				rowT=rowT + magic[row][col];
				colT = colT + magic[row][col];
			}
			if(rowT!=rowSum || colT!=rowSum){
				flag = false;
				break;
			}
		}
		
		
		
		if(flag){
			System.out.println("magic");
		}else{
			System.out.println("not magic");
		}
	}
}
