package LRU;

import java.util.*;

class Main2 {
	public int[] solution(int s, int n, int[] arr) {
		int[] cache = new int[s];
		
		for(int x : arr) {
			// x가 cache에 있는지 확인
			int pos = -1;
			for(int i = 0; i < s; i++) if(x == cache[i]) pos = i;
			
			// miss 상황
			if(pos == -1) {
				for(int i = s - 1; i >= 1; i--) {
					cache[i] = cache[i - 1];
				}
			}
			// hit 상황
			else {
				for(int i = pos; i >= 1; i--) {
					cache[i] = cache[i - 1];
				}
			}
			cache[0] = x;
		}
		
		return cache;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(s, n, arr)) System.out.print(x + " ");
	}
}
