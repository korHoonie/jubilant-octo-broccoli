package jungol.beginner.d20220707;

import java.util.*;
public class JO_1303_숫자사각형1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt = 1;
		for(int i =0; i < n;i++) {
			for(int j = 0 ;j < m; j++) {
				System.out.printf("%d ", cnt++);
			}
			System.out.println();
		}
	}
}
