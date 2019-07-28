import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.io.DataInputStream; 
import java.io.FileInputStream; 


public class MigrantMacot{

    public static void main(String[] args) throws IOException {
        Reader in = new Reader();
        int n = in.nextInt(), m = in.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[n+5], dist = new ArrayList[n+5];
        for (int l = 1; l <= n; ++l){
            adj[l] = new ArrayList<Integer>();
            dist[l] = new ArrayList<Integer>();
        }
        int a, b, c;
        for (int l = 0; l < m; ++l){
            a = in.nextInt(); b = in.nextInt(); c = in.nextInt();
            adj[a].add(b);
            adj[b].add(a);
            dist[a].add(c);
            dist[b].add(c);
        }
        PriorityQueue<path> pq = new PriorityQueue<path>();
        pq.add(new path((1<<30), 1));
        int best[] = new int[200005];
        int N, M, nD, nN;
        c=0;
        path tmp;
        while(!pq.isEmpty()){
            tmp = pq.poll();
            N = tmp.node; M = tmp.min;
            if (M <= best[N]) continue;
            best[N] = M;
            if (++c == n) break;
            for (int l = 0; l < adj[N].size(); ++l){
                if ((nD = Math.min(M, dist[N].get(l))) > best[(nN = adj[N].get(l))])
                    pq.add(new path(nD, nN));
            }
        }
        System.out.println(0);
        for (int l = 2; l <= n; ++l){
            System.out.println(best[l]);
        }
    }
    static class path implements Comparable<path>{
        int min, node;
        public path(int M, int N){
            min = M;
            node = N;
        }
        public int compareTo(path other){
            return other.min - min;
        }
    }


    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
}
