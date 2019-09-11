import java.util.*;

public class ccc18j5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		boolean[][] A = new boolean[N][N];
		
		LinkedList<Integer> endpage = new LinkedList<Integer>();
		
		for(int i=0; i<N; i++){
			int n = sc.nextInt();
			if(n==0){
				endpage.add(i);
			}
			for(int j=0;j<n; j++){
				int nextpage = sc.nextInt();
				A[i][nextpage-1] = true;
			}
		}
		
		int[] step = new int[N];
		for(int i=0; i<N; i++){
			step[i] = Integer.MAX_VALUE;
		}
		step[0] = 1;
		
		LinkedList<Integer> pages = new LinkedList<Integer>();
		boolean[] visited = new boolean[N];
		pages.add(0);
		int minPath = Integer.MAX_VALUE;
		visited[0] = true;
		while(!pages.isEmpty()){
			int p = pages.poll();
			
			for(int i=0; i<N; i++){
				if(A[p][i]==true){
					if(step[i]>step[p]+1){
						visited[i] = true;
						step[i] = step[p]+1;
						if(endpage.contains(i)){
							if(minPath>step[i]){
								minPath = step[i];
							}
						}else{
							pages.add(i);
						}
					}
				}
			}
		}
		
		boolean flag = true;
		for(int i=0; i<N; i++){
			if(visited[i]==false){
				flag = !flag;
				break;
			}
		}
		
		if(flag){
			System.out.println("Y");
		}else{
			System.out.println("N");
		}
		
		System.out.println(minPath);
	}
}