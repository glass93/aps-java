package 최대길이연속부분수열;

import java.util.*;

// 복합적 문제
class Main {
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		int cnt = 0;
		int lt = 0;
		for(int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) cnt++;
			while(cnt > k) {
				if(arr[lt] == 0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt - lt + 1);
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}

}
