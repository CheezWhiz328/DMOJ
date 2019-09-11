import java.util.*;

public class ccc07s4{

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[n+1];
        int[] dp = new int[n+1];
        dp[1] = 1;

        for (int i = 1; i <= n; i++){
            adj[i] = new ArrayList<Integer>();
        }
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        while(x!=0){
            adj[x].add(y);
            x = sc.nextInt();
            y = sc.nextInt();
        }
        
        for (int i = 1; i <= n; i++){
            for (int j:adj[i]){         
                dp[j] += dp[i];
            }
        }
        System.out.println(dp[n]);
    	System.exit(0);
    }
}