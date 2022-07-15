package jungol.beginner.d20220715;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JO_1402_약수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				arr.add(i);
			}
		}
//		System.out.println(arr);
		
		if(arr.size() < k) {
			System.out.println(0);
		} else {
			System.out.println(arr.get(k-1));
		}
	}
}
