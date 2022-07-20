package jungol.beginner.d20220720;

import java.util.Scanner;

public class JO_1002_최대공약수와최소공배수2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0 ; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int gcd = arr[0];
		int lcm = arr[0];
		
		for(int i = 1; i < N; i++) {
			gcd = getGcd(gcd, arr[i]);
			lcm = lcm / getGcd(lcm, arr[i]) * arr[i];
		}
		
		System.out.println(gcd + " " + lcm);
	}
	
	static int getGcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return getGcd(b, a % b);
	}
}
