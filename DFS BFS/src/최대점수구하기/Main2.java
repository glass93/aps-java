package 최대점수구하기;

import java.util.*;

class Main2 {
	static int n, m;
	static int answer = 0;
	static int[] scores;
	static int[] times;
	
	public void DFS(int L, int time, int score) {
		if(time > m) return;
		if(L == n) {
			if(answer < score) answer = score;
		}
		else {
			DFS(L + 1, time + times[L], score + scores[L]);
			DFS(L + 1, time, score);
		}
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		scores = new int[n];
		times = new int[n];
		for(int i = 0; i < n; i++) {
			scores[i] = kb.nextInt();
			times[i] = kb.nextInt();
		}
		T.DFS(0, 0, 0);
		System.out.println(answer);
	}
}
