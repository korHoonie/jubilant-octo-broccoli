package jungol.beginner.d20220710;

import java.util.*;
public class JO_1307_문자사각형1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char myChar = 'A';
		char[][] arr = new char[n][n];
		for(int i = n-1 ; i >= 0; i--) {
			for(int j = n-1; j>=0; j--) {
				arr[j][i] = myChar++;
				if(myChar == 'Z' + 1) {
					myChar = 'A';
				}
			}
		}
		
		for(int i = 0 ; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
