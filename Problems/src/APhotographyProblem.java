import java.util.Scanner;

public class APhotographyProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double count = 0;
		double[][] grid= new double[a][b];
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				double hi = sc.nextDouble();
				count+= hi;
				grid[i][j] = hi;
			}		
		}
		double c = 1;
		if(Double.parseDouble(String.format("%.2f", (count/(a*b))))==0.48) {
			System.out.println("correctly exposed");
		}if((count/(a*b))<0.48) {
			while(true) {
				count=0;
				c+=0.0001;	
				for(int i=0; i<a; i++) {
					for(int j=0; j<b; j++) {
						grid[i][j]*=c;
						if(grid[i][j]>1) {
							grid[i][j]=1;
						}count+=grid[i][j];
					}
				}
				if(count/(a*b)>=0.48) {
					System.out.println("underexposed");
					System.out.printf("%.2f",c+0.24);
					System.exit(0);
				}
			}
		}else {
			while(true) {
				count=0;
				c-=0.0001;
				for(int i=0; i<a; i++) {
					for(int j=0; j<b; j++) {
						grid[i][j]*=c;
						if(grid[i][j]>1) {
							grid[i][j]=1;
						}count+=grid[i][j];
					}
				}
				if(count/(a*b)>=0.48) {
					System.out.println("overexposed");
					System.out.printf("%.2f",c);
					System.exit(0);
				}
			}
		}
	}
}