package ¸ÔÀ»°ÍÀÎ°¡¸ÔÈú°ÍÀÎ°¡_7795;

import java.util.*;

class Main {
	public int solution(int a, int[] arr_a, int b, int[] arr_b) {
		int answer = 0;

		Arrays.sort(arr_b);
		
		for(int i = 0; i < a; i++) {
			int lt = 0;
			int rt = b - 1;
			int target = arr_a[i];
			while(lt <= rt) {
				int m = (lt + rt) / 2;
				if(arr_b[m] < target) {
					lt = m + 1;
				}
				else if (arr_b[m] >= target) {
					rt = m - 1;
				}
			}
			answer += lt;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int tc = kb.nextInt();
		for(int i = 0; i < tc; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int[] arr_a = new int[a];
			int[] arr_b = new int[b];
			for(int j = 0; j < a; j++) arr_a[j] = kb.nextInt();
			for(int j = 0; j < b; j++) arr_b[j] = kb.nextInt();
			System.out.println(T.solution(a, arr_a, b, arr_b));
		}
	}

}
