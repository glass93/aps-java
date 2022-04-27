package N°úM3_15651;

import java.util.*;

class Main {
	static int n, m;
	static int[] selected;
	static StringBuilder sb = new StringBuilder();
	
	public void rec_func(int k) {
		if(k == m + 1) {
			for(int i = 1; i <= m; i++) {
				sb.append(selected[i]).append(' ');
			}
			sb.append('\n');
		}
		else {
			for(int cand = 1; cand <= n; cand++) {
				selected[k] = cand;
				rec_func(k + 1);
				selected[k] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		selected = new int[m + 1];
		T.rec_func(1);
		System.out.print(sb);
		
	}

}
