package jungol.beginner.d20220707;

import java.io.*;
import java.util.*;

public class JO_1856_숫자사각형2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
		int cnt = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i % 2 == 0) {
					arr[i][j] = cnt++;
				} else {
					arr[i][m - 1 - j] = cnt++;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
