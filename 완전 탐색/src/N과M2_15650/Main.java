package N°úM2_15650;

import java.util.*;

class Main {
	static int n, m;
	static StringBuilder sb = new StringBuilder();
	static int[] pm;
	
	public void DFS(int L) {
		if(L == m + 1) {
			for(int i = 1; i <= m; i++) sb.append(pm[i]).append(' ');
			sb.append('\n');
		}
		else {
			for(int i = pm[L - 1] + 1; i <= n; i++) {
				pm[L] = i;
				DFS(L + 1);
				pm[L] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pm = new int[m + 1];
		T.DFS(1);
		System.out.print(sb);
	}

}
