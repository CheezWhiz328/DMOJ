import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Rulletesolution {
	StringTokenizer st = new StringTokenizer("");
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	boolean hasNextToken() {
		try {
			while (!st.hasMoreTokens()) {
				String line = input.readLine();
				if (line == null)
					return false;
				st = new StringTokenizer(line);
			}
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
		return true;
	}

	String nextToken() {
		return (!hasNextToken()) ? null : st.nextToken();
	}

	public static void main(String[] args) {
		new Rulletesolution().run();
	}

	static class Card {
		int rank, suite;

		Card(int rank, int suite) {
			this.rank = rank;
			this.suite = suite;
		}

		Card(String code) {
			this(code.charAt(0), code.charAt(code.length() - 1));
		}

		int value() {
			return (rank >= '2' && rank <= '9') ? rank - '0' : 10;
		}
	}

	static int[] primes = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59 };

	BigInteger score = BigInteger.ZERO;
	List<Card> cards = new ArrayList<>(5);

	Stream<Card> cards() {
		return cards.stream();
	}

	BigInteger add(BigInteger bi, long a) {
		return bi.add(BigInteger.valueOf(a));
	}

	List<Function<BigInteger, BigInteger>> rules = new ArrayList<>(13), changed = new ArrayList<>(13);
	{
		rules.add(x -> add(add(x, 1), cards.get(0).value() * cards().filter(c -> c.rank == 'J').count()));
		rules.add(x -> x.add(x));
		rules.add(x -> (cards().map(c -> c.suite).distinct().count() < 4) ? null : x.add(x));
		rules.add(x -> add(x, Math.abs(2 * cards().filter(c -> c.suite == 'C' || c.suite == 'S').count() - 5)));
		rules.add(x -> x.mod(BigInteger.valueOf(2)).signum() != 0 ? null : add(x, divisors(x)));
		rules.add(x -> cards().filter(c -> c.rank == '7').count() < 4 ? null : add(x, -121));
		rules.add(x -> x.signum() < 0 ? null : add(x, cards().map(Card::value).min(Integer::compareTo).get()));
		rules.add(x -> x.abs());
		rules.add(this::rule9);
		rules.add(x -> (cards().map(c -> c.rank).distinct().count() == 5
				&& cards().filter(c -> c.value() == 10).count() == 5) ? add(x, 5) : null);
		rules.add(x -> changed.size() <= 8 ? null : add(x, x.bitCount()));
		rules.add(
				x -> cards().filter(c -> c.rank == '2').count() == 0 ? null : changed.get(changed.size() - 1).apply(x));
		rules.add(x -> cards().filter(c -> c.rank == '2').count() == 0 ? null : x.add(x));
	}

	BigInteger rule9(BigInteger x) {
		if (cards().filter(c -> c.suite == 'D').count() < 3)
			return null;
		for (Card c : cards) {
			if (c.rank == '6')
				c.rank = '9';
			else if (c.rank == '9')
				c.rank = '6';
			else if (c.rank == '2')
				c.rank = '5';
			else if (c.rank == '5')
				c.rank = '2';
		}
		return add(x, 1);
	}

	long divisors(BigInteger x) {
		throw new UnsupportedOperationException();
	}

	void run() {
		for (int i = 0; i < 5; ++i)
			cards.add(new Card(nextToken()));
		for (Card c : cards)
			score = score.add(BigInteger.valueOf(c.value()));
		for (Function<BigInteger, BigInteger> r : rules) {
			BigInteger x = r.apply(score);
			if (x != null && !x.equals(score)) {
				score = x;
				changed.add(r);
			}
		}
		System.out.println(score);
	}
}
