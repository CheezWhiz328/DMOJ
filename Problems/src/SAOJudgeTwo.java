import java.util.Scanner;

public class SAOJudgeTwo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = (n*(n+1))/2;
		System.out.println("#include <iostream>\r\n" + 
				"\r\n" + 
				"using namespace std;\r\n" + 
				"\r\n" + 
				"int main()\r\n" + 
				"{\r\n" + 
				"    \r\n" + 
				"    cout << "+ans+";\r\n" + 
				"\r\n" + 
				"    return 0;\r\n" + 
				"}\r\n" + 
				"");
	}
}