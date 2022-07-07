package jungol.beginner.d20220707;



import java.util.Scanner;

public class JO_1291_구구단 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s, e;
		do {
			s = sc.nextInt();
			e = sc.nextInt();
			if(s < 2 || s > 9 || e < 2 || e > 9) {
				System.out.println("INPUT ERROR!");
			}
		} while (s < 2 || s > 9 || e < 2 || e > 9);

		// 시작 숫자가 큰 경우
		if (s > e) {
			for (int i = 1; i <= 9; i++) {
				if (i > 1) {
					System.out.println();
				}
				for (int j = s; j >= e; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, i*j);
				}
			}
		}

		// 그외
		else {
			for (int i = 1; i <= 9; i++) {
				if (i > 1) {
					System.out.println();
				}
				for (int j = s; j <= e; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, i*j);
				}
			}
		}
	}
}

