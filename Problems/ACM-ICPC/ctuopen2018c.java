import java.util.Arrays;
import java.util.Scanner;

public class ctuopen2018c {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];
		char[] b = new char[5];

		int score = 0;
		int Jcount = 0;

		int Dcount = 0;
		int Hcount = 0;
		int Ccount = 0;
		int Scount = 0;

		int rank7 = 0;

		int lowest = 99;

		int rankA = 0;

		int rank2 = 0;

		int[] straight = new int[5];

		int lastchange = 0;
		for (int i = 0; i < 5; i++) {
			String s = sc.next();

			if (s.length() == 3 || s.charAt(0) >= 'A') {
				if (s.charAt(0) == 'J') {
					Jcount++;
					straight[i] = 11;
				} else if (s.charAt(0) == 'Q') {
					straight[i] = 12;
				} else if (s.charAt(0) == 'K') {
					straight[i] = 13;
				}

				else if (s.charAt(0) == 'A') {
					rankA++;
					straight[i] = 14;
				} else {
					straight[i] = 10;
				}

				a[i] = 10;

			} else {

				a[i] = s.charAt(0) - 48;

				if (a[i] == 7) {
					rank7++;
				}

				if (a[i] == 2) {
					rank2++;
				}
				straight[i] = s.charAt(0) - 48;
			}

			if (a[i] < lowest) {
				lowest = a[i];
			}
			score += a[i];

			b[i] = s.charAt(s.length() - 1);
			if (b[i] == 'D') {
				Dcount++;
			}

			if (b[i] == 'H') {
				Hcount++;
			}

			if (b[i] == 'C') {
				Ccount++;
			}

			if (b[i] == 'S') {
				Scount++;
			}
		}

//		1

		score++;
		score += a[0] * Jcount;

//		2

		score *= 2;

//		3

		if (Dcount > 0 && Ccount > 0 && Hcount > 0 && Scount > 0) {
			score *= 2;
		}

//		4

		score += Math.abs((Ccount + Scount) - (Hcount + Dcount));

//		5

		if (score % 2 == 0) {

			int divisors = 0;
			for (int i = 1; i <= score; i++) {
				if (score % i == 0) {
					divisors += i;
				}
			}
			score += divisors;
		}

//		6

		if (rank7 == 4) {
			score -= 11 * 11;
		}

//		7

		if (score >= 0) {
			score += lowest;
			lastchange = 7;
		}

//		8

		if (score < 0) {
			score *= -1;
			lastchange = 8;
		}

//		9 

		if (Dcount >= 3) {
			score++;
			for (int i = 0; i < 5; i++) {
				if (a[i] == 6) {
					a[i] = 9;
					straight[i] = 9;
				} else if (a[i] == 9) {
					a[i] = 6;
					straight[i] = 6;
				} else if (a[i] == 2) {
					a[i] = 5;
					straight[i] = 5;
					rank2--;
				} else if (a[i] == 5) {
					a[i] = 2;
					straight[i] = 2;
					rank2++;
				}
			}
			lastchange = 9;
		}

//		10

		boolean strait = true;

		Arrays.sort(straight);
		for (int i = 1; i < 5; i++) {
			if (straight[i] != straight[i - 1] + 1) {
				strait = false;
			}
		}

		if (strait) {
			score += 5 * rankA;
			if (rankA != 0) {
				lastchange = 10;
			}
		}

//		11

//		12 ctrl c + v

		if (rank2 >= 1) {

			if (lastchange == 7) {
				if (score >= 0) {
					score += lowest;
				}
			}

			if (lastchange == 8) {
				if (score < 0) {
					score *= -1;
				}
			}

			if (lastchange == 9) {
				if (Dcount >= 3) {
					for (int i = 0; i < 5; i++) {
						if (a[i] == 6) {
							a[i] = 9;
						} else if (a[i] == 9) {
							a[i] = 6;
						} else if (a[i] == 2) {
							a[i] = 5;
							rank2--;
						} else if (a[i] == 5) {
							a[i] = 2;
							rank2++;
						}
					}
					score++;
				}
			}

			if (lastchange == 10) {
				if (strait) {
					score += 5 * rankA;
				}
			}

		}

//		13

		if (rank2 >= 1) {
			score *= 2;
		}

//		14(not a rule)

//		print score
		System.out.println(score);

	}
}