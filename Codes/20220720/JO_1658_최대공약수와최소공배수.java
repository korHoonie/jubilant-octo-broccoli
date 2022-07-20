package jungol.beginner.d20220720;

import java.util.*;

public class JO_1658_최대공약수와최소공배수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
//		// 유클리드 호제법을 이용한 최대공약수 구하기
//		while(b !=0 ) {
//			// a를 b로 나눈 나머지
//			int r = a % b;
//			a = b;
//			b = r;
//			
//		}
		System.out.println(gcd(a,b));
		System.out.println(a * b / gcd(a,b));
	}
	
	static int gcd(int x, int y) {
		if( y == 0) {
			return x;
		}
		
		return gcd(y, x % y);
	}
}
