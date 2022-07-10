package jungol.beginner.d20220710;

import java.util.Scanner;

public class JO_1338_문자삼각형1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		char myChar = 'A';
		
		char[][] arr = new char[n][n];
		for(int cnt = 0 ; cnt < n; cnt++) {
			
			for(int i = cnt ; i < n; i++) {
				arr[i][n-1-i+cnt]= myChar++;
				if(myChar == 'Z' + 1) myChar = 'A';
			}
		}
	
		for(int i = 0 ; i < n; i++) {
			for(int j = 0 ; j < n; j++) {
				if(arr[i][j] == '\0') {
					System.out.print("  ");
				}else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
