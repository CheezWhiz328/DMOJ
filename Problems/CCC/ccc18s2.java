import java.util.Scanner;

public class ccc18s2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		boolean flag = true;
		boolean angle = true;
		int[][] hi = new int[a][a];
		for(int row=0; row<a; row++){
			for(int col=0; col<a; col++){
				hi[row][col] = sc.nextInt();
				if(col>0&&hi[row][col]<hi[row][col-1]){
					flag = false;
				}
			}
		}
		
		for(int col = 0; col<a; col++){
			for(int row=0; row<a; row++){
				if(row>0&&hi[row][col]<hi[row-1][col]){
					angle = false;
				}
			}
		}
		
		if(flag&&angle){
			for(int row=0; row<a;row++){
				for(int col=0; col<a; col++){
					System.out.print(hi[row][col]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}else if(!flag&&angle){
			
			for(int col=a-1; col>=0; col--){
				for(int row=0; row<a; row++){			
					System.out.print(hi[row][col]+" ");
				}
				System.out.println();
			}
			
			
		}else if(flag&&!angle){
			
			for(int col=0; col<a; col++){
				for(int row=a-1; row>=0; row--){
					System.out.print(hi[row][col]+" ");
				}
				System.out.println();
			}
			
		}
		
		else if(!flag&&!angle){
		
			for(int row=a-1; row>=0; row--){
				for(int col=a-1; col>=0; col--){
					System.out.print(hi[row][col]+" ");
				}
				System.out.println();
			}
		}
	}
}