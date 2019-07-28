import java.util.Scanner;

public class Race {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int E = Math.abs(a - x);
		int E1 = Math.abs(b - y);
		int E2 = Math.abs(c - z);
		int Creeper = 0;
		if (E >= E1 && E >= E2) {
			Creeper = E;
		}
		if (E1 >= E && E1 >= E2) {
			Creeper = E1;
		}
		if (E2 >= E1 && E2 >= E) {
			Creeper = E2;
		}
		int Enderman = (int)(Math.sqrt(Math.pow(E, 2) + Math.pow(E1, 2) + Math.pow(E2, 2)));
		int MagmaCube = E + E1 + E2;
		System.out.println(Creeper);
		System.out.println(Enderman);
		System.out.println(MagmaCube);
	}
}
