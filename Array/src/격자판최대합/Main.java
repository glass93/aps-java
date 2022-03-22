package 격자판최대합;

import java.util.*;

class Main {
	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = 0; j < n; j++) {
				sum += arr[i][j];
			}
			if(sum > answer) answer = sum;
		}
		for(int j = 0; j < n; j++) {
			int sum = 0;
			for(int i = 0; i < n; i++) {
				sum += arr[i][j];
			}
			if(sum > answer) answer = sum;
		}
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += arr[i][i];
		}
		if(sum > answer) answer = sum;
		sum = 0;
		for(int i = n - 1; i > -1; i--) {
			sum += arr[i][n-i-1];
		}
		if(sum > answer) answer = sum;
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}

}
