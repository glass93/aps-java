package ������ȯ;

import java.util.*;

// ���� �˰���
class Main {
	static int n, m;
	static int[] dy;
	
	public int solution(int[] coins) {
		Arrays.fill(dy, 9999999);	// ū ���ڷ� �迭�� �ʱ�ȭ, Integre.MAX_VALUE�� �ʱ�ȭ�ϴ� ��쿡�� ������ 1�� �ƴϸ� ���䰡�ɼ�
		dy[0] = 0;
		for(int i = 0; i < n; i++) {
			for(int j = coins[i]; j <= m; j++) {
				dy[j] = Math.min(dy[j], dy[j - coins[i]] + 1);
			}
		}
		return dy[m];
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		m = kb.nextInt();
		dy = new int[m + 1];
		System.out.print(T.solution(arr));
	}

}