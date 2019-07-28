public class modCalculator {
	static long get_power(int X, int Y, int M){
		long answer = 1;
		for (long base = X, group = 1; group <= Y; group*=2, base = ((long)base*base) % M){
			if ((group & Y) > 0){
				answer = (long) answer * (base) % M;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// see an easy problem
		System.out.println(get_power(99999999, 99999999-1, 1000000007));

	}
}
