package 최대점수구하기;

import java.util.*;

// DFS
class Main {
	static int n, m;
	static int[] ch;
	static int[] times;
	static int[] scores;
	static int answer = 0;
	
	public void DFS(int L) {
		if(L == n) {
			int time = 0;
			int score = 0;
			for(int i = 0; i < n; i++) {
				if(ch[i] == 1) {
					time += times[i];
					score += scores[i];
				}
			}
			if(time <= m && answer < score) answer = score;
		}
		else {
			ch[L] = 1;
			DFS(L + 1);
			ch[L] = 0;
			DFS(L + 1);
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		ch = new int[n];
		times = new int[n];
		scores = new int[n];
		for(int i = 0; i < n; i++) {
			scores[i] = kb.nextInt();
			times[i] = kb.nextInt();
		}
		T.DFS(0);
		System.out.println(answer);
	}

}
