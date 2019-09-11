import java.util.LinkedList;
import java.util.Scanner;

public class ccc10j5 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[][] step = new int[9][9];

		for (int row=0; row<9; row++){
			for (int col=0; col<9; col++){
				step[row][col] = 1000;
			}
		}

		int BR = sc.nextInt(); //BR = beginning row number
		int BC = sc.nextInt(); //BC = beginning col number
		int ER = sc.nextInt(); //ER = ending row number
		int EC = sc.nextInt(); //EC = ending col number

		LinkedList<Integer> rowQ= new LinkedList<Integer>();
		LinkedList<Integer> colQ= new LinkedList<Integer>();

		rowQ.add(BR);
		colQ.add(BC);
		step[BR][BC] = 0;

		//Start BFS

		while (!rowQ.isEmpty()){
			int R = rowQ.poll();
			int C = colQ.poll();
		
			if (R-2>=1 && C+1<9 && step[R-2][C+1] > step[R][C]+1){ //1
				step[R-2][C+1] = step[R][C]+1;
				rowQ.add(R-2);
				colQ.add(C+1);
			}
			if (R-1>=1 && C+2<9 && step[R-1][C+2] > step[R][C]+1){ //2
				step[R-1][C+2] = step[R][C]+1;
				rowQ.add(R-1);
				colQ.add(C+2);
			}
			if (R+1<9 && C+2<9 && step[R+1][C+2] > step[R][C]+1){ //3
				step[R+1][C+2] = step[R][C]+1;
				rowQ.add(R+1);
				colQ.add(C+2);
			}
			if (R+2<9 && C+1<9 && step[R+2][C+1] > step[R][C]+1){ //4
				step[R+2][C+1] = step[R][C]+1;
				rowQ.add(R+2);
				colQ.add(C+1);
			}
			if (R+2<9 && C-1>=1 && step[R+2][C-1] > step[R][C]+1){ //5 
				step[R+2][C-1] = step[R][C]+1;
				rowQ.add(R+2);
				colQ.add(C-1);
			}
			if (R+1<9 && C-2>=1 && step[R+1][C-2] > step[R][C]+1){ //6 
				step[R+1][C-2] = step[R][C]+1;
				rowQ.add(R+1);
				colQ.add(C-2);
			}
			if (R-1>=1 && C-2>=1 && step[R-1][C-2] > step[R][C]+1){ //7
				step[R-1][C-2] = step[R][C]+1;
				rowQ.add(R-1);
				colQ.add(C-2);
			}
			if (R-2>=1 && C-1>=1 && step[R-2][C-1] > step[R][C]+1){ //8
				step[R-2][C-1] = step[R][C]+1;
				rowQ.add(R-2);
				colQ.add(C-1);
			}
		}
		System.out.println(step[ER][EC]);
				
		
		
	}
}