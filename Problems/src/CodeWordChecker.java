
public class CodeWordChecker implements StringChecker{
	private int a,b;
	private String c;
	public CodeWordChecker(int a, int b, String c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public CodeWordChecker(String c) {
		this(6,20, c);
	}
	public boolean isValid(String str) {
		if(str.length()<a || str.length()>b || str.contains(c)) {
			return false;
		}
		return true;
	}
}
