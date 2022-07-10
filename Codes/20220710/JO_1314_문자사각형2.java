package jungol.beginner.d20220710;

import java.util.*;

public class JO_1314_문자사각형2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		char myChar = 'A';
		char[][] arr = new char[n][n];
		for (int col = 0; col < n; col++) {
			if (col % 2 == 0) {
				for(int row = 0; row < n; row++) {
					arr[row][col] = myChar++;
					if(myChar=='Z'+1) {
						myChar = 'A';
					}
				}
			} else {
				for(int row = n-1; row >= 0; row--) {
					arr[row][col] = myChar++;
					if(myChar=='Z'+1) {
						myChar = 'A';
					}
				}
			}
		}
		
		for(int i = 0 ; i < n;i++) {
			for(int j = 0 ; j < n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
