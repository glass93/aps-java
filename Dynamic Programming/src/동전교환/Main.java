package 동전교환;

import java.util.*;

// 냅색 알고리즘
class Main {
	static int n, m;
	static int[] dy;
	
	public int solution(int[] coins) {
		Arrays.fill(dy, 9999999);	// 큰 숫자로 배열을 초기화, Integre.MAX_VALUE로 초기화하는 경우에는 시작이 1이 아니면 오답가능성
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