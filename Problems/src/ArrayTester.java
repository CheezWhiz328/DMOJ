import java.util.Arrays;
import java.util.Scanner;

public class ArrayTester {
	public static int[] getColumn(int[][] arr2d, int c) {
		int[] res = new int [arr2d.length];
		for(int i=0; i<res.length; i++) {
			res[i] = arr2d[i][c];
		}
		return res;
	}
	
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		int[] arr1Copy = arr1.clone();
		int[] arr2Copy = arr2.clone();
	
		Arrays.sort(arr1Copy);
		Arrays.sort(arr2Copy);
		for(int i=0; i<arr1.length; i++) {
			if(arr1Copy[i]!=arr2Copy[i]) {
				return false;
			}
		}
		return true;

	}
	
	public static boolean containsDuplicate(int[] arr) {
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]== arr[i+1]) {
				return false;
			}
		}
		return true;
		
	}
	public static boolean isLatin(int[][] square) {
		if(containsDuplicate(square[0])) {
			return false;
		}
		
		for(int i=1; i<square.length; i++) {
			if(!hasAllValues(square[0], square[i])) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int[][] test = new int[a][a];
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				test[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(isLatin(test));
	}
}
