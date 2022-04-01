package 경로탐색;

import java.util.*;

// 인접리스트, ArrayList
public class Main2 {
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;	// Integer를 저장하는 ArrayList를 저장하는 ArrayList
	static int[] ch;
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int nv : graph.get(v)) {	// nv: 다음 정점, graph.get(v) v번째 ArrayList
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n + 1];
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);	// a번 ArrayList에 b를 추가
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
