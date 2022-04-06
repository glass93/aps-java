package 동전교환;

import java.util.*;

// 시간초과나서 3문제만 통과...
// 내림차순 정렬했더니 통과..
class Main {
	static int answer = Integer.MAX_VALUE;
	static int n, m;
	static Integer[] coins;

	public void DFS(int L, int sum) {
		if(sum > m) return;
		if(L > answer) return;
		if(sum == m) {
			answer = Math.min(L, answer);
		}
		else {
			for(int i = 0; i < n; i++) {
				DFS(L + 1, sum + coins[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		coins = new Integer[n];
		for(int i = 0; i < n; i++) coins[i] = kb.nextInt();
		Arrays.sort(coins, Collections.reverseOrder());
		m = kb.nextInt();
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
