package ÁÂÇ¥Á¤·Ä;

import java.util.*;

class Main {
	public int[][] solution(int n, int[][] arr) {
		for(int i = 0; i < n - 1; i++) {
			int idx = i;
			for(int j = i + 1; j < n; j++) {
				if(arr[j][0] < arr[idx][0]) idx = j;
				else if(arr[j][0] == arr[idx][0]) {
					if(arr[j][1] < arr[idx][1]) idx = j;
				}
			}
			int tmp1 = arr[i][0];
			int tmp2 = arr[i][1];
			arr[i][0] = arr[idx][0];
			arr[i][1] = arr[idx][1];
			arr[idx][0] = tmp1;
			arr[idx][1] = tmp2;
		}
		
		
		return arr;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			arr[i][0] = kb.nextInt();
			arr[i][1] = kb.nextInt();
		}
		for(int[] x : T.solution(n, arr)) {
			System.out.println(x[0] + " " + x[1]);
		}
	}
}
