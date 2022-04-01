package 경로탐색;

import java.util.*;

// DFS
// 체크 해제 하는 거 외우기
class Main {
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int i = 1; i <= n; i++) {
				if(graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;	// 체크를 취소
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new int[n + 1][m + 1];
		ch = new int[n + 1];
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph[a][b] = 1;	// 방향 그래프이기 때문에
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
		
	}

}
