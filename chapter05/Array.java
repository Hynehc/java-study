import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		double[] hens = {3, 5, 1, 2, 9};
		double res = 0;
		for (int i = 0; i < 5; i ++ )
			res += hens[i];
		System.out.println(res);
	}
}

class A1 {
	public static void main(String[] args) {
		int a[] = new int[5];
		for (int i = 0; i < a.length; i ++ )
			a[i] = i;
		for (int i = 0; i < a.length; i ++ )
			System.out.println(a[i]);
	}
}

class A2 {
	public static void main(String[] args) {
		char[] chars = new char[26];
		for (int i = 0; i < chars.length; i ++ )
			chars[i] = (char)('A' + i);
		for (int i = 0; i < chars.length; i ++ )
			System.out.println(chars[i]);
	}
}

class A3 {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		arr2[0] = 100;
		for (int i = 0; i < arr1.length; i ++ ) {
			System.out.println(arr1[i]);
		}
	}
}

class A4 {
	public static void main(String[] args) {
		int[] arr1 = {1, 32, 3};
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i ++ ) {
			arr2[i] = arr1[i];
		}
	}
}