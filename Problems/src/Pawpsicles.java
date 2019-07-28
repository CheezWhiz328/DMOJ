import java.io.*;
import java.util.*;
public class Pawpsicles{

    public static void main(String[] Args){
        FastReader sc = new FastReader();
        int siz = 100005;
        int n = sc.nextInt(), m = sc.nextInt();

        int distance[][] =  new int[5][siz], type[] = new int[siz];
        for (int l = 0; l < 5; ++l)
            Arrays.fill(distance[l], 999999);
        for (int l = 1; l <= n; ++l){
            type[l] = sc.nextInt();
        }

        //1c
        PriorityQueue<path> pq = new PriorityQueue<path>();
        ArrayList<Integer> [] adj = new ArrayList[siz], dist = new ArrayList[siz];
        for (int l = 0; l < siz; ++l){
            adj[l] = new ArrayList<Integer>();
            dist[l] = new ArrayList<Integer>();
        }

        //1d
        for (int l = 0; l < m; ++l){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            adj[a].add(b);
            dist[a].add(c);
            adj[b].add(a);
            dist[b].add(c);
        }

        pq.add(new path(1, 0, 0));
        while(!pq.isEmpty()){
            path tmp = pq.poll();
            int N = tmp.node, D = tmp.distance, P = tmp.phase;
            if (D >= distance[P][N]) continue;
            distance[P][N] = D;

            if (P+1 == type[N]){
                P++;
            }
            if (P == 4){
                System.out.println(D);
                return;
            }

            for (int l = 0; l < adj[N].size(); ++l){
                pq.add(new path(adj[N].get(l), D + dist[N].get(l), P));
            }
        }

        System.out.println(-1);

    }

    public static class path implements Comparable<path>{
        int node, distance, phase;

        public path(int N, int D, int P){
            node = N;
            distance = D;
            phase = P;
        }

        public int compareTo(path other){
            return this.distance - other.distance;
        }
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));

        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}