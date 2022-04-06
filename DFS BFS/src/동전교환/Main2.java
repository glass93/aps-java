package 동전교환;

import java.util.*;

// 중복순열
// 큰 금액부터 적용해서 효율을 높임
class Main2 {
	static int n, m, answer = Integer.MAX_VALUE;
	public void DFS(int L, int sum, Integer[] arr) {
		if(sum > m) return;
		if(L >= answer) return;	// 이 조건이 없으면 시간초과...
		if(sum == m) {
			answer = Math.min(answer, L);
		}
		else {
			for(int i = 0; i < n; i++) {
				DFS(L + 1, sum + arr[i], arr);
			}
		}
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		Integer[] arr= new Integer[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		Arrays.sort(arr, Collections.reverseOrder());
		m = kb.nextInt();
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}

}
