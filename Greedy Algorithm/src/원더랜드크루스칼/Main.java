package 원더랜드크루스칼;

import java.util.*;

// 최소스패닝트리 : 크루스칼, Union&Find 활용
class Edge implements Comparable<Edge> {
	public int v1;
	public int v2;
	public int cost;
	
	Edge(int v1, int v2, int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Edge ob) {
		return this.cost - ob.cost;	// 가중치 값을 오름차순으로 정렬하기 위해
	}
}
class Main {
	static int[] unf;
	
	public static int Find(int v) {
		if(v == unf[v]) return v;
		else return unf[v] = Find(unf[v]);
	}
	
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa != fb) unf[fa] = fb;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		unf = new int[n + 1];
		ArrayList<Edge> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++) unf[i] = i;
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.add(new Edge(a, b, c));
		}
		int answer = 0;
		
		Collections.sort(arr);
		
//		int cnt = 0;	// break를 위한
		for(Edge ob : arr) {
			int fv1 = Find(ob.v1);
			int fv2 = Find(ob.v2);
			if(fv1 != fv2) {
				answer += ob.cost;
//				cnt++;	// 간선의 갯수를 더함
				Union(ob.v1, ob.v2);
			}
//			if(cnt == n - 1) break;
		}
		
		System.out.print(answer);
	}

}
