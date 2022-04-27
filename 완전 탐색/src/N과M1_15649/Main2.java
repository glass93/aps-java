package N°úM1_15649;

import java.util.*;

class Main2 {
	static int n, m;
	static int[] selected, used;
	
	public void rec_func(int k) {
		if(k == m + 1) {
			for(int i = 1; i <= m; i++) System.out.print(selected[i] + " ");
			System.out.println();
		}
		else {
			for(int cand = 1; cand <= n; cand++) {
				if(used[cand] == 1) continue;
				selected[k] = cand;
				used[cand] = 1;
				rec_func(k + 1);
				selected[k] = 0;
				used[cand] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		selected = new int[n + 1];
		used = new int[n + 1];
		T.rec_func(1);
	}

}
