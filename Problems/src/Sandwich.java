import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
public class Sandwich {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(in.readLine());
		char[] b = in.readLine().toCharArray();
		List<Integer> c = new LinkedList<Integer>();
		for(int i=0; i<a; i++) {
			if(b[i]=='1') {
				((LinkedList<Integer>) c).addFirst(i+1);
			}else {
				((LinkedList<Integer>) c).addLast(i+1);
			}
		}
		for(int i=0; i<a; i++) {
			System.out.println(c.get(i));
		}
	}
}
