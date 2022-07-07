package jungol.beginner.d20220708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JO_2046_숫자사각형4 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][n];
		
		switch(m) {
		
		case 1:
			for(int i = 0; i < n; i++) {
				for(int j = 0 ; j < n; j++) {
					arr[i][j] = i+1;
				}
				
			}
			for(int r = 0 ; r < n; r++) {
				for(int c = 0;c < n; c++ ) {
					System.out.print(arr[r][c] + " ");
				}
				System.out.println();
			}
			break;
		case 2:
			int cnt = 0;
			for(int i = 0 ; i < n; i++) {
				for(int j =0; j < n; j++) {
					if(i % 2 == 0) {
						arr[i][j] = ++cnt;
					}else {
						arr[i][j] = cnt--;
					}
				}
			}
			for(int r = 0 ; r < n; r++) {
				for(int c = 0;c < n; c++ ) {
					System.out.print(arr[r][c] + " ");
				}
				System.out.println();
			}
			break;
		case 3:
			for(int i = 0 ; i < n;i++) {
				for(int j = 0 ; j < n;j++) {
					arr[i][j] = (i+1) * (j+1);
				}
			}
			for(int r = 0 ; r < n; r++) {
				for(int c = 0;c < n; c++ ) {
					System.out.print(arr[r][c] + " ");
				}
				System.out.println();
			}
			break;
		}
	}
}
