package ������ȯ;

import java.util.*;

// �ð��ʰ����� 3������ ���...
// �������� �����ߴ��� ���..
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
