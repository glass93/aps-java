package N°úM1_15649;

import java.util.*;

class Main {
	static int n, m;
	static int[] pm, ch;
	static StringBuilder sb = new StringBuilder();
	
	public void DFS(int L) {
		if(L == m) {
			for(int x : pm) sb.append(x).append(" ");
			sb.append('\n');
		}
		else {
			for(int i = 0; i < n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					pm[L] = i + 1;
					DFS(L + 1);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		ch = new int[n];
		pm = new int[m];
		T.DFS(0);
		System.out.print(sb);
	}

}
