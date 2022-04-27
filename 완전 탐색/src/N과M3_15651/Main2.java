package N°úM3_15651;

import java.util.*;

class Main2 {
	static int n, m;
	static int[] pm;
	static StringBuilder sb = new StringBuilder();
	
	public void DFS(int L) {
		if(L == m) {
			for(int x : pm) sb.append(x).append(" ");
			sb.append('\n');
		}
		else {
			for(int i = 1; i <= n; i++) {
				pm[L] = i;
				DFS(L + 1);
			}
		}
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pm = new int[m];
		T.DFS(0);
		System.out.println(sb);
	}

}
