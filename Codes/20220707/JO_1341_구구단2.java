package jungol.beginner.d20220707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 사용언어 자바로 바꾸기!!
public class JO_1341_구구단2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = 0;
		int e = 0;

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			s = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());
			if (s < 2 || s > 9 || e < 2 || e > 9) {
				System.out.println("INPUT ERROR!");
			} else {
				break;
			}
		}
		if (s > e) {
			for(int i = s; i >=e; i--) {
				for(int j = 1; j <=9; j++) {
					if(j % 3 == 0) {
						System.out.printf("%d * %d = %2d\n", i, j, i*j);
					}else {
						System.out.printf("%d * %d = %2d   ", i, j, i*j);
					}
				}
				System.out.println();
			}
		}else {
			for(int i = s; i <=e; i++) {
				for(int j = 1; j <=9; j++) {
					if(j % 3 == 0) {
						System.out.printf("%d * %d = %2d\n", i, j, i*j);
					}else {
						System.out.printf("%d * %d = %2d   ", i, j, i*j);
					}
				}
				System.out.println();
			}
		}

	}
}
