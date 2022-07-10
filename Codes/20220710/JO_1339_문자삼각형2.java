package jungol.beginner.d20220710;

import java.util.Scanner;

public class JO_1339_문자삼각형2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N < 1 || N > 100 || N%2 == 0) {
			System.out.println("INPUT ERROR");
		}else {
			char myChar = 'A';
			char[][] arr = new char[N][N];
			for(int j = N/2; j >= 0; j--) {
				for(int i = j; i < N-j; i++) {
					arr[i][j] = myChar++;
					if(myChar =='Z' + 1) myChar = 'A';
				}
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(arr[i][j] == 0) {
						System.out.print("  ");
					}else {
						System.out.print(arr[i][j] + " ");
					}
				}
				System.out.println();
			}
		}
	}
}
