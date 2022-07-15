package jungol.beginner.d20220715;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class JO_2809_약수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		int cnt = 0;
		for(int i = 1; i <=Math.sqrt(n); i++) {
			if(n % i == 0) {
				arr.add(i);
				if(n / i != i) {
					arr.add(n/i);
				}
			}
		}
		Collections.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < arr.size();i++) {
			sb.append(arr.get(i)+" ");
		}
		System.out.println(sb);
	}
}
