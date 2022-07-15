package jungol.beginner.d20220714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JO_1071_약수와배수 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ;i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		
		int answer1 = 0 ;
		int answer2 = 0;
		
		for(int i = 0 ; i < n; i++) {
			if(nums[i] % m == 0) {
				answer1 +=nums[i];
			}
			if(m % nums[i] == 0) {
				answer2 += nums[i];
			}
		}
		System.out.println(answer2);
		System.out.println(answer1);
	}
}
