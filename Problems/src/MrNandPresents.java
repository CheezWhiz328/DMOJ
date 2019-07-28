import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class MrNandPresents {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> b = new LinkedList<Integer>();
		int a = Integer.parseInt(in.readLine());
		for(int i=0; i<a; i++) {
			String c = in.readLine();
			int d = Integer.parseInt(c.substring(2, c.length()));
			if(c.charAt(0)=='F') {
				b.addFirst(d);
			}else if(c.charAt(0)=='E') {
				b.add(d);
			}else {
				b.removeLastOccurrence(d);
			}
		}
		for(int i=0; i<b.size(); i++) {
			System.out.println(b.get(i));
		}
	}
}
