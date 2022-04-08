package 다익스트라알고리즘;

import java.util.*;

class Edge implements Comparable<Edge> {
	public int vex;	// 정점
	public int cost;	// 가중치 값
	Edge(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge ob) {
		return this.cost - ob.cost;	// 우선순위 큐의 정렬 기준, 가장 작은 값으로 poll();
	}
}

class Main {
	static int n, m;
	static ArrayList<ArrayList<Edge>> graph;
	static int[] dis;
	public void solution(int v) {
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		pQ.offer(new Edge(v, 0));
		dis[v] = 0;
		while(!pQ.isEmpty()) {
			Edge tmp = pQ.poll();
			int now = tmp.vex;
			int nowCost = tmp.cost;
			if(nowCost > dis[now]) continue;
			for(Edge ob : graph.get(now)) {
				if(dis[ob.vex] > nowCost + ob.cost) {
					dis[ob.vex] = nowCost + ob.cost;
					pQ.offer(new Edge(ob.vex, nowCost + ob.cost));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new ArrayList<ArrayList<Edge>>();
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Edge>());
		}
		dis = new int[n + 1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge(b, c));
		}
		T.solution(1);
		for(int i = 2; i <= n; i++) {
			if(dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
			else System.out.println(i + " : impossible");
		}
	}

}

//입력예제
//6 9
//1 2 12
//1 3 4
//2 1 2
//2 3 5
//2 5 5
//3 4 5
//4 2 2
//4 5 5
//6 4 5
//
//출력예제
//2 : 11
//3 : 4
//4 : 9
//5 : 14
//6 : impossible