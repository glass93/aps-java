package 조합구하기;

import java.util.*;

// 조합은 코드를 외우는 수준으로 연습
class Main {
	static int n, m;
	static int[] combi;
	
	public void DFS(int L, int s) {
		if(L == m) {
			for(int x : combi) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for(int i = s; i <= n; i++) {
				combi[L] = i;
				DFS(L + 1, i + 1);
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		combi = new int[m];
		T.DFS(0, 1);
	}

}
