package ºÀ¿ì¸®;

import java.util.*;

class Main {
	public int solution(int n, int[][] arr) {
		int answer = 0;
		
		int[][] tmp = new int[n+2][n+2];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				tmp[i+1][j+1] = arr[i][j];
			}
		}
		
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < n + 1; j++) {
				if(tmp[i][j] > tmp[i-1][j] && tmp[i][j] > tmp[i][j+1]
						&& tmp[i][j] > tmp[i+1][j]
								&& tmp[i][j] > tmp[i][j-1]) {
					answer += 1;
				}
			}
		}
		
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
