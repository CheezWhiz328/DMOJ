import java.util.PriorityQueue;
import java.util.Scanner;

import javax.xml.soap.Node;

public class Test_Scores {
	public static void main(String args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		K *= N;
		PriorityQueue<Node> marks = new PriorityQueue<Node>();
		
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			marks.add(new Node());
		}
		
		
	}
	
	private static class Node implements Comparable<Node>{
		int weight = 0;
		public int compareTo(Node n) {
	        if(this.weight < n.weight){
	            return -1;
	        }else if(this.weight > n.weight){
	            return 1;
	        }else
	            return 0;
	    }
	}
}