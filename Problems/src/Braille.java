import java.util.*;
import java.io.*;

public class Braille {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String a = sc.nextLine();
		
		String arr1[] = new String[a.length()];
		String arr2[] = new String[a.length()];
		String arr3[] = new String[a.length()];
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='A'){
				arr1[i] = "o.";
				arr2[i] = "..";
				arr3[i] = "..";
			}
			if(a.charAt(i)=='B'){
				arr1[i] = "o.";
				arr2[i] = "o.";
				arr3[i] = "..";
			}
			if(a.charAt(i)=='C'){
				arr1[i] = "oo";
				arr2[i] = "..";
				arr3[i] = "..";
			}
			if(a.charAt(i)=='D'){
				arr1[i] = "oo";
				arr2[i] = ".o";
				arr3[i] = "..";
			}
			if(a.charAt(i)=='E'){
				arr1[i] = "o.";
				arr2[i] = ".o";
				arr3[i] = "..";
			}
			if(a.charAt(i)=='F'){
				arr1[i] = "oo";
				arr2[i] = "o.";
				arr3[i] = "..";
			}
			if(a.charAt(i)=='G'){
				arr1[i] = "oo";
				arr2[i] = "oo";
				arr3[i] = "..";
			}
			if(a.charAt(i)=='H'){
				arr1[i] = "o.";
				arr2[i] = "oo";
				arr3[i] = "..";
			}
			if(a.charAt(i)=='I'){
				arr1[i] = ".o";
				arr2[i] = "o.";
				arr3[i] = "..";
			}
			if(a.charAt(i)=='J'){
				arr1[i] = ".o";
				arr2[i] = "oo";
				arr3[i] = "..";
			}
			if(a.charAt(i)=='K'){
				arr1[i] = "o.";
				arr2[i] = "..";
				arr3[i] = "o.";
			}
			if(a.charAt(i)=='L'){
				arr1[i] = "o.";
				arr2[i] = "o.";
				arr3[i] = "o.";
			}
			if(a.charAt(i)=='M'){
				arr1[i] = "oo";
				arr2[i] = "..";
				arr3[i] = "o.";
			}
			if(a.charAt(i)=='N'){
				arr1[i] = "oo";
				arr2[i] = ".o";
				arr3[i] = "o.";
			}
			if(a.charAt(i)=='O'){
				arr1[i] = "o.";
				arr2[i] = ".o";
				arr3[i] = "o.";
			}
			if(a.charAt(i)=='P'){
				arr1[i] = "oo";
				arr2[i] = "o.";
				arr3[i] = "o.";
			}
			if(a.charAt(i)=='Q'){
				arr1[i] = "oo";
				arr2[i] = "oo";
				arr3[i] = "o.";
			}
			if(a.charAt(i)=='R'){
				arr1[i] = "o.";
				arr2[i] = "oo";
				arr3[i] = "o.";
			}
			if(a.charAt(i)=='S'){
				arr1[i] = ".o";
				arr2[i] = "o.";
				arr3[i] = "o.";
			}
			if(a.charAt(i)=='T'){
				arr1[i] = ".o";
				arr2[i] = "oo";
				arr3[i] = "o.";
			}
			if(a.charAt(i)=='U'){
				arr1[i] = "o.";
				arr2[i] = "..";
				arr3[i] = "oo";
			}
			if(a.charAt(i)=='V'){
				arr1[i] = "o.";
				arr2[i] = "o.";
				arr3[i] = "oo";
			}
			if(a.charAt(i)=='W'){
				arr1[i] = ".o";
				arr2[i] = "oo";
				arr3[i] = ".o";
			}
			if(a.charAt(i)=='X'){
				arr1[i] = "oo";
				arr2[i] = "..";
				arr3[i] = "oo";
			}
			if(a.charAt(i)=='Y'){
				arr1[i] = "oo";
				arr2[i] = ".o";
				arr3[i] = "oo";
			}
			if(a.charAt(i)=='Z'){
				arr1[i] = "o.";
				arr2[i] = ".o";
				arr3[i] = "oo";
			}
			if(a.charAt(i)==' '){
				arr1[i] = "..";
				arr2[i] = "..";
				arr3[i] = "..";
			}
		}
		
		for(int i=0; i<a.length(); i++) {
			System.out.print(arr1[i]);
		}System.out.println();
		for(int i=0; i<a.length(); i++) {
			System.out.print(arr2[i]);
		}System.out.println();
		for(int i=0; i<a.length(); i++) {
			System.out.print(arr3[i]);
		}System.out.println();
		
//		String arr[] = new String[90000];
//		int count = 0;
//		for(int i=0; i<26; i++) {
//			char b = (char) (i+65);
//			arr[count] = "\tif(a.charAt(i)==\'"+b+"\'){";
//			count++;
//			for(int j=1; j<=3; j++) {
//				String a = sc.next();
//				arr[count] = "\t\tarr"+j+"[i] = \""+a+"\";";
//				count++;
//			}System.out.println();
//			arr[count] = "\t}";
//			count++;
//		}
//		
//		for(int i=0; i<count; i++) {
//			System.out.println(arr[i]);
//		}
	}
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
