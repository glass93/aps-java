package LRU;

import java.util.*;

// Least Recently Used (캐시, 카카오 변형)
class Main {
	public int[] solution(int s, int n, int[] arr) {
		int[] answer = new int[s];
		for(int i = 0; i < n; i++) {
			int tmp = 0;
			for(int j = 0; j < s; j++) {
				if(arr[i] == answer[j]) tmp = j;
			}
			
			// Cache Miss
			if(tmp == 0) {
				for(int k = s - 2; k >= 0; k--) {
					answer[k + 1] = answer[k];
				}
				answer[0] = arr[i];
			}
			// Cache Hit
			else {
				for(int l = tmp - 1; l >= 0; l--) {
					answer[l + 1] = answer[l];
				}
				answer[0] = arr[i];
			}	
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(s, n, arr)) System.out.print(x + " ");
	}

}
