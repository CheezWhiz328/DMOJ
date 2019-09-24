import java.io.*;
import java.util.*;

public class dwite09c1p4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			String a = sc.next();
			char arr[] = new char[26];
			for (int j = 0; j < a.length(); j++) {
				arr[a.charAt(j) - 65]++;
			}
			for (int j = 0; j < a.length(); j++) {
				if (arr[a.charAt(j) - 65] == 1) {
					System.out.println(a.charAt(j));
					break;
				}
			}
		}
	}
}